package src;

import java.util.Scanner;

import src.veiculo.enumerador.MenuAdicionarEnum;
import src.veiculo.enumerador.MenuRemoverEnum;
import src.veiculo.model.Veiculo;
import src.veiculo.model.VeiculoAereo;
import src.veiculo.enumerador.MenuPrincipalEnum;
import src.veiculo.model.VeiculoAquatico;
import src.veiculo.model.VeiculoTerrestre;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    static List<Veiculo> veiculos = inicializarLista();

    void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            for (MenuPrincipalEnum menuPrincipal : MenuPrincipalEnum.values()) {
                System.out.println(menuPrincipal.getDescricao());
            }

            MenuPrincipalEnum menuPrincipal = MenuPrincipalEnum.getFromCodigo(input.nextInt());

            if (MenuPrincipalEnum.SELECIONAR.equals(menuPrincipal)) {
                navegarMenuSelecionar();

            } else if (MenuPrincipalEnum.ADICIONAR.equals(menuPrincipal)) {
                navegarMenuAdicionar();

            } else if (MenuPrincipalEnum.SAIR.equals(menuPrincipal)) {
                System.out.println("VOCÊ SAIU");
                break;
            }


            System.out.println();


        }

        input.close();
    }

    public static Veiculo preeencheValoresComuns(Scanner input, Veiculo veiculo) {
        System.out.println("Qual é o ano de fabricação");
        veiculo.setAnofabricacao(input.nextInt());

        System.out.println("Qual é a velocidade máxima do seu veículo");
        veiculo.setVelocidadeMaxima(input.nextInt());

        System.out.println("Qual é a capacidade");
        veiculo.setCapacidade(input.nextInt());

        System.out.println("Qual é o modelo do seu veículo");
        veiculo.setModelo(input.next());
        return veiculo;
    }

    public static Veiculo preencheValoresVeiculoTerrestre(Scanner input, Veiculo veiculo) {
        System.out.println("qual e o numero de rodas do seu veiculo");
        int numeroRodas = input.nextInt();
        veiculo = new VeiculoTerrestre(numeroRodas);
        veiculo = preeencheValoresComuns(input, veiculo);
        return veiculo;
    }

    public static Veiculo preencheValoresVeiculoAereo(Scanner input, Veiculo veiculo) {
        System.out.println("qual e a altitude que o seu veiculo chega");
        int altitude = input.nextInt();
        veiculo = new VeiculoAereo(altitude);

        veiculo = preeencheValoresComuns(input, veiculo);
        return veiculo;
    }

    public static Veiculo preencheValoresVeiculoAquatico(Scanner input, Veiculo veiculo) {
        System.out.println("qual e o nivel do calado");
        System.out.println("se vc quer uma explicação digite 1");
        int calado = input.nextInt();
        veiculo = new VeiculoAquatico(calado);
        if (calado == 1) {
            System.out.println(
                    "Calado em náutica, é a profundidade que a quilha de uma embarcação atinge abaixo " + "da linha ");
            System.out.println("d'água, ou seja, a parte submersa do navio.");
            System.out.println("");
            System.out.println("");
            System.out.println("agora que vc sabe oq e informe o nivel do calado");

            calado = input.nextInt();
            veiculo = new VeiculoAquatico(calado);
            System.out.println("digite o numero de ancoras ");
            int numeroAncoras = input.nextInt();
            veiculo = new VeiculoAquatico(numeroAncoras);

            veiculo = preeencheValoresComuns(input, veiculo);
        }
        return veiculo;
    }

    public static void adicionarComCodigo(Veiculo novo) {
        int proximoCodigo = Veiculo.stream().mapToInt(Veiculo::getCodigo).max().orElse(0) + 1;
        novo.setCodigo(proximoCodigo);
        Veiculo.add(novo);
    }

    public static List<Veiculo> inicializarLista() {
        List<Veiculo> veiculos = new ArrayList<>();

        VeiculoTerrestre veiculoTerrestre = new VeiculoTerrestre(4);
        veiculoTerrestre.setCodigo(1);
        veiculoTerrestre.setAnofabricacao(2024);
        veiculoTerrestre.setCapacidade(2);
        veiculoTerrestre.setVelocidadeMaxima(296);
        veiculoTerrestre.setModelo("porsche 911 GT3 RS");

        veiculos.add(veiculoTerrestre);

        VeiculoAquatico veiculoAquatico = new VeiculoAquatico(40);
        veiculoAquatico.setCodigo(2);
        veiculoAquatico.setAnofabricacao(2025);
        veiculoAquatico.setCapacidade(16);
        veiculoAquatico.setVelocidadeMaxima(66);
        veiculoAquatico.setModelo(" lancha NX360 ");

        veiculos.add(veiculoAquatico);

        VeiculoAereo veiculoAereo = new VeiculoAereo(4000);
        veiculoAereo.setCodigo(3);
        veiculoAereo.setAnofabricacao(1991);
        veiculoAereo.setCapacidade(12);
        veiculoAereo.setVelocidadeMaxima(946);
        veiculoAereo.setModelo(" bombardier global express ");

        veiculos.add(veiculoAereo);

        return veiculos;
    }

    public static void navegarMenuSelecionar() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veiculo cadastrado ");
            return;
        }

        // Terrestres
        List<Veiculo> terrestres = veiculos.stream()
                .filter(veiculo -> veiculo instanceof VeiculoTerrestre)
                .collect(Collectors.toList());

        System.out.println("    Veiculos terrestres cadastrados    ");
        for (int i = 0; i < terrestres.size(); i++) {
            System.out.println((i + 1) + " - " + terrestres.get(i));
        }

        // Aquaticos
        List<Veiculo> aquaticos = veiculos.stream()
                .filter(veiculo -> veiculo instanceof VeiculoAquatico)
                .collect(Collectors.toList());

        System.out.println("\n    Veiculos aquaticos cadastrados    ");
        for (int i = 0; i < aquaticos.size(); i++) {
            System.out.println((i + 1) + " - " + aquaticos.get(i));
        }

        // Aereos
        List<Veiculo> aereos = veiculos.stream()
                .filter(veiculo -> veiculo instanceof VeiculoAereo)
                .collect(Collectors.toList());

        System.out.println("\n    Veiculos aereos cadastrados    ");
        for (int i = 0; i < aereos.size(); i++) {
            System.out.println((i + 1) + " - " + aereos.get(i));
        }
    }

    public static void navegarMenuAdicionar() {
        Scanner input = new Scanner(System.in);

        for (MenuAdicionarEnum menuAdicionar : MenuAdicionarEnum.values()) {
            System.out.println(menuAdicionar.getDescricao());
        }

        MenuAdicionarEnum menuAdicionar = MenuAdicionarEnum.getFromCodigo(input.nextInt());

        Veiculo veiculo = null;

        if (MenuAdicionarEnum.TERRESTRE.equals(menuAdicionar)) {
            veiculo = preencheValoresVeiculoTerrestre(input, veiculo);

        } else if (MenuAdicionarEnum.AEREO.equals(menuAdicionar)) {
            veiculo = preencheValoresVeiculoAereo(input, veiculo);
        } else if (MenuAdicionarEnum.AQUATICO.equals(menuAdicionar)) {

            veiculo = preencheValoresVeiculoAquatico(input, veiculo);

        } else {
            System.out.println("VOCÊ SAIU");
            return;
        }
        adicionarComCodigo(veiculo);

        System.out.println("Veículo adicionado com sucesso!");
        veiculo.printInformacoes();

    }
}
