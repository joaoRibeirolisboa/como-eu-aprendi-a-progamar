package veiculo;

import java.util.Scanner;

public class Terrestre {

    public static void classificar(Scanner input) {
    	System.out.println("ok");
        System.out.println("quantas rodas tem o seu veiculo");
        int rodas = input.nextInt();
        input.nextLine(); 

        if (rodas == 4) {
            System.out.println("entao o seu veiculo é um carro");
            System.out.print("qual a marca do seu carro ");
            String marca = input.nextLine();
            System.out.println("qual e a velocidade maxima");
            int velocidade = input.nextInt();
            System.out.println("marca  " + marca);
        } else if (rodas == 2) {
            System.out.println("entao o seu veiculo e uma moto");
            System.out.print("qual a marca da moto ");
            String marca = input.nextLine();
            System.out.println("qual e a velocidade maxima");
            int velocidade = input.nextInt();
            System.out.println("marca  " + marca);
        } else {
            System.out.println("entao o seu veiculo é um triciclo");
            System.out.print("qual a marca do triciclo ");
            String marca = input.nextLine();
            System.out.println("qual e a velocidade maxima");
            int velocidade = input.nextInt();
            System.out.println("marca " + marca);
        }
    }
}
