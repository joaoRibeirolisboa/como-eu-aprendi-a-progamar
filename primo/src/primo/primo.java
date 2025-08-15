package primo;

import java.util.Scanner;

public class primo {
       public static void main(String[] args) {
    	   int numero;
    	   
         Scanner input = new Scanner(System.in);
       

        do {
            System.out.println("Digite um número para saber se ele é primo ou N");
            System.out.println("Se colocar 1 você sai");
            numero = input.nextInt();

            if (numero == 1) {
                break;
                //aqui fala que se colocar 1 o codigo quebra e para 
            }

            if (numero < 2) {
                System.out.println("Coloque um número maior que 1");
                //aviso de um numero maior q 1
            } else {
            	//```
                boolean ehPrimo = true;
                int raiz = (int) Math.sqrt(numero);
                

                for (int i = 2; i <= raiz; i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
                        //``` calculo do numero
                    }
                }

                if (ehPrimo) {
                    System.out.println(numero + " é primo");
                } else {
                    System.out.println(numero + " não é primo");
                    //finalisacao do codigo
                }
            }
        } while (true);

        input.close();
    }
}
