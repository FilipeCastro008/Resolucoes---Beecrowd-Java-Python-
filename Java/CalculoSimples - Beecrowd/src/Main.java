import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);   
        Locale.setDefault(Locale.US);
        
        int cod = sc.nextInt(), num = sc.nextInt();
        double value = sc.nextDouble();
        
        int cod2 = sc.nextInt(), num2 =sc.nextInt();
        double valu = sc.nextDouble();
    
        double total = num * value + num2 * valu; 
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        
        sc.close();
    }
 
}