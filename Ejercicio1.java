/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora de cada día
 * 
 * Author: Pablo Camino Vázquez
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un día de la semana: ");
        String dia = sc.next();

        switch (dia){
            case "Lunes":
            System.out.println("A primera hora tienes: Programación");
            break;

            case "Martes":
            System.out.println("A primera hora tienes: Sistemas");
            break;
            
            case "Miercoles":
            System.out.println("A primera hora tienes: Entorno");
            break;

            case "Jueves":
            System.out.println("A primera hora tienes: Programacion");
            break;

            case "Viernes":
            System.out.println("A primera hora tienes: Libre");
            break;

            case "Sabado":
            System.out.println("A primera hora tienes: No tienes clases <3");
            break;

            case "Domingo":
            System.out.println("No tienes clases <3");
            break;

            default:
            System.out.println("Introduce un dia de nuestro mundo");
        }

    }
}