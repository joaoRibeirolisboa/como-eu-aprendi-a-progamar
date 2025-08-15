package conversor;

import java.util.Scanner;

public class conversor {
     public static void main(String[] args) {
		int celsius;
		int fahrenheit;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("quantos graus celsius");
		celsius = input.nextInt();
	      
	    
		fahrenheit = (9*celsius+160)/5;
	    
	    System.out.println("converção : "+(fahrenheit));
	}
}
