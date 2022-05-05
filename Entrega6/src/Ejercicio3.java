import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    static int lista[];
    static Random r;

    public static void Lanzar(Scanner teclado) {
        int maximo = 0;
        while (true) {
            System.out.println("Introduce un valor máximo");
            try {
                maximo = teclado.nextInt();
                break;
            } catch (InputMismatchException r) {
                teclado.next();
            }
        }
        crearValores(maximo);
        mostrarValores(lista);
    }

    public static void mostrarValores(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("\n");
    }

    public static void crearValores(int maximo) {

        lista = new int[10];
        r = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = r.nextInt(maximo);

        }
    }
}