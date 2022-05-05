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
    }

    public static void iniciarTabla() {
        for (int i = 0; i < 8; i++) {
            tabla.add(i, new Oveja(i));
        }
        tabla.remove(3);
    }

    public static void mostrarTabla() {
        for (int i = 0; i < tabla.size(); i++) {
            System.out.print("|" + tabla.get(i).getDireccion());
        }
    }
}
