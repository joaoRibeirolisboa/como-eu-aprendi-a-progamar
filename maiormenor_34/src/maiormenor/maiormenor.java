package maiormenor;

import java.util.Scanner;

public class maiormenor {
 public static void main(String[] args) {
	
	 int i=1;
	 int maior, menor,n;
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("infore o primeiro valor");
	 n = input.nextInt();
	 
	 maior = n;
	 menor = n;
	 
	 do {
		 i++;
		System.out.println("infore o "+i+"valor ");
		n = input.nextInt();
		
		if(n>maior) {
			maior = n;
		}else if (n<menor) {
			menor = n;
			
		}
	} while (i<=7);
	 System.out.println("maior e " +maior);
	 System.out.println("menor e " +menor);
	 
	 
}
}
