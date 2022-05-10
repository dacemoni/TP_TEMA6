import java.util.InputMismatchException;
import java.util.Scanner;
//import java.awt.color.Color;

public class Ejercicio5 {
    static char[][] tabla;
    static int columnasmax = 40;
    static int filasmax = 10;
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";
    public static String color = TEXT_RED;//color para probar

    public static void Lanzar(Scanner teclado){

        iniciarTabla();
        dibujarTabla();
        SelectorEj5(teclado);
        
    }

    private static void dibujarTabla(){
        System.out.println(color + "*****************************");
        for (int i = 0; i < filasmax; i++) {

			for (int j = 0; j < columnasmax; j++) {

				System.out.printf(tabla[i][j] + "");

			}
			System.out.println();
		}
        System.out.println(TEXT_RESET);

    }

    private static void iniciarTabla() {
        tabla = new char[filasmax][columnasmax];
		for (int i = 0; i < filasmax; i++) {

			for (int j = 0; j < columnasmax; j++) {

				tabla[i][j] = ' ';

			}
		}
    }
    private static void dibujarCaracter(Scanner teclado) {
        System.out.println("Escribe un caracter");
        char caracter = teclado.next().charAt(0);
        int columna;
        int fila;
        do {
            while (true) {
                try {
                    System.out.println("¿Qué fila?");
                    columna = teclado.nextInt() - 1;

                    break;
                } catch (InputMismatchException r) {
                    teclado.next();
                }
            }
            while (true) {
                System.out.println("¿Que columna?");
                try {
                    fila = teclado.nextInt() - 1;

                    break;
                } catch (InputMismatchException r) {
                    teclado.next();
                }
            }

        } while (columna < 0 || columna > columnasmax || fila < 0 || fila > filasmax);


        tabla[fila][columna] = caracter;
        dibujarTabla();


    }
    private static void dibujarRectangulo(Scanner teclado) {
        System.out.println("Escribe un caracter");
        char caracter = teclado.next().charAt(0);
        int columna;
        int fila;
        int columna2;
        int fila2;
        do {
            while (true) {
                try {
                    System.out.println("¿Qué columna para empezar rectangulo?");
                    columna = teclado.nextInt() - 1;

                    break;
                } catch (InputMismatchException r) {
                    teclado.next();
                }
            }
            while (true) {
                System.out.println("¿Que fila para empezar rectangulo?");
                try {
                    fila = teclado.nextInt() - 1;

                    break;
                } catch (InputMismatchException r) {
                    teclado.next();
                }
            }
            while (true) {
                try {
                    System.out.println("¿Qué columna para terminar el rectangulo?");
                    columna2 = teclado.nextInt() - 1;

                    break;
                } catch (InputMismatchException r) {
                    teclado.next();
                }
            }
            while (true) {
                System.out.println("¿Que fila para terminar el rectangulo?");
                try {
                    fila2 = teclado.nextInt() - 1;

                    break;
                } catch (InputMismatchException r) {
                    teclado.next();
                }
            }
        } while (columna < 0 || columna > columnasmax || fila < 0 || fila > filasmax || columna2 < 0 || columna2 > columnasmax || fila2 < 0 || fila2 > filasmax);

        for (int i = columna; i < columna2; i++) {

			for (int j = fila; j < fila2; j++) {

				tabla[i][j] = caracter;

			}
		}
        dibujarTabla();
        
    }

    private static void selectorColor(Scanner teclado){
        System.out.println("Seleccione color: ");
        System.out.println("1. Rojo");
        System.out.println("2. Verde");
        System.out.println("3. Amarillo");
        System.out.println("4. Azul");
        System.out.println("5. Violeta");
        System.out.println("6. Cyan");
        System.out.println("7. Blanco");
        System.out.println("8. Negro");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                color = TEXT_RED;
                break;
            case 2:
                color = TEXT_GREEN;
                break;
            case 3:
                color = TEXT_YELLOW;
                break;
            case 4:
                color = TEXT_BLUE;
                break;
            case 5:
                color = TEXT_PURPLE;
                break;
            case 6:
                color = TEXT_CYAN;
                break;
            case 7:
                color = TEXT_WHITE;
                break;
            case 8:
                color = TEXT_BLACK;
                break;

        }

    
    }//fin selector color
    public static void SelectorEj5(Scanner teclado) {
        int eleccion = 0;
        while (true) {

            System.out.println("1: Dibujar tabla");
            System.out.println("2: Cambiar color");
            System.out.println("3: Dibujar un caracter");
            System.out.println("4: Dibujar un rectangulo de caracteres");
            System.out.println("5: Salir");

            try {
                eleccion = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            switch (eleccion) {
                case 1:
                    dibujarTabla();

                    break;
                case 2:
                    selectorColor(teclado);
                    break;
                case 3:
                    dibujarCaracter(teclado);
                    break;
                case 4:
                    dibujarRectangulo(teclado);
                    break;
                case 5:
                    System.exit(0);

                default:
                    break;
            }
        }
    }
}

