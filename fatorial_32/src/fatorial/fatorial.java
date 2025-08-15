package fatorial;

import java.util.Iterator;
import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		// n = numero + sua sequencia
		int n;
		int fat = 1;
		int o;
	
		
		 Scanner input = new Scanner(System.in);
		 
		 do {	
		 System.out.println("qual e o numero pra calculo");	
         n=o = input.nextInt();
         if (n>=0) {
			for (int i = 1; i <= n; i++) {
				fat = fat * i;
			}
			System.out.println("fatoril = " +fat);
		}else {
			System.out.println("coloque um numero depis de 0");
		} while (o == -1);
		 
		 }
	}
}
	
	


