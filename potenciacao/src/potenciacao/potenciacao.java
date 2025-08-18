package potenciacao;

import java.util.Scanner;

public class potenciacao {
	
     public static void main(String[] args) {
 
    	 niam();
     }	
    	 public static void niam() {
			
		
    	int base; 
    	int expoente;
    	 int resultado; 
    	
    	 
    	Scanner input = new Scanner(System.in);
    	
    	do {
    		resultado = 1;
    		base = 0;
    		expoente = 0;
    		
    		
    		System.out.println("informe o numero da base  pro calculo");
        	base = input.nextInt();
        	
        	System.out.println("informe o expoente");
        	expoente = input.nextInt();
        	
        	for (int i = expoente; i >= 1; i--) {
        		resultado = resultado * base;

        	}
        	System.out.println("resultado: " +resultado);
        	
		} while (resultado >= 2);
    	
    	
    	}
	}


