package fatorial;

import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		niam();
	}
	public static void niam() {
		
	
		Scanner input = new Scanner(System.in);

		int banco;
		do {
			System.out.println("qual e o numero pra calculo");
			int bamcoDdados = input.nextInt();

			int resultado = calcularofatorial(bamcoDdados);
			System.out.println("fatorial de " + bamcoDdados + " = " + resultado);

			System.out.println("digite 1 pra continuar e 0 pra parar");
			banco = input.nextInt();
		} while (banco == 1);
	}

	private static int calcularofatorial(int n) {
		int fatorial = 1;

		for (int variavel = 1; variavel <= n; variavel++) {
			fatorial = fatorial * variavel;
		}

		return fatorial;
	}
}
