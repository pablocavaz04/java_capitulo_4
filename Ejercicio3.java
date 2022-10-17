/*
Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero para saber el dia de la semana: ");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
            System.out.println("Lunes");
            break;

            case 2:
            System.out.println("Martes");
            break;
            
            case 3:
            System.out.println("Miercoles");
            break;

            case 4:
            System.out.println("Jueves");
            break;

            case 5:
            System.out.println("Viernes");
            break;

            case 6:
            System.out.println("Sabado");
            break;

            case 7:
            System.out.println("Domingo");
            break;

            default:
            System.out.println("No hay mas dia guapeton");
        }

    }
}