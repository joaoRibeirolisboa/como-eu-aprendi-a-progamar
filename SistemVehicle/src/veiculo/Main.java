package veiculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cadastrodveiculo();
    }

    private static void cadastrodveiculo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Estou fazendo um sistema de operação de veículos\n");
        System.out.println("Informe as descrições do seu veículo:\n");

        System.out.println("1. Terrestre");
        System.out.println("2. Aéreo");
        System.out.println("3. Aquático");
        System.out.println("0. Sair");
        int op = input.nextInt();
        
        TipoDeVeiculos tipo = TipoDeVeiculos.getFromCodigo(op);

        if (tipo == null) {
            System.out.println("Opção inválida!");
        } else {
            System.out.println("Você escolheu: " + tipo);

            switch (tipo) {
                case TERRESTRE -> Terrestre.classificar(input);
                case AEREO -> Aereo.classificar(input);
                case AQUATICO -> Aquatico.classificar(input);
                case SAIR -> System.out.println("ok");
            }
        }

        input.close();
    }
}
