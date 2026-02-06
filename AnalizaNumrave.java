import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.FileNotFoundException; 
import java.io.IOException; 

// Emri i klases (Duhet te jete i njejte me emrin e fajllit)
public class AnalizaNumrave { 

    public static void main(String[] args) { 
        BufferedReader in = null; 
        
        // Path-i i skedarit (ndryshoje sipas nevojes)
        String skedari = "C:/Users/muham/Desktop/Numrat.txt"; 
        
        int sum = 0; 
        int count = 0; 

        try { 
            in = new BufferedReader(new FileReader(skedari)); 
            String rreshti; 

            while ((rreshti = in.readLine()) != null) { 
                // Ndarja e numrave nese ka hapesira
                String[] varguNumrave = rreshti.split(" ");  

                for (String n : varguNumrave) { 
                    if (!n.trim().isEmpty()) { 
                        sum += Integer.parseInt(n.trim());  
                        count++;  
                    }
                } 
            } 

            System.out.println("Statistikat e skedarit:");
            System.out.println("-----------------------");
            System.out.println("Shuma totale: " + sum); 

            if (count > 0) { 
                double mesatarja = (double) sum / count; 
                System.out.println("Mesatarja: " + mesatarja); 
                System.out.println("Sasia e numrave: " + count);
            } else { 
                System.out.println("Nuk u gjeten numra ne skedar."); 
            } 

        } catch (FileNotFoundException e) { 
            System.out.println("Gabim: Skedari nuk u gjet ne path-in e dhene."); 
        } catch (IOException e) { 
            System.out.println("Gabim gjate leximit te skedarit: " + e.getMessage()); 
        } catch (NumberFormatException e) {
            System.out.println("Gabim: Skedari permban karaktere qe nuk jane numra!");
        } finally { 
            try { 
                if (in != null) { 
                    in.close(); 
                } 
            } catch (IOException e) { 
                System.out.println("Gabim gjate mbylljes: " + e.getMessage()); 
            } 
        } 
    } 
}