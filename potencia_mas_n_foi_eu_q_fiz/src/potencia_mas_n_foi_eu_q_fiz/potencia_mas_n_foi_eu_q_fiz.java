package potencia_mas_n_foi_eu_q_fiz;

import java.util.Iterator;
import java.util.Scanner;

public class potencia_mas_n_foi_eu_q_fiz {

	public static void main(String[] args) {
		
		apresentarmenu();

	}

	public static void apresentarmenu() {
		Scanner input = new Scanner(System.in);
		
		int op;
		
		System.out.println("====Menu de ferramentas de calculos para estudantes do ensino medio");
		System.out.println("1.calcular potencia");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("0.sair");
		op = input.nextInt();
		
		if (op==1) {
			int b, p;
			System.out.println("qual a base");
			b = input.nextInt();
			System.out.println("qual a potencia");
			p = input.nextInt();
			System.out.println("resultado e." +calcularpotencia(b, p));
			
			
		}
	}
	private static int calcularpotencia (int base, int potencia) {
		
		int resultado=1;
		
		for (int i = 1; i < potencia; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
}
