package potenciacao;

import java.util.Scanner;

public class potenciacao {
	
     public static void main(String[] args) {
		
    	int base; 
    	int expoente;
    	 int res; 
    	
    	
    	//res = resultado anterior 
    	Scanner input = new Scanner(System.in);
    	
    	do {
    		res = 1;
    		base = 0;
    		expoente = 0;
    		System.out.println("informe o numero da base  pro calculo");
        	base = input.nextInt();
        	
        	System.out.println("informe o expoente");
        	expoente = input.nextInt();
        	
        	for (int i = expoente; i >= 1; i--) {
        		res = res * base;

        	}
        	System.out.println("resultado: " +res);
        	
		} while (res >= 2);
    	
    	
    	}
	}


