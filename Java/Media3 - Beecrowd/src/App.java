import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class App {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double nota_Exame = 0;
        double media = 0;
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        
        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        if (media >= 7.0){
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno aprovado."); 
        }
        else if (media < 5.0){
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno reprovado."); 
        }
        else if (media >= 5.0 && media <= 6.9){
            nota_Exame = sc.nextDouble();
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno em exame."); 
            System.out.println("Nota do exame: " + df.format(nota_Exame));
            
            nota_Exame = (nota_Exame + media) / 2;
            System.out.println((nota_Exame >= 5.0)? "Aluno aprovado." + "\n" + "Media final: " + df.format(nota_Exame): "Aluno reprovado."+ "\n" +
            "Media final: " + df.format(nota_Exame));
        }
        sc.close();
       
        
 
    }
 
}