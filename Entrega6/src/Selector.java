
import java.util.InputMismatchException;
import java.util.Scanner;

public class Selector {
    public static void Elegir(Scanner teclado) {
        int eleccion = 0;
        while (true) {
            System.out.println("1: Ejercicio 1 (Número mayor)");
            System.out.println("2: Ejercicio 2 (Barcos II)");
            System.out.println("3: Ejercicio 3 (Tabla y funciones)");
            System.out.println("4: Ejercicio 4 (Ovejas)");
            System.out.println("5: Ejercicio 5 (ASCII)");
            System.out.println("6: Salir");

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
                    case 5: System.exit(0);

                default:
                    break;
            }
        }
    }
}