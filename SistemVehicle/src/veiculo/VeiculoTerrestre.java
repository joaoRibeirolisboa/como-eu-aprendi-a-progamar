package veiculo;

import java.util.Scanner;

public class VeiculoTerrestre extends Veiculo {

	int numeroRodas;
	
	public VeiculoTerrestre(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public int getNumeroRodas() {
		return this.numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	
	@Override
	protected void printInformacoes() {
		super.printInformacoes();
        System.out.println("numero de rodas:    " +numeroRodas);
	}

}
