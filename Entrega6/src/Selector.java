
import java.util.InputMismatchException;
import java.util.Scanner;

public class Selector {
    public static void Elegir(Scanner teclado) {
        int eleccion = 0;
        while (true) {
            System.out.println("1: Ejercicio 1 (Número mayor)");
            System.out.println("2: Ejercicio 2 (Barcos II)");
            System.out.println("2: Ejercicio 3 (Tabla y funciones)");
            System.out.println("2: Ejercicio 4 (Ovejas)");
            System.out.println("2: Ejercicio 2 (ASCII)");

            try {
                eleccion = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            switch (eleccion) {
                case 1:
                    
                    break;
                case 2:
                   
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    break;
            }
        }
    }
}