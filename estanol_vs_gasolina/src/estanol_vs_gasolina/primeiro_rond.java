package estanol_vs_gasolina;

import java.util.Scanner;

public class primeiro_rond {

public static void main(String[] args) {
	
	float etanol;
	float gasolina;
	float per;
	
	    Scanner input = new Scanner(System.in);
		
		System.out.println("informe o valor do etanol");
	    etanol = input.nextFloat();
	    
	    System.out.println("informe o valor do gasolina");
	    gasolina = input.nextFloat();
	    
	    
	     per = etanol/gasolina*100;
	     
	     System.out.println("o percentual é : "+per+"%");
	}

}
