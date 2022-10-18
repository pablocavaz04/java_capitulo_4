/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2
Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        double h = sc.nextFloat();

        final double g = 9.81;//Estas variables que son constantes se declaran poniendo final al principio
        double formula = Math.sqrt(2*h/g);

        System.out.println("El obejeto tardará en caer : "+formula);

    }
}
