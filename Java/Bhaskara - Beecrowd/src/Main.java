import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args)throws Exception{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double resul = 0, r1 = 0, r2 = 0;
        
        resul = Math.pow(b,2) - (4 * a * c); 
        
        if ((resul < 0) || (a == 0)){
            System.out.println("Impossivel calcular");
        }
        else{
           r1 = (-1 * b + Math.sqrt(resul)) / (2 * a); 
           r2 = (-1 * b - Math.sqrt(resul)) / (2 * a);
           System.out.printf("R1 = %.5f%nR2 = %.5f%n", r1 ,r2);
        }
        sc.close();
    }
}