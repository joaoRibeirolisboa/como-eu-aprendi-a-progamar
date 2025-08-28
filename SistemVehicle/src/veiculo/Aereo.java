package veiculo;

import java.util.Scanner;

public class Aereo {

    public static void classificar(Scanner input) {
    	System.out.println("ok");
        System.out.println("o seu veículo aéreo é mais ou menos pesado que o ar");
        System.out.println("1. mais leve");
        System.out.println("2. mais pesado");
        int peso = input.nextInt();
        input.nextLine();

        if (peso == 1) {
            System.out.println("ele usa motor");
            System.out.println("1 -- sim");
            System.out.println("2 -- nao");
            int motor = input.nextInt();
            input.nextLine();

            if (motor == 1) {
                System.out.println("entao ele e um dirigivel");
                System.out.print("qual o modelo do dirigivel ");
                System.out.println("modelos rigidos, nao regidos, semirrigidos");
                String modelo = input.nextLine();
                System.out.println("qual e a velocidade maxima");
                int velocidade = input.nextInt();
                System.out.println("modelo " + modelo);
            } else {
                System.out.println("entao ele e um balao");
                System.out.print("qual é a cor dele ");
                String cor = input.nextLine();
                System.out.println("cor " + cor);
            }

        } else {
        	System.out.println("ok");
            System.out.println("qual e o modelo dele");
            System.out.println("1. asa fixa");
            System.out.println("2. asa rotativa");
            System.out.println("3. asa flutuante");
            System.out.println("4. VTOL");
            int modelo = input.nextInt();
            input.nextLine();

            System.out.println("qual e a sua funçao");
            System.out.println("1. Uso civil");
            System.out.println("2. Uso militar");
            int uso = input.nextInt();
            input.nextLine();

  
        }
    }
}
