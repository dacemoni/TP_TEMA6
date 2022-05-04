import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
static int lista[];
    public static void Lanzar(Scanner teclado) {
       lista= new int[10];
        Random r = new Random(10);
        for (int i = 0; i < lista.length; i++) {
            lista[i] = r.nextInt(20);

        }
        mostrarValores(lista);
    }

    public static void mostrarValores(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("\n");
    }
}