import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	static char[][] tabla;
	static int i_obj;
	static int j_obj;
	static int columna;
	static int fila;

	public static void Lanzar(Scanner teclado) {
		iniciarTabla();
		Imprimirtabla();
		Disparar(teclado);
	}

private static int introducirEnteroEntreLimites(Scanner teclado, int min, int max) {
	int numero;
	do {
		System.out.println("introducir numero entre " + min + " y " + max);
		numero = teclado.nextInt() -1;
		
		}while(numero < min || numero > max);
		return numero;
	}



	public static void iniciarTabla() {
		Random r = new Random();
		//i_obj = r.nextInt(3)+1;
		//j_obj = r.nextInt(3)+1;
		i_obj = r.nextInt(4);
		j_obj = r.nextInt(4);
		columna = -1;
		fila = -1;

		tabla = new char[4][4];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				tabla[i][j] = '?';

			}
		}
	}

	private static void Imprimirtabla() {

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.printf(tabla[i][j] + "");

			}
			System.out.println();
		}

	}

/*	public static boolean IntroducirEnteroEntreLimites(int fila, int columna) {
		return fila >= 0 && fila <= 4 && columna >= 0 && columna <= 4;
	}*/

	public static void Disparar(Scanner teclado) {
		do {
			//debug
			//System.out.println("i_obj: " + (i_obj+1));
			//System.out.println("j_obj: " + (j_obj+1));
			//fin debug
			int columna = 0;
			int fila = 0;

				while (true) {
					try {
						System.out.println("¿Qué fila?");
						//columna = teclado.nextInt() - 1;
						columna = introducirEnteroEntreLimites(teclado, 0, 4);
						break;
					} catch (InputMismatchException r) {
						teclado.next();
					}
				}
				while (true) {
					System.out.println("¿Que columna?");
					try {
						//fila = teclado.nextInt() - 1;
						fila = introducirEnteroEntreLimites(teclado, 0, 4);
						break;
					} catch (InputMismatchException r) {
						teclado.next();
					}
				}


			if (columna != i_obj || fila != j_obj) {
				tabla[columna][fila] = '~';
				System.out.println("Agua");
				Imprimirtabla();
			}


		if(columna == i_obj && fila == j_obj) {
			break;
		}

		} while (!(columna == i_obj && fila == j_obj));//porque no funciona!?

		//System.out.println("Disparado a la posicion: " + (columna+1)+ "," + (fila+1));

		tabla[i_obj][j_obj] = 'x';
		Imprimirtabla();
		System.out.println("Tocado y hundido");
		System.out.println("Ha ganado");
	}
}
