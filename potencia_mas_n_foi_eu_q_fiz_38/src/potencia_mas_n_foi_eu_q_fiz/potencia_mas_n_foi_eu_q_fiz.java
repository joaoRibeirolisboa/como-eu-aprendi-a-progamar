package potencia_mas_n_foi_eu_q_fiz;

import java.util.Iterator;
import java.util.Scanner;

public class potencia_mas_n_foi_eu_q_fiz {

	public static void main(String[] args) {
		
		apresentarmenu();

	}

	public static void apresentarmenu() {
		Scanner input = new Scanner(System.in);
		
		int opicoes;
		
		System.out.println("====Menu de ferramentas de calculos para estudantes do ensino medio");
		System.out.println("1.calcular potencia");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("0.sair");
		opicoes = input.nextInt();
		
		if (opicoes==1) {
			int base, potencia;
			System.out.println("qual a base");
			base = input.nextInt();
			System.out.println("qual a potencia");
			potencia = input.nextInt();
			System.out.println("resultado e." +calcularpotencia(base, potencia));
			
			
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
