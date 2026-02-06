// Klasa Libri qe sherben si model per objektet
class Libri { 
    // Atributet
    private String autori; 
    private String publikuesi; 
    private int numriFaqeve; 
    private String kategoria; 
 
    // Konstruktori per inicializimin e vlerave
    public Libri(String a, String p, int nrF, String k) { 
        autori = a; 
        publikuesi = p; 
        numriFaqeve = nrF; 
        kategoria = k; 
    } 
 
    // Metoda per llogaritjen e cmimit bazuar ne faqet
    public double llogaritCmimin() { 
        return (5 + (0.03 * numriFaqeve)); 
    } 
 
    // Metoda per te nxjerre inicialet e autorit
    public void shtypInicialet() { 
        int i = autori.indexOf(" "); 
        if (i != -1) {
            System.out.println("Inicialet: " + autori.charAt(0) + "." + autori.charAt(i + 1) + ".");
        } else {
            System.out.println("Inicialet: " + autori.charAt(0) + ".");
        }
    } 
    
    // Metoda per te kthyer te dhenat ne format teksti
    @Override
    public String toString() { 
        return "Autori: " + autori + "\nPublikuesi: " + 
               publikuesi + "\nNumri i faqeve: " + numriFaqeve + 
               "\nKategoria: " + kategoria; 
    } 
} 
 
// Klasa kryesore ku ekzekutohet programi
public class LibriApp { 
    public static void main(String[] args) { 
        // Krijimi i nje objekti te ri
        Libri lib = new Libri("Ismail Kadare", "Onufri", 336, "Roman"); 
        
        // Thirrja e metodave dhe afishimi i rezultateve
        System.out.println(lib.toString()); 
        System.out.println("Cmimi i librit: " + lib.llogaritCmimin()); 
        lib.shtypInicialet(); 
    } 
}