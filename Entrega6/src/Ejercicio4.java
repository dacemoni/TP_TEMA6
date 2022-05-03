import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static ArrayList<String> ovejas;

    public static void Lanzar(Scanner teclado) {
        ovejas = new ArrayList<>();
        rellenarArray();
        while (true) {
            mostrarArray();
            System.out.println("Elije que oveja mover");
            int eleccion = -1;
            while (eleccion > 6 || eleccion < 0) {
                try {
                    eleccion = teclado.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un valor válido que esté dentro de los límites");
                    teclado.next();
                }
            }
            movimiento(eleccion);

        }

    }

    public static void rellenarArray() {
        for (int i = 0; i < 7; i++) {
            if (i < 3) {
                ovejas.add(">");
            } else if (i > 3) {
                ovejas.add("<");
            } else {
                ovejas.add(3, "");
            }

        }
    }

    public static void mostrarArray() {
        for (int i = 0; i < ovejas.size(); i++) {

            System.out.print(" | " + ovejas.get(i));

        }
        System.out.print(" |");
    }

    public static void movimiento(int a) {
        int siguiente = a++;
        int anterior = a--;
        if (ovejas.get(a)==">") {
            if (ovejas.get(a++).equals("")) {
                ovejas.set(a++, ">");
                ovejas.set(a, "");
            }
            if (ovejas.get(a++).equals(">") || ovejas.get(a++).equals("<")) {
                if (ovejas.get(siguiente++).equals("")) {
                    ovejas.set(siguiente++, ">");
                    ovejas.set(a, "");
                }
            }
        } else if (ovejas.get(a).equals("<")) {
            if (ovejas.get(a--).equals("")) {
                ovejas.set(a--, "<");
                ovejas.set(a, "");
            }
            if (ovejas.get(a--).equals(">") || ovejas.get(a++).equals("<")) {
                if (ovejas.get(anterior--).equals("")) {
                    ovejas.set(anterior--, "<");
                    ovejas.set(a, "");
                }
            }
        }

    }
}
