import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    static ArrayList<String> ovejas;

    public static void Lanzar(Scanner teclado) {
        ovejas = new ArrayList<>();
        rellenarArray();
        while(true){
            mostrarArray();
        }
        

    }

    public static void rellenarArray() {
        for (int i = 0; i < 7; i++) {
            if (i < 3) {
                ovejas.add(">");
            } else if (i > 3) {
                ovejas.add("<");
            } else {
                ovejas.add(3, " ");
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
        if (ovejas.get(a).equals(">")) {
            if (ovejas.get(a++).equals("")) {
                ovejas.set(a++, ">");
            }
        }

    }
}
