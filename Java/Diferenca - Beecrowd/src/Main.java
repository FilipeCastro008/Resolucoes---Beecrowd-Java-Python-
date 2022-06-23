import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int a = 0, b = 0, c = 0, d = 0, total = 0;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        total = a * b - c * d;
        System.out.printf("DIFERENCA = %d%n", total); 
        
        sc.close();
    }
 
}