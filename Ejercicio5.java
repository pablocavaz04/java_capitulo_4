/*
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).

 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a: ");
        float a = sc.nextFloat();
        System.out.println("Ahora introduzca el valor de b: ");
        float b = sc.nextFloat();
        System.out.println("x = "+(-b/a));

    }
}
