import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void Lanzar(Scanner teclado) {
        int eleccion = 0;
        while (eleccion != 3) {
            System.out.println("1: Primera Función");
            System.out.println("2: Segunda Función");
            System.out.println("3: Salir");
            try {

                eleccion = teclado.nextInt();
            } catch (InputMismatchException r) {
                teclado.next();
            }
            switch (eleccion) {
                case 1:

                    primeraFuncion(teclado);
                    System.out.println("---------------");
                    break;
                case 2:

                    segundaFuncion(teclado);
                    System.out.println("---------------");
                    break;
                case 3:
                    System.out.println("\n Saliendo... \n");
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public static int devolverMayor1(int a, int b, int menor) {
        if ((menor == a) && (menor == b))
            return 0;

        if (menor == a)
            return b;

        if (menor == b)
            return a;

        return devolverMayor1(a, b, menor + 1);
    }

    public static int devolverMayor2(int a, int b, int menor) {
        if ((menor == a) && (menor == b))
            return 0;

        if (menor == a)
            return -1;

        if (menor == b)
            return 1;

        return devolverMayor2(a, b, menor + 1);
    }

    public static void primeraFuncion(Scanner teclado) {
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
        System.out.println("El mayor es: " + devolverMayor1(a, b, 0));
    }

    public static void segundaFuncion(Scanner teclado) {
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
        System.out.println(devolverMayor2(a, b, 0));
    }
}