import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    static ArrayList<Oveja> tabla;

    public static void Lanzar(Scanner teclado) {
        tabla = new ArrayList<>();
        iniciarTabla();
        mostrarTabla();
        int opcion = 0;
        while (opcion != -1) {
            System.out.println("Elije que oveja mover (-1 para salir)");
            try {
                opcion = teclado.nextInt();
                if (opcion >= 0 && opcion < 7) {
                    moverOveja(opcion);
                    mostrarTabla();
                }
            } catch (InputMismatchException e) {
                teclado.next();
            }

        }
    }

    public static void iniciarTabla() {
        for (int i = 0; i < 7; i++) {
            if (i < 3) {
                tabla.add(i, new Oveja("derecha"));
            } else if (i > 3) {
                tabla.add(i, new Oveja("izquierda"));

            } else {
                tabla.add(i, new Oveja(""));
            }

        }

    }

    public static void mostrarTabla() {
        System.out.println("\n");
        System.out.print("|");
        for (int i = 0; i < tabla.size(); i++) {
            System.out.print(tabla.get(i).getSimbolo() + "|");

        }
        System.out.print("\n 0 1 2 3 4 5 6");
        System.out.println("\n");
    }

    public static void moverOveja(int posicion) {
        Oveja oveja = tabla.get(posicion);
        int siguiente = 0;
        if (oveja.getDireccion().equals("derecha")) {
            siguiente = posicion + 1;
            if (tabla.get(siguiente).getSimbolo().equals(" ")) {
                tabla.get(siguiente).setDireccion("derecha");
                oveja.setDireccion("nada");

            } else if (!tabla.get(siguiente).getSimbolo().equals(" ")
                    && tabla.get(siguiente + 1).getSimbolo().equals(" ")) {
                siguiente++;
                tabla.get(siguiente).setDireccion("derecha");
                oveja.setDireccion("nada");
            }
        } else if (oveja.getDireccion().equals("izquierda")) {
            siguiente = posicion - 1;
            if (tabla.get(siguiente).getSimbolo().equals(" ")) {
                tabla.get(siguiente).setDireccion("izquierda");
                oveja.setDireccion("nada");
            } else if (!tabla.get(siguiente).getSimbolo().equals(" ")
                    && tabla.get(siguiente - 1).getSimbolo().equals(" ")) {
                siguiente--;
                tabla.get(siguiente).setDireccion("izquierda");
                oveja.setDireccion("nada");
            }
        }
    }
}
