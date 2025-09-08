package src.veiculo.model;

import java.util.List;

import java.util.ArrayList;
import java.util.stream.DoubleStream;

import src.veiculo.enumerador.TipoVeiculo;

public abstract class Veiculo {
    private static int codigo;
    private int anoFabricacao;
    private int velocidadeMaxima;
    private int capacidade;
    private String modelo;
	List<Passageiro> Passageiros = new ArrayList<>();
	boolean isligado = true;
    TipoVeiculo tipo;

    public static void add(Veiculo novo) {
    }

    public static DoubleStream stream() {
        return DoubleStream.empty();
    }

    public void printInformacoes() {

		System.out.println(modelo+ "" + anoFabricacao);
		   }

	public static int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnofabricacao() {
		return anoFabricacao;
	}

	public void setAnofabricacao(int anofabricacao) {
		this.anoFabricacao = anofabricacao;
	}

	

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public List<Passageiro> getPassageiros() {
		return Passageiros;
	}

	public void setPassageiros(List<Passageiro> passageiros) {
		Passageiros = passageiros;
	}

	public boolean isIsligado() {
		return isligado;
	}

	public void setIsligado(boolean isligado) {
		this.isligado = isligado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public TipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}



    @Override
    public String toString() {
        return "[" + codigo + "] " + modelo + " (" + anoFabricacao + ")";
    }

    public void prinInformacoes() {
        System.out.println(this.toString() +
            " - Velocidade: " + velocidadeMaxima +
            " - Capacidade: " + capacidade);
    }

    public static int getCodigo(double v) {
        return 0;
    }
}
