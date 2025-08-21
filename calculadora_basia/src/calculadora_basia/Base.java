package calculadora_basia;

import java.util.Iterator;

import java.util.Scanner;

public class Base {

	public static void main(String[] args) {

		
		
		menu();
	}
     private static void menu() {  
    	 Scanner input = new Scanner(System.in);

    	 int op;
    	 
    	 System.out.println("1.soma");
    	 System.out.println("2.subtrção");
    	 System.out.println("3.multiplicação");
    	 System.out.println("4.divisão");
    	 System.out.println("0.sair");
    	 op = input.nextInt();
    	 
    	 Menu menu = Menu.getFromCodigo(op);
    	 System.out.println(menu);
    	 if (menu.equals(Menu.SOMA)) {
    	        int soma = 0;
    	        int num;

System.out.println("digite os numeros para fazer a soma");
    	        while (true) {
    	        	
        	        System.out.println("Digite o números (0 vc sai):");
    	            num = input.nextInt();
    	            if (num == 0) break; // sai do loop
    	            soma += num;
    	            System.out.println("pre resultado"+soma);
    	        }

    	        System.out.println("resultado   " + soma);
    	        input.close();

    		 
		}
    	 if (menu.equals(Menu.SUBTRACAO )) {
    		  System.out.println("Digite o primeiro número: ");
    	        int resultado = input.nextInt();

    	        System.out.println("Digite os próximos números (0 para parar):");
    	        while (true) {
    	            int num = input.nextInt();
    	            if (num == 0) break;
    	            resultado -= num;
    	        }
    	        System.out.println("O resultado da subtração é: " + resultado);
    	        input.close();
		}
    	 if (menu.equals(Menu.MULTIPLICACAO)) {
    		 System.out.println("Digite o primeiro número: ");
    	        int resultado = input.nextInt(); // começa com o primeiro número

    	        System.out.println("Digite os próximos números (0 para parar):");
    	        while (true) {
    	            int num = input.nextInt();
    	            if (num == 0) break; // parar quando for 0
    	            resultado *= num;
    	        }

    	        System.out.println("O resultado da multiplicação é: " + resultado);
    	        input.close();
		}
       	 if (menu.equals(Menu.DIVISAO)) {

             System.out.println("Digite o primeiro número: ");
             double resultado = input.nextDouble(); // usar double para permitir resultados fracionados

             System.out.println("Digite os próximos números (0 para parar):");
             while (true) {
                 double num = input.nextDouble();
                 if (num == 0) break;
                 if (num == 0.0) {
                     System.out.println("seu animal coloque um numero maior q 0");
                     continue;
                 }
                 resultado /= num;
             }

             System.out.println("O resultado da divisão é: " + resultado);
             input.close();
		}
     }
	
     public static int calcualarsoma(int numero1,int numero2) {
    	 int resultado = numero2 + numero1;
    	 for (int i = 1; i <resultado; i++) {
			resultado = numero2 + numero1;
		}
    	 
		return resultado;
	}
     public static int calcualarsubtracao(int numero1,int numero2) {
    	 int resultado = numero2 - numero1;
    	 for (int i = 1; i <resultado; i++) {
			resultado = numero2 - numero1;
		}
    	 
		return resultado;
	}
     public static int calcualarmultiplicacao(int numero1,int numero2) {
    	 int resultado = numero2 * numero1;
    	 for (int i = 1; i <resultado; i++) {
			resultado = numero2 * numero1;
		}
    	 
		return resultado;
	}
     public static int calcualardivisao(int numero1,int numero2) {
    	 int resultado = numero2 / numero1;
    	 for (int i = 1; i <resultado; i++) {
			resultado = numero2 / numero1;
		}
    	 
		return resultado;
	}
}
