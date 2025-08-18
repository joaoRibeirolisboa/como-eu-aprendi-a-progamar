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
    	 
    	 if (op==1) {
    		 int n, nn;
    		 System.out.println("qual o primeiro numero");
    		 n = input.nextInt();
    		 System.out.println("qual o sugundo numero");
             nn = input.nextInt();
    		System.out.println(+calcualarsoma(n, nn)); 
			
		}
    	 if (op==2) {
    		 int n, nn;
    		 System.out.println("qual o primeiro numero");
    		 n = input.nextInt();
    		 System.out.println("qual o sugundo numero");
             nn = input.nextInt();
    		System.out.println(+calcualarsubtracao(n, nn)); 
			
		}
    	 if (op==3) {
    		 int n, nn;
    		 System.out.println("qual o primeiro numero");
    		 n = input.nextInt();
    		 System.out.println("qual o sugundo numero");
             nn = input.nextInt();
    		System.out.println(+calcualarmultiplicacao(n, nn)); 
			
		}
       	 if (op==4) {
    		 int n, nn;
    		 System.out.println("qual o primeiro numero");
    		 n = input.nextInt();
    		 System.out.println("qual o sugundo numero");
             nn = input.nextInt();
    		System.out.println(+calcualardivisao(n, nn)); 
			
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
