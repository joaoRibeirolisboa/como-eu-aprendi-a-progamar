package maiormenor;

import java.util.Scanner;

public class maiormenor {
 public static void main(String[] args) {
	 niam();
 }
 public static void niam() {
	

	 int banco=1;
	 int maior, menor,resultado;
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("infore o primeiro valor");
	 resultado = input.nextInt();
	 
	 maior = resultado;
	 menor = resultado;
	 
	 do {
		 banco++;
		System.out.println("infore o "+banco+"valor ");
		resultado = input.nextInt();
		
		if(resultado>maior) {
			maior = resultado;
		}else if (resultado<menor) {
			menor = resultado;
			
		}
	} while (banco<=7);
	 System.out.println("maior e " +maior);
	 System.out.println("menor e " +menor);
	 
	 
}
}
