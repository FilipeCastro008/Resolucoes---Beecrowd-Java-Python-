import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); 
        int maior = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        maior = (a + b + Math.abs(a-b)) / 2;        
        maior = (maior + c + Math.abs(maior-c)) / 2;
        System.out.println(maior + " eh o maior");
        sc.close();
    }
 
}