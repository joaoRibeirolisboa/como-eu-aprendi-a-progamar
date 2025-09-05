package veiculo;

import java.util.List;

import java.util.ArrayList;

public abstract class Veiculo {
    private int codigo;
    private int anoFabricacao;
    private int velocidadeMaxima;
    private int capacidade;
    private String modelo;
	List<Passageiro> Passageiros = new ArrayList<>();
	boolean isligado = true;
    TipoVeiculo tipo;
	protected void printInformacoes() {
        System.out.println("ano de fabricaçao:  " + anoFabricacao);	
		System.out.println("velocidade maxima:  " + velocidadeMaxima);
		System.out.println("capacidade:         " + capacidade);
		System.out.println("o modelo:           " + modelo);			
		   }

	public int getCodigo() {
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
}
