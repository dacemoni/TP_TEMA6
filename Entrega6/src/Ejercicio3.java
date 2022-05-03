import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    static int lista[];

    public static void Lanzar(Scanner teclado) {
        crearTabla(5, 10);
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    public static void crearTabla(int minimo, int maximo) {
        lista = new int[10];
        Random r = new Random();

        for (int i = 0; i < lista.length; i++) {
            int n = r.nextInt(maximo) + minimo;
            lista[i] = n;
        }
    }
}
