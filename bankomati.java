import java.util.*;  
  public class bankomati  {  
    public static void main(String args[] )  {  
        int bilanci = 3000, tërheqja, depozita;  
          Scanner sc = new Scanner(System.in);  
        while(true) {  
            System.out.println("Mirësevini në Muki Bankomat! :)"); 
            System.out.println("==============================");
            System.out.println("Zgjedhni 1 për Tërheqje");  
            System.out.println("Zgjedhni 2 për Depozitë");  
            System.out.println("Zgjedhni 3 për të parë Bilancin");  
            System.out.println("Zgjedhni 4 për DALJE");
            System.out.println("------------------------------");
            System.out.print("Zgjedhni operatorin për shërbim: ");    
            int choice = sc.nextInt();  
            switch(choice) {  
                case 1:
        System.out.println("==============================");
        System.out.print("Zgjedhni shumën për tërheqjen e lekëve: ");  
        tërheqja = sc.nextInt();    
        if(bilanci >= tërheqja) {    
            bilanci = bilanci - tërheqja; 
            System.out.println("------------------------------");
            System.out.println("Ju lutem merrni lekët! :)"); }  
        else {  
        	System.out.println("------------------------------");
            System.out.println("BILANCI I PAMJAFTUESHËM! JU LUTEM ZGJEDHNI SHUMË TJETËR! :("); }  
        System.out.println("");  
        break;  
                case 2:
        System.out.println("==============================");        	
        System.out.print("Zgjedhni shumën e lekëve për depozitë: ");   
        depozita = sc.nextInt();    
        bilanci = bilanci + depozita;
        System.out.println("------------------------------");
        System.out.println("Lekët tuaja janë depozituar me sukses! :)");  
        System.out.println("");  
        break;  
                case 3:
        System.out.println("==============================");
        System.out.println("Gjendja e llogarisë: "+ bilanci);  
        System.out.println("");  
        break;  
                case 4:
        System.out.println("==============================");
        System.out.println("JU FALEMINDERIT QË ERDHËT! KALONI BUKUR! :)");
        System.exit(0);  
            }  
        }  
    }  
}  