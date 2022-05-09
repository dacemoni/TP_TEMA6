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
        
    }
    private static void dibujarTabla(){
        System.out.println(color + "*****************************");
        for (int i = 0; i < columnasmax; i++) {

			for (int j = 0; j < filasmax; j++) {

				System.out.printf(tabla[i][j] + "");

			}
			System.out.println();
		}
        System.out.println(TEXT_RESET);

    }

    private static void iniciarTabla() {
        tabla = new char[columnasmax][filasmax];
		for (int i = 0; i < columnasmax; i++) {

			for (int j = 0; j < filasmax; j++) {

				tabla[i][j] = ' ';

			}
		}
    }

    
}
