package chute;

import java.util.Iterator;
import java.util.Scanner;

public class chute {

	public static void main(String[] args) {
		
		int n, chute,qtd = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Número a ser adivinhado:");
		n = input.nextInt();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("\n");
		}
		do {
			System.out.println("chute?");
			chute = input.nextInt();
			if (chute==n) {
				System.out.println("n fez mais q sua obrigaçao em acertar");
				System.out.println("quantos erros vc teve." +qtd);
			}else if (chute < n) {
				System.out.println("vc ta muito lonje ainda (mais alto)");
				
				
			}else {
				System.out.println("vc ta muito lonje ainda (mais baixo)");

			}
			qtd++;
		} while (chute != n);
		if (qtd==2) {
			System.out.println("vc e digno");
		}else {
			System.out.println("...");
		}
	}
	
}
