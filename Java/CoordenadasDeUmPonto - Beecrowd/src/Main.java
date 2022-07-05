import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        
        if (p1 < 0.0 && p2 < 0.0){
            System.out.println("Q3");
        }
        else if (p1 > 0.0 && p2 > 0.0){
            System.out.println("Q1");
        }
        else if (p1 < 0.0 && p2 > 0.0){
            System.out.println("Q2");
        }
        else if (p1 > 0.0 && p2 < 0.0){
            System.out.println("Q4");
        }
        else if (p1 == 0 && p2 != 0){
           System.out.println("Eixo Y");
        }
        else if (p2 == 0 && p1 != 0){
            System.out.println("Eixo X");
        }
        else{
            System.out.println("Origem");
        }
        sc.close();
    }
 
}