import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String nome = sc.next();
        double salFix = sc.nextDouble();
        double vendas = sc.nextDouble();
        
        double total = salFix + (vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", total);
        
        sc.close();
    }
 
}