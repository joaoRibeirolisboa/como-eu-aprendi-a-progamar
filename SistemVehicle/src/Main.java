package src;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import src.veiculo.enumerador.*;
import src.veiculo.model.Veiculo;
import src.veiculo.model.VeiculoAereo;
import src.veiculo.model.VeiculoAquatico;
import src.veiculo.model.VeiculoTerrestre;

import static src.veiculo.enumerador.MenuAdicionarEnum.*;
import static src.veiculo.enumerador.MenuAlterarEnum.*;

public class Main {

    static List<Veiculo> veiculos = inicializarLista();

    public static void main(String[] args) throws InterruptedException {
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
            } else if (MenuPrincipalEnum.LISTAR.equals(menuPrincipal)) {
                listar();
            } else if (MenuPrincipalEnum.SAIR.equals(menuPrincipal)) {
                System.out.println("VOCÊ SAIU");
                break;
            }
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

    public static Veiculo preencheValoresVeiculoTerrestre(Scanner input) {
        System.out.println("Qual é o número de rodas do seu veículo");
        int numeroRodas = input.nextInt();
        VeiculoTerrestre veiculo = new VeiculoTerrestre(numeroRodas);
        veiculo.setTipo(TipoVeiculo.TERRESTRE);
        return preeencheValoresComuns(input, veiculo);
    }

    public static Veiculo preencheValoresVeiculoAereo(Scanner input) {

        System.out.println("Qual é a altitude máxima que o veículo alcança");
        int altitude = input.nextInt();
        VeiculoAereo veiculo = new VeiculoAereo(altitude);
        veiculo.setTipo(TipoVeiculo.AEREO);
        return preeencheValoresComuns(input, veiculo);
    }

    public static Veiculo preencheValoresVeiculoAquatico(Scanner input) {
        System.out.println("Qual é o nível do calado");
        System.out.println("Se você quer uma explicaçao digite 1");
        int calado = input.nextInt();


        if (calado == 1) {
            System.out.println("Calado em náutica é a profundidade que a quilha de uma embarcação atinge abaixo da linha d'água.");
            System.out.println("Agora que você sabe informe o nível do calado:");
            calado = input.nextInt();
        }

        boolean ancorado = true;

        System.out.println("Digite o numero de ancoras: ");
        int numeroAncoras = input.nextInt();
        VeiculoAquatico veiculo = new VeiculoAquatico(numeroAncoras, calado, ancorado) {

        };
        veiculo.setTipo(TipoVeiculo.AQUATICO);
        return preeencheValoresComuns(input, veiculo);
    }

    public void subirAncora() {
        boolean ancorado = false;
        if (!ancorado) {
            System.out.println(" As âncoras já estão recolhidas.");
        } else {
            ancorado = false;
            System.out.println(" Âncoras recolhidas! O barco está livre para navegar.");
        }
    }

    public void descerAncora() {
        boolean ancorado = false;


        if (ancorado) {
            System.out.println(" O barco já está ancorado.");
        } else {
            ancorado = true;
            System.out.println(" Âncoras lançadas! O barco está ancorado.");
        }
    }


    public static void adicionarComCodigo(Veiculo novo) {
        int proximoCodigo = veiculos.stream().mapToInt(Veiculo::getCodigo).max().orElse(0) + 1;

        novo.setCodigo(proximoCodigo);
        veiculos.add(novo);
    }

    public static List<Veiculo> inicializarLista() {
        List<Veiculo> veiculos = new ArrayList<>();

        VeiculoTerrestre veiculoTerrestre = new VeiculoTerrestre(4);
        veiculoTerrestre.setCodigo(1);
        veiculoTerrestre.setAnofabricacao(2024);
        veiculoTerrestre.setCapacidade(2);
        veiculoTerrestre.setVelocidadeMaxima(296);
        veiculoTerrestre.setModelo("Porsche 911 GT3 RS");
        veiculoTerrestre.setTipo(TipoVeiculo.TERRESTRE);
        veiculos.add(veiculoTerrestre);

        VeiculoAquatico veiculoAquatico = new VeiculoAquatico(40) {

        };
        veiculoAquatico.setCodigo(2);
        veiculoAquatico.setAnofabricacao(2025);
        veiculoAquatico.setCapacidade(16);
        veiculoAquatico.setVelocidadeMaxima(66);
        veiculoAquatico.setModelo("Lancha NX360");
        veiculoAquatico.setTipo(TipoVeiculo.AQUATICO);
        veiculos.add(veiculoAquatico);

        VeiculoAereo veiculoAereo = new VeiculoAereo(4000);
        veiculoAereo.setCodigo(3);
        veiculoAereo.setAnofabricacao(1991);
        veiculoAereo.setCapacidade(12);
        veiculoAereo.setVelocidadeMaxima(946);
        veiculoAereo.setModelo("Bombardier Global Express");
        veiculoAereo.setTipo(TipoVeiculo.AEREO);
        veiculos.add(veiculoAereo);

        return veiculos;
    }

    public static void navegarMenuSelecionar() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Veículos cadastrados:");
        veiculos.forEach(v -> System.out.println(v.toString()));

        System.out.println("Digite o código do veículo que deseja selecionar:");
        int codigoEscolhido = input.nextInt();

        Veiculo selecionado = veiculos.stream().filter(v -> v.getCodigo() == codigoEscolhido).findFirst().orElse(null);

        if (selecionado == null) {
            System.out.println("Código inválido");
            return;
        }

        System.out.println("Vc selecionou:");
        selecionado.printInformacoes();
        Thread.sleep(1000);
        navegarMenuveiculo(selecionado);
    }

    public static void navegarMenuAdicionar() {
        Scanner input = new Scanner(System.in);

        for (MenuAdicionarEnum menuAdicionar : MenuAdicionarEnum.values()) {
            System.out.println(menuAdicionar.getDescricao());
        }

        MenuAdicionarEnum menuAdicionar = MenuAdicionarEnum.getFromCodigo(input.nextInt());
        Veiculo veiculo = null;

        if (TERRESTRE.equals(menuAdicionar)) {
            veiculo = preencheValoresVeiculoTerrestre(input);
        } else if (AEREO.equals(menuAdicionar)) {
            veiculo = preencheValoresVeiculoAereo(input);
        } else if (AQUATICO.equals(menuAdicionar)) {
            veiculo = preencheValoresVeiculoAquatico(input);
        } else {
            System.out.println("VC SAIU");
            return;
        }

        adicionarComCodigo(veiculo);
        System.out.println("Veículo adicionado com sucesso");
        veiculo.printInformacoes();
    }

    public static void alterarVeiculo(Scanner input, Veiculo veiculoSelecionado) {
        if (veiculoSelecionado == null) {
            System.out.println("Veículo nao encontrado");
            return;
        }

        System.out.println("Escolha o campo para alterar:");
        System.out.println(listarOpcoes());

        int escolha = input.nextInt();
        input.nextLine();

        MenuAlterarEnum menuAlterar = MenuAlterarEnum.getFromCodigo(escolha);

        if (menuAlterar == null || menuAlterar == VOLTAR) {
            System.out.println("Operação cancelada");
            return;
        }

        switch (menuAlterar) {
            case TUDO -> {
                System.out.println("Ano de fabricação:");
                veiculoSelecionado.setAnofabricacao(input.nextInt());
                input.nextLine();

                System.out.println("Velocidade máxima:");
                veiculoSelecionado.setVelocidadeMaxima(input.nextInt());
                input.nextLine();

                System.out.println("Capacidade:");
                veiculoSelecionado.setCapacidade(input.nextInt());
                input.nextLine();

                System.out.println("Modelo:");
                veiculoSelecionado.setModelo(input.nextLine());
            }
            case ANOFABRICACAO -> {
                System.out.println("Ano de fabricação:");
                veiculoSelecionado.setAnofabricacao(input.nextInt());
                input.nextLine();
            }
            case VELOMAXIMA -> {
                System.out.println("Velocidade máxima:");
                veiculoSelecionado.setVelocidadeMaxima(input.nextInt());
                input.nextLine();
            }
            case CAPACIDADE -> {
                System.out.println("Capacidade:");
                veiculoSelecionado.setCapacidade(input.nextInt());
                input.nextLine();
            }
            case MODELO -> {
                System.out.println("Modelo:");
                veiculoSelecionado.setModelo(input.nextLine());
            }
        }

        System.out.println("Veículo alterado com sucesso");
        veiculoSelecionado.printInformacoes();
    }

    public static void navegarMenuveiculo(Veiculo veiculoSelecionado) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma ação para o veículo " + veiculoSelecionado.getModelo() + ":");
            for (MenuVeiculoEnum menu : MenuVeiculoEnum.values()) {
                System.out.println(menu.getCodigo() + " - " + menu.getDescricao());
            }

            int escolha = input.nextInt();
            input.nextLine();
            MenuVeiculoEnum menuVeiculo = MenuVeiculoEnum.getFromCodigo(escolha);

            if (menuVeiculo == null) {
                System.out.println("Opção inválida!");
                continue;
            }

            switch (menuVeiculo) {
                case REMOVER -> {
                    veiculos.remove(veiculoSelecionado);
                    System.out.println("Veículo removido!");
                    return;
                }
                case USAR -> MenuDirigirenum(input, veiculoSelecionado);
                case ALTERAR -> alterarVeiculo(input, veiculoSelecionado);
                case BACK -> {
                    return;
                }
            }
        }
    }

    public static void listar() throws InterruptedException {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }

        List<Veiculo> terrestres = veiculos.stream().filter(veiculo -> veiculo instanceof VeiculoTerrestre).collect(Collectors.toList());
        System.out.println("=== Veículos Terrestres ===");
        terrestres.forEach(Veiculo::printInformacoesresumidas);
        Thread.sleep(750);


        List<Veiculo> aquaticos = veiculos.stream().filter(veiculo -> veiculo instanceof VeiculoAquatico).collect(Collectors.toList());
        System.out.println("\n=== Veículos Aquáticos ===");
        aquaticos.forEach(Veiculo::printInformacoesresumidas);
        Thread.sleep(750);
        List<Veiculo> aereos = veiculos.stream().filter(veiculo -> veiculo instanceof VeiculoAereo).collect(Collectors.toList());
        System.out.println("\n=== Veículos Aéreos ===");
        aereos.forEach(Veiculo::printInformacoesresumidas);
        System.out.println("");
        Thread.sleep(750);
    }

    public static void MenuDirigirenum(Scanner input, Veiculo veiculoSelecionado) throws InterruptedException {
        if (veiculoSelecionado == null) {
            System.out.println("Veículo não encontrado");
            return;
        }

        System.out.println("Escolha o que você quer fazer:");
        for (menuUsarEnum op : menuUsarEnum.values()) {
            System.out.println(op.getCodigo() + " - " + op.getDescricao());
        }

        int escolha = input.nextInt();
        input.nextLine();
        menuUsarEnum menuDirigir = menuUsarEnum.getFromCodigo(escolha);

        if (menuDirigir == null || menuDirigir == menuUsarEnum.VOLTAR) {
            System.out.println("Operação cancelada");
            return;
        }

        switch (menuDirigir) {
            case ADICIONARPASSAGEIRO -> {
                System.out.println("Quantos passageiros você quer adicionar?");
                int qtd = input.nextInt();
                if (qtd < 0) {
                    System.out.println("Não é possível adicionar número negativo!");
                } else {
                    veiculoSelecionado.setPassageiro(veiculoSelecionado.getPassageiro() + qtd);
                    System.out.println("Novo total de passageiros: " + veiculoSelecionado.getPassageiro());
                }
            }
            case REMOMEVERPASSAGEIRO -> {
                System.out.println("Quantos passageiros você quer remover?");
                int qtd = input.nextInt();
                if (qtd < 0) {
                    System.out.println("Não é possível remover número negativo!");
                } else if (qtd > veiculoSelecionado.getPassageiro()) {
                    System.out.println("Não há passageiros suficientes!");
                } else {
                    veiculoSelecionado.setPassageiro(veiculoSelecionado.getPassageiro() - qtd);
                    System.out.println("Novo total de passageiros: " + veiculoSelecionado.getPassageiro());
                }
            }
            case REPARAR -> {
                System.out.println("Reparando o veículo...");
                spinner();
            }
            case DIRIGIR -> dirigir(input, veiculoSelecionado);
        }
    }

    public static void spinner() throws InterruptedException {
        String[] frames = {"/", "-", "\\", "|"};
        for (int i = 0; i < 10; i++) {
            for (String frame : frames) {
                System.out.print("\r" + frame);
                Thread.sleep(250);
            }
        }
        System.out.print("\rPronto!\n");
        Thread.sleep(1000);
    }


    public static void dirigir(Scanner input, Veiculo veiculoSelecionado) throws InterruptedException {
        while (true) {
            System.out.println("");
            System.out.println("Velocidade atual: " + veiculoSelecionado.getVelocidadeAtual() + " km/h");
            System.out.println("Status: " + (veiculoSelecionado.isligado() ? "Ligado" : "Desligado"));
            Thread.sleep(1750);
            System.out.println("===== MENU DIRIGIR =====");

            for (MenuDirigirEnum menu : MenuDirigirEnum.montarPorVeiculo(veiculoSelecionado.getTipo())) {
                System.out.println(menu.getDescricao());
            }

            System.out.print("Escolha o que você quer fazer: ");

            int opcao = input.nextInt();
            MenuDirigirEnum menuDirigir = MenuDirigirEnum.getFromCodigo(opcao);

            if (menuDirigir == null) {
                System.out.println("\uD83E\uDD28\u200B");
                continue;
            }

            switch (menuDirigir) {
                case LIGAR -> {
                    if (veiculoSelecionado.isligado()) {
                        System.out.println("O veiculo ja esta ligado");
                        Thread.sleep(1000);
                        continue;
                    }
                    veiculoSelecionado.setIsligado(true);
                    System.out.println("Vruummm O veículo foi ligado");
                    Thread.sleep(1000);
                }
                case DESLIGAR -> {
                    if (!veiculoSelecionado.isligado()) {
                        System.out.println("\uD83E\uDD28\u200B O veículo ja ta desligado");
                        Thread.sleep(1000);
                    } else if (veiculoSelecionado.getVelocidadeAtual() > 0) {
                        System.out.println("Nao da pra deligar em movimento");
                        Thread.sleep(1000);
                    } else {
                        veiculoSelecionado.isligado();
                        System.out.println("desligado");
                        Thread.sleep(1000);
                    }
                }
                case ACELERAR -> {
                 if (!veiculoSelecionado.isligado() ) {
                     System.out.println("O veiculo esta desligado");
                     Thread.sleep(1000);
                 }else {
                     System.out.println("quanto vc quer acelerar");
                     System.out.println("km/");veiculoSelecionado.acelerar(input.nextInt());
                     Thread.sleep(1000);
                 }


                }
                case FREAR -> {
                    int i = 1;
                    if (!veiculoSelecionado.isligado()) {
                        System.out.println("O veiculo esta desligado");
                        Thread.sleep(1000);
                    } else if (veiculoSelecionado.getVelocidadeAtual() == 0) {
                        System.out.println("O veículo ja esta parado");
                        Thread.sleep(1000);
                    } else {
                        System.out.print("quanto voce quer frear (km/h)? ");
                        int frear = input.nextInt();
                        if (frear >= veiculoSelecionado.getVelocidadeAtual()) {
                            veiculoSelecionado.setVelocidadeAtual(0);
                            System.out.println("O veiculo parou");
                            Thread.sleep(1000);
                        } else {
                            veiculoSelecionado.setVelocidadeAtual(frear);
                            System.out.println("Você desacelerou. Velocidade atual: " + veiculoSelecionado.getVelocidadeAtual() + " km/h");
                            Thread.sleep(1000);

                        }
                    }
                }
                case SUBIR_ANCORA -> {


                    VeiculoAquatico veiculoAqua = (VeiculoAquatico) veiculoSelecionado;

                    if (!veiculoAqua.isligado()) {
                        System.out.println("O veículo está desligado!");
                        Thread.sleep(1000);
                        break;
                    }

                    if (!veiculoAqua.isAncorado()) {
                        System.out.println("A âncora já está levantada");
                        Thread.sleep(1000);
                        break;
                    }

                    veiculoAqua.subirAncora();
                    Thread.sleep(1000);
                } case DESCER_ANCORA -> {
                    VeiculoAquatico veiculoAqua = (VeiculoAquatico) veiculoSelecionado;

                    if (!veiculoAqua.isligado()) {
                        System.out.println("O veículo está desligado!");
                        Thread.sleep(1000);
                        break;
                    }
                    veiculoAqua.descerAncora();
                    Thread.sleep(1000);
                }

                case DECOLAR -> {
                    VeiculoAereo veiculoAereo = (VeiculoAereo) veiculoSelecionado;
                    if (!veiculoAereo.isligado()) {
                        System.out.println("O veículo está desligado!");
                        Thread.sleep(1000);
                        break;
                    }
                    veiculoAereo.decolar();
                    Thread.sleep(1000);

                }
                case POUSAR -> {
                    VeiculoAereo veiculoAereo = (VeiculoAereo) veiculoSelecionado;
                    if (!veiculoAereo.isligado()) {
                        System.out.println("O veículo está desligado!");
                        Thread.sleep(1000);
                        break;
                    }
                    veiculoAereo.pousar();
                    Thread.sleep(1000);

                }

                case BACK -> {
                    return;
                }
            }
        }
    }
    private static void handleAcelerar(Veiculo veiculoSelecionado) throws InterruptedException {
        int acelerar = 10; // futuramente pode vir via input

        if (veiculoSelecionado == null) {
            System.out.println("Nenhum veículo selecionado!");
            return;
        }

        switch (veiculoSelecionado) {
            case VeiculoAquatico aquatico -> {
                aquatico.acelerar(acelerar);
                aquatico.subirAncora();
                aquatico.descerAncora();
                // aquatico.frear();
            }
            case VeiculoAereo aereo -> {
                aereo.acelerar(acelerar);
                System.out.println("Velocidade mínima de decolagem: " + aereo.getVelocidadeMinimaDecolagem());
                aereo.decolar();
                aereo.pousar();
                aereo.frear();
            }
            case VeiculoTerrestre terrestre -> {
                terrestre.acelerar(acelerar);
                if (terrestre.isLigado()) {
                    System.out.println("O veículo terrestre está ligado e acelerando!");
                } else {
                    System.out.println("O veículo terrestre está desligado.");
                }
                int frear = 0;
                terrestre.frear();
            }
            default -> throw new IllegalStateException("Tipo de veículo inesperado: " + veiculoSelecionado.getClass().getSimpleName());
        }
    }

}
