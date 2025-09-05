package veiculo;

import java.util.Scanner;

import veiculo.MenuAdicionarEnum;
import veiculo.VeiculoAereo;
import veiculo.MenuPrincipalEnum;

import java.util.List;
import java.util.ArrayList;

public class Main {
	private static List<Veiculo> veiculos = new ArrayList<>();
 
	public static void main(String[] args) {
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


	public static void navegarMenuSelecionar() {
		if (veiculos.isEmpty()) {
			System.out.println("Nenhum veículo cadastrado ");
		} else {
			System.out.println("Veículos cadastrados");
			for (int i = 0; i < veiculos.size(); i++) {
				System.out.println((i + 1) + " - " + veiculos.get(i));
			}
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

			veiculo =  preencheValoresVeiculoAquatico(input, veiculo);

		} else

		{
			System.out.println("VOCÊ SAIU");
			return;
		}
		adicionarComCodigo(veiculo);

		System.out.println("Veículo adicionado com sucesso!");
		veiculo.printInformacoes();

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

			veiculo =preeencheValoresComuns(input, veiculo);
		}
		return veiculo;
	}

	public static void adicionarComCodigo(Veiculo novo) {
		int proximoCodigo = veiculos.stream().mapToInt(Veiculo::getCodigo).max().orElse(0) + 1;
		novo.setCodigo(proximoCodigo);
		veiculos.add(novo);
	}
		   
}
