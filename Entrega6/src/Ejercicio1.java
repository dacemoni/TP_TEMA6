import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void Lanzar(Scanner teclado) {
        System.out.println("Elije primer número para comparar");
        int a = 0;
        int b = 0;
        while (true) {
            try {
                a = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        System.out.println("Elije segundo número para comparar");
        while (true) {
            try {
                b = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        System.out.println("El mayor es: " + devolverMayor(a, b, 0));
    }

    public static int devolverMayor(int a, int b, int menor) {
        if ((menor == a) && (menor == b))
            return 0;

        if (menor == a)
            return b;

        if (menor == b)
            return a;

        return devolverMayor(a, b, menor + 1);
    }
}