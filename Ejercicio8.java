/*
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la 1ª nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Introduzca la 2ª nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Introduzca la 3ª nota: ");
        float nota3 = sc.nextFloat();

        double media = (nota1+nota2+nota3)/3;

        if (media<5) {
            System.out.println("Tu media total es : "+media);
            System.out.println("----------------------");
            System.out.println("  INSUFICIENTE  ");
        } else if (media==5){
            System.out.println("Tu media total es : "+media);
            System.out.println("----------------------");
            System.out.println("  SUFICIENTE  ");
        } else if (media==6){
            System.out.println("Tu media total es : "+media);
            System.out.println("----------------------");
            System.out.println("        BIEN  ");
        } else if (media==7 || media==9){
            System.out.println("Tu media total es : "+media);
            System.out.println("----------------------");
            System.out.println("        NOTABLE  ");
        } else {
            System.out.println("Tu media total es : "+media);
            System.out.println("----------------------");
            System.out.println("     SOBRESALIENTE  ");
        }

    }
}