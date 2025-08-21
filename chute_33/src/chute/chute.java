package chute;

import java.util.Iterator;
import java.util.Scanner;

public class chute {

	public static void main(String[] args) {

		chute();
	}

	private static void chute() {		
	Scanner input = new Scanner(System.in);
	System.out.println("Número a ser adivinhado:");
	int  n = input.nextInt();
	int qtd = 1;
	int chute;
	for (int i = 0; i < 1000; i++) {
		System.out.println("\n");
	}
	int restante;	
	do {
		System.out.println("chute?");
		chute = input.nextInt();
		qtd++;
	}
	 while (chute != n);
	if (qtd==2) {
		System.out.println("vc e digno");
	}else {
		System.out.println(".-. .-.");
	}
		if (chute==n) {
			System.out.println("n fez mais q sua obrigaçao em acertar");
			System.out.println("quantos erros vc teve." +qtd);
		}else if (chute < n) {
			System.out.println("vc ta muito lonje ainda (mais alto)");			
		}else {
			System.out.println("vc ta muito lonje ainda (mais baixo)");
		}
		

	}while(chute!=n);

}}
