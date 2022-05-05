import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    static int lista[];
    static Random r;

    public static void Lanzar(Scanner teclado) {
        int maximo = 0;
        int minimo = 0;
        while (true) {
            System.out.println("Introduce un valor mínimo");
            try {
                minimo = teclado.nextInt();
                break;
            } catch (InputMismatchException r) {
                teclado.next();
            }
        }
        while (true) {
            System.out.println("Introduce un valor maximo");
            try {
                maximo = teclado.nextInt()+1;
                break;
            } catch (InputMismatchException r) {
                teclado.next();
            }
        }
        crearValores(minimo, maximo);
        mostrarValores(lista);
    }

    public static void mostrarValores(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("\n");
    }

    public static void crearValores(int minimo, int maximo) {

        lista = new int[10];
        r = new Random();
        int a = minimo - 1;
        for (int i = 0; i < lista.length; i++) {
            while (a < minimo) {
                a = r.nextInt(maximo);
            }
            lista[i] = a;
            a = minimo - 1;
        }

    }
}
