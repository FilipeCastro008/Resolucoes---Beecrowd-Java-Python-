import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double salPorHoraTrab = 0.0, sal = 0.0;
        int num = 0, horasTrab = 0;
       
        num = sc.nextInt();
        horasTrab = sc.nextInt();
        salPorHoraTrab = sc.nextDouble();
        sal = salPorHoraTrab * horasTrab;
        System.out.printf("NUMBER = %d%n", num); 
        System.out.printf("SALARY = U$ %.2f%n", sal);
      
        sc.close();
    }
 
}