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
        moverOveja(2);
        mostrarTabla();
        moverOveja(0);
        mostrarTabla();

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
                
            } else if (tabla.get(siguiente).getSimbolo().equals(">")
                    && tabla.get(++siguiente).getSimbolo().equals(" ")) {
                siguiente++;
                tabla.get(siguiente).setDireccion("derecha");
                oveja.setDireccion("nada");
            }
        }
    }
}
