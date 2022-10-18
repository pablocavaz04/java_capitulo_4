/* 
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipoax2 + bx + c = 0).
Author:Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Introduzca el valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Introduzca el valor de c: ");
        double c = sc.nextDouble();

        //Supongamos que todos los valores equivalen a 0
        if ((a==0) && (b==0) && (c==0)){
            System.out.println("Tiene soluciones infinitas");
        } 
        //Supongamos que el valor c es distinito de 0
        else if ((a==0) && (b==0) && (c!=0)) {
            System.out.println("La ecuacion tiene soluciones infinitas");
        }
        //Supongamos que los valores a y b son distinitos de 0
        else if ((a!=0) && (b!=0) && (c==0)){
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }
        //Supongamos que los valores c y b son distintos de 0
        else if((a==0) && (b!=0) && (c!=0)){
            System.out.println("x1 = x2 = " + (-c / b));
        }
        //Supongamos que a b y c son distintos  de 0
        else if((a!=0) && (b!=0) && (c!=0)){
            double discriminante = b*b - (4 * a * c);
            if (discriminante < 0) {
                System.out.println("La ecuación no tiene soluciones reales");
            }  else {
              System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
              System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
            }
        }


    }
}
