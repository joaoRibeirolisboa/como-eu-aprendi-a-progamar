package main2_0;

import java.util.Scanner;

public class main2_0 {

	public static void main(String[] args) {
    double n1, n2;		
	String op;	
		Scanner input = new Scanner (System.in);
		///System.out.println("resultato e :"+calcularSoma(2, 3));
		   System.out.println("se guinte + soma\n - e - \n X multiplicaçao\n / divisao ");
         op = input.nextLine();
		System.out.println("informe n1:");
	    n1 = input.nextDouble();
	    System.out.println("informe n2");
	    n2 = input.nextDouble();
     
         
         System.out.println(calcular(n1, n2, op));
	}
	public static double calcularSoma(double n1, double n2) {
		double resultado;
		resultado = n1+n2;
		return resultado;
		
	}
	public static double calcular(double n1, double n2, String op) {
		double resultado = 0;
		
		if (op.equals("+")) {
			resultado = n1 + n2;
		}else if (op.equals("-")) {
			resultado = n1 - n2;		
		}else if (op.equals("X")) {
			resultado = n1*n2;
		}else if (op.equals("/")) {
			resultado = n1 / n2;
		}
		return resultado;
		} {
			
		}
	}

