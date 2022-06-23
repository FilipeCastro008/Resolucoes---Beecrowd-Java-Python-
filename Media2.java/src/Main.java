import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double a = 0.0, b = 0.0, c = 0.0, media = 0.0;
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        media = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5); 
        System.out.printf("MEDIA = %.1f%n", media); 
    
        sc.close();
    }
 
}