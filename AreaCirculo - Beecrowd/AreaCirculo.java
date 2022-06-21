import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
 
    public static void main(String[] args) throws IOException {
        double r = 0.0, area = 0.0, n = 3.14159;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        r = sc.nextDouble();
        area = n * (r*r);
        System.out.printf("A=%.4f%n", area);
        
        sc.close();
    }
 
}
