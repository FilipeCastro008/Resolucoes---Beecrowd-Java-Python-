import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
    
        double valor = sc.nextDouble();
    
        if (valor >= 0 && valor <= 25.0000){
            System.out.println("Intervalo [0,25]");
        }
        else if (valor >= 25.00001 && valor <= 50.0000000){
            System.out.println("Intervalo (25,50]");
        }
        else if (valor >= 50.0000001 && valor <= 75.0000000){
            System.out.println("Intervalo (50,75]");
        }
        else if (valor >= 75.0000001 && valor <= 100.00000000){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }
}  