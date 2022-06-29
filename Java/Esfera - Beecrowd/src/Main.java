import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159, r = sc.nextDouble(), volume = 0.0;
        
        volume = 4.0/3 * pi * Math.pow(r, 3); 
        System.out.printf("VOLUME = %.3f%n", volume);
        
        sc.close();
    }
 
}