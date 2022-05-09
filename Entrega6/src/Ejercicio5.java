import java.util.Scanner;

public class Ejercicio5 {
    static char[][] tabla;
    static int columnasmax = 40;
    static int filasmax = 10;
    public static void Lanzar(Scanner teclado){
        
    }
    private static void dibujarTabla(){
        for (int i = 0; i < columnasmax; i++) {

			for (int j = 0; j < filasmax; j++) {

				System.out.printf(tabla[i][j] + "");

			}
			System.out.println();
		}

    }
}
