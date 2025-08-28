package veiculo;

import java.util.Scanner;

public class Aquatico extends Veiculo {
	
	public void teste() {
		codigo = 10;
	}

    public static void classificar(Scanner input) {
        System.out.println("ok ");
        System.out.println(" qual classe de veículo aquático se encaixa no seu");
        System.out.println("1. barco");
        System.out.println("2. navio");
        System.out.println("3. submarino");
        System.out.println("4. especial");
        int escolha = input.nextInt();
        
        input.nextLine();

            if (escolha == 1) {
                System.out.println("voce escolheu barco");
                System.out.print("qual o tipo de barco ");
                System.out.println("tem a opiçao de canoa iate e etc");
                String tipoBarco = input.nextLine();
                System.out.println("qual e a velocidade maxima");
                int velocidade = input.nextInt();
                System.out.println("tipo de barco " + tipoBarco);
            }else if (escolha ==2) {
           
                System.out.println("voce escolheu navio");
                System.out.print("qual uso do navio");
                System.out.println("uso cormercial ou recreativo");
                String tipoNavio = input.nextLine();
                System.out.println("qual e a velocidade maxima");
                int velocidade = input.nextInt();
                System.out.println("tipo de navio " + tipoNavio);
            }else if(escolha == 3) {
                System.out.println("voce escolheu submarino");
                System.out.print("para que e o  submarino");
                System.out.println("pequisa, militar ou (ir jogar no vasco) quero diser recreativo");
                String tipoSub = input.nextLine();
                System.out.println("qual e a velocidade maxima");
                int velocidade = input.nextInt();
                System.out.println("tipo de submarino " + tipoSub);
            } else{
                System.out.println("voce escolheu embarcaçao especial");
                System.out.print("qual o tipo");
                System.out.println("jet ski e catamara");
                String tipoEspecial = input.nextLine();
                System.out.println("qual e a velocidade maxima");
                int velocidade = input.nextInt();
                System.out.println("tipo especial " + tipoEspecial);
            }
        }
    }
}
