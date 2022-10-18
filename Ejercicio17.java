import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero = sc.nextInt();
        System.out.println("La ultima cifra del numero introducido es : "+(numero%10));
    }
}
