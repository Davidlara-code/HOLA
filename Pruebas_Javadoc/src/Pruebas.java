import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * 
 * Esta clase implementar� todos los m�todos que est�n relacionados con la resta
 * de la calculadora.
 * 
 * @author: David lara gonzalez
 * 
 * @version: 03/02/2021
 * 
 */
public class Pruebas {

	

	public static void main(String[] args) {

		// Ejercicio 1 de la resta
		/**
		 * 
		 * Constructor para los ejercicios de RESTA
		 * 
		 * @param numero1 primer numero ha restar
		 * 
		 * @param numero2 segundo numero ha restar
		 * 
		 * @param resultado  resultado define la solucion a la resta de dos
		 *                numeros reales define
		 *                       la solucion a la resta de dos numeros enteros(numero1 -
		 *                       numero2).
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		double numero1, numero2, resultado;
		System.out.print("Introduce primer n�mero: ");
		numero1 = sc.nextInt();
		System.out.print("Introduce segundo n�mero: ");
		numero2 = sc.nextInt();
		resultado = restar1(numero1, numero2);
		System.out.println("resta de dos numeros reales: " + resultado);

		// ejercicio 2 de la resta

		/**
		 * 
		 * Constructor para los ejercicios de RESTA
		 * 
		 * @param numero3 primer numero ha restar
		 * @param numero4 segundo numero ha restar
		 * @param resultad El par�metro resultad define
		 *                       la solucion a la resta de dos numeros enteros(numero3 -
		 *                       numero4).
		 * 
		 */
		int numero3, numero4, resultad;
		System.out.print("Introduce primer n�mero: ");
		numero3 = sc.nextInt();
		System.out.print("Introduce segundo n�mero: ");
		numero4 = sc.nextInt();
		resultad = resta2(numero3, numero4);
		System.out.println("resta de dos numeros enteros: " + resultad);

		// ejercicio 3 de la resta
		/**
		 * 
		 * Constructor para los ejercicios de RESTA
		 * 
		 * @param numero5,@param numero6,@param resulta,@param tercerNumero: El
		 *                       par�metro resulta define la solucion a la resta de tres
		 *                       numeros enteros(numero5 - numero6 - tercerNumero).
		 * 
		 * 
		 */
		int tercerNumero;
		int numero5, numero6, resulta;
		System.out.print("Introduce primer n�mero: ");
		numero5 = sc.nextInt();
		System.out.print("Introduce segundo n�mero: ");
		numero6 = sc.nextInt();
		System.out.print("Introduce tercer n�mero: ");
		tercerNumero = sc.nextInt();
		resulta = resta3(numero5, numero6, tercerNumero);
		System.out.println("resta de tres numeros enteros: " + resulta);

		// ejercicio 4 de la resta

		/**
		 * 
		 * Constructor para los ejercicios de RESTA
		 * 
		 * @param numero7 variable que utilizo.
		 * 
		 * @param numero8 variable que utilizo.
		 * 
		 * @param result El par�metro result define la
		 *                       solucion a la resta de dos numeros enteros con el valor
		 *                       acumulado.
		 * 
		 * 
		 */

		int numero7, numero8, result;
		System.out.print("Introduce primer n�mero: ");
		numero7 = sc.nextInt();
		System.out.print("Introduce segundo n�mero: ");
		numero8 = sc.nextInt();
		result = valorAcumulado(numero7, numero8);
		System.out.println("resta del valor acumulado: " + result);

	}

// cerramos el constructor

	// m�todo Resta de dos n�meros reales Ejercicio 1

	/**
	 * 
	 * M�todo que devuelve la resta de numeros reales
	 * 
	 * @param a variable que utilizo.
	 * 
	 * @param b variable que utilizo.
	 * 
	 * 
	 * @return c devuelve el resultado de la resta.
	 * 
	 */

	public static double restar1(double a, double b) {
		double c;
		c = a - b;
		return c;

	}

	// metodo resta de dos numeros enteros Ejercicio2

	/**
	 * 
	 * M�todo que devuelve la resta de numeros reales
	 * 
	 * @param d variable que utilizo.
	 * 
	 * @param e variable que utilizo.
	 * 
	 * @return f 
	 *  variable que utilizo donde acumulo el resultado de la resta.
	 * 
	 * 
	 */
	public static int resta2(int d, int e) {
		int f;
		f = d - e;
		return f;
	}

	// metodo resta de tres numeros reales Ejercicio3

	/**
	 * 
	 * M�todo que devuelve la resta de tres numeros reales.
	 * 
	 * @param g variable que utilizo.
	 * 
	 * @param h variable que utilizo. 
	 * 
	 * @param v variable que utilizo.
	 * 
	 * 
	 * @return i devuelve el resultado de la resta.
	 * 
	 */
	public static int resta3(int g, int h, int v) {
		int i;
		i = g - h - v;
		return i;
	}

	// metodo resta de dos numeros enteros acumulados Ejercicio4

	/**
	 * 
	 * M�todo que devuelve la resta de dos numeros reales acumulados.
	 * 
	 * @param q  variable que utilizo.
	 *  
	 * @param w  variable que utilizo.
	 *  
	 * 
	 * @return t El resultado de la resta.
	 * 
	 */

	public static int valorAcumulado(int q, int w) {

		int t;

		t = q - w;
		return t;
	}

}