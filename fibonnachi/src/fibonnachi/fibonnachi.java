package fibonnachi;

   import java.util.Scanner;

   public class fibonnachi {

	public static void main(String[] args) {
		niam();
	}
	public static void niam() {
		
	
		   int posicao;	   
		   int primeiroN;
		   int segundoN;
		   int terceiroN;
		   int stop=3;
		//os N(numeros) são respectivamente primeiro =1 segundo = 1 terceiro = 0 estao alcontrario estao mas so assim deu serto kkkk
		   Scanner input = new Scanner(System.in);
		 
            System.out.println("digite o numero dejejado da tabela de fibonnachi");
            posicao = input.nextInt();
            if (posicao<=0) {
            	System.out.println("coloque um numero maior q 0 seu animal");
           
				
			}else {
				if (posicao<=1) { System.out.println("0");
					
				}else {
						
					
				
             segundoN = 1; terceiroN = 0;
          while (stop<=posicao) {
        	  
        	  primeiroN = segundoN + terceiroN;
        	  terceiroN = segundoN;
        	  segundoN = primeiroN;
			stop++;
			
          }
          
          System.out.println(segundoN);
				}
	} 
	}
}