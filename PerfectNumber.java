import java.util.Scanner;

// Klasa qe permban logjiken e numrit
class PerfectNumber { 
 
    private int number; 
    private int numberOfDigits; 
    private int sumOfDigits; 
 
    // Konstruktori pa parametra
    public PerfectNumber() { 
    } 
 
    // Konstruktori me parameter
    public PerfectNumber(int number) { 
        this.number = number; 
    } 
 
    // Metoda qe kontrollon nese numri eshte "perfect" sipas kushtit (shuma plotpjestohet me 5)
    public String isPerfectNumberAsInt() { 
        calculateNumberOfDigits(); 
        calculateSumOfDigits(); 
         
        return (this.sumOfDigits % 5 == 0) ? "Po, eshte nje numer perfekt. :)" : 
                                            "Jo, nuk eshte nje numer perfekt! >:("; 
    } 
 
    // Metoda per llogaritjen e numrit te shifrave
    private void calculateNumberOfDigits() { 
        // Konverton numrin ne String per te gjetur gjatesine
        this.numberOfDigits = String.valueOf(number).length(); 
    } 
 
    // Metoda per llogaritjen e shumes se shifrave
    private void calculateSumOfDigits() { 
        int acc = 0; 
        int temp = number; 
 
        while (temp > 0) { 
            acc += temp % 10; // Shton shifren e fundit
            temp /= 10;       // Heq shifren e fundit
        } 
 
        this.sumOfDigits = acc; 
    } 
} 
 
// Klasa kryesore per ekzekutimin e programit
public class PerfectNumberApp { 
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in); 
 
        System.out.print("Jepni nje numer: "); 
        int num = s.nextInt(); // Leximi i numrit nga tastiera
 
        PerfectNumber myPerfectNumber = new PerfectNumber(num); 
 
        // Afishimi i rezultatit
        System.out.println(myPerfectNumber.isPerfectNumberAsInt()); 
        
        s.close(); // Mbyllja e scanner-it
    } 
}