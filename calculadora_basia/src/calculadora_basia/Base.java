package calculadora_basia;

import java.util.Scanner;

public class Base {

	public static void main(String[] args) {

		int n1;
		int n2;
		
		 Scanner input = new Scanner(System.in);
				 
          System.out.println("qual e o primeiro  numero");	
          n1 = input.nextInt();
          System.out.println("qual e o segundo numero ");
          n2  = input.nextInt();
          
          System.out.println("Soma: " +(n1+n2));
          System.out.println("subtrção: " +(n1-n2)); 
          System.out.println("multiplicação: " +(n1*n2));
          System.out.println("divisão: " +(n1/n2)); 


	}

}
