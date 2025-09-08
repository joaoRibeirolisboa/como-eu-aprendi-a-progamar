//package src.veiculo;
//
//import src.veiculo.enumerador.MenuAdicionarEnum;
//import src.veiculo.enumerador.MenuPrincipalEnum;
//import src.veiculo.enumerador.MenuRemoverEnum;
//import src.veiculo.model.Veiculo;
//import src.veiculo.model.VeiculoAereo;
//import src.veiculo.model.VeiculoAquatico;
//import src.veiculo.model.VeiculoTerrestre;
//
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class main {
//
//    private static List<Veiculo> veiculos;
//    private static Object menuRemover;
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        veiculos = inicializarLista();
//
//        while (true) {
//
//            for (MenuPrincipalEnum menuPrincipal : MenuPrincipalEnum.values()) {
//                System.out.println(menuPrincipal.getDescricao());
//            }
//
//            MenuPrincipalEnum menuPrincipal = MenuPrincipalEnum.getFromCodigo(input.nextInt());
//
//            if (MenuPrincipalEnum.SELECIONAR.equals(menuPrincipal)) {
//                navegarMenuSelecionar();
//
//            } else if (MenuPrincipalEnum.ADICIONAR.equals(menuPrincipal)) {
//                navegarMenuAdicionar();
//
//            } else if (MenuPrincipalEnum.SAIR.equals(menuPrincipal)) {
//                System.out.println("VOCÊ SAIU");
//                break;
//            }
//
//
//            System.out.println();
//
//
//        }
//
//        input.close();
//    }
//
//
//    public static void navegarMenuSelecionar() {
//        if (veiculos.isEmpty()) {
//            System.out.println("Nenhum veiculo cadastrado ");
//            return;
//        }
//
//        // Terrestres
//        List<Veiculo> terrestres = veiculos.stream()
//                .filter(veiculo -> veiculo instanceof VeiculoTerrestre)
//                .collect(Collectors.toList());
//
//        System.out.println("    Veiculos terrestres cadastrados    ");
//        for (int i = 0; i < terrestres.size(); i++) {
//            System.out.println((i + 1) + " - " + terrestres.get(i));
//        }
//
//        // Aquaticos
//        List<Veiculo> aquaticos = veiculos.stream()
//                .filter(veiculo -> veiculo instanceof VeiculoAquatico)
//                .collect(Collectors.toList());
//
//        System.out.println("\n    Veiculos aquaticos cadastrados    ");
//        for (int i = 0; i < aquaticos.size(); i++) {
//            System.out.println((i + 1) + " - " + aquaticos.get(i));
//        }
//
//        // Aereos
//        List<Veiculo> aereos = veiculos.stream()
//                .filter(veiculo -> veiculo instanceof VeiculoAereo)
//                .collect(Collectors.toList());
//
//        System.out.println("\n    Veiculos aereos cadastrados    ");
//        for (int i = 0; i < aereos.size(); i++) {
//            System.out.println((i + 1) + " - " + aereos.get(i));
//        }
//    }
//
//    public static void navegarMenuAdicionar() {
//        Scanner input = new Scanner(System.in);
//
//        for (MenuAdicionarEnum menuAdicionar : MenuAdicionarEnum.values()) {
//            System.out.println(menuAdicionar.getDescricao());
//        }
//
//        MenuAdicionarEnum menuAdicionar = MenuAdicionarEnum.getFromCodigo(input.nextInt());
//
//        Veiculo veiculo = null;
//
//        if (MenuAdicionarEnum.TERRESTRE.equals(menuAdicionar)) {
//            veiculo = preencheValoresVeiculoTerrestre(input, veiculo);
//
//        } else if (MenuAdicionarEnum.AEREO.equals(menuAdicionar)) {
//            veiculo = preencheValoresVeiculoAereo(input, veiculo);
//        } else if (MenuAdicionarEnum.AQUATICO.equals(menuAdicionar)) {
//
//            veiculo = preencheValoresVeiculoAquatico(input, veiculo);
//
//        } else {
//            System.out.println("VOCÊ SAIU");
//            return;
//        }
//        adicionarComCodigo(veiculo);
//
//        System.out.println("Veículo adicionado com sucesso!");
//        veiculo.printInformacoes();
//
//    }
//
//    public static void navegarMenuRemover() {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("\n=== MENU REMOVER VEÍCULO ===");
//        for (MenuRemoverEnum menuRemover : MenuRemoverEnum.values()) {
//            System.out.println(menuRemover.getCodigo() + " - " + menuRemover.getDescricao());
//        }
//        System.out.print("Escolha uma opção: ");
//
//        int opcao = input.nextInt();
//        MenuRemoverEnum menuRemover = MenuRemoverEnum.getFromCodigo(opcao);
//
//        Veiculo veiculo = null;
//
//        if (MenuRemoverEnum.TERRESTRE.equals(menuRemover)) {
//            veiculo = preencheValoresVeiculoTerrestre(input, veiculo);
//
//        } else if (MenuRemoverEnum.AEREO.equals(menuRemover)) {
//            veiculo = preencheValoresVeiculoAereo(input, veiculo);
//
//        } else if (MenuRemoverEnum.AQUATICO.equals(menuRemover)) {
//            veiculo = preencheValoresVeiculoAquatico(input, veiculo);
//
//        } else {
//            System.out.println("VOCE SAIU");
//            return;
//        }
//
//
//        if (veiculo != null) {
//            System.out.println("VEICULO REMOVIDO   " + veiculo);
//
//        } else {
//            System.out.println("N TEM NENHUM VEICULO ");
//        }
//    }
//
//
//}
