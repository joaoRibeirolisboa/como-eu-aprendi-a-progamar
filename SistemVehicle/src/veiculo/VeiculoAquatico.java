package veiculo;

import java.util.Scanner;

public class VeiculoAquatico extends Veiculo {

	private int calado;
	private int numeroAncoras;
	
	public VeiculoAquatico(int calado) {
		this.calado = calado;
		this.numeroAncoras = numeroAncoras;
	}
	
	
	
	
	public int getCalado() {
		return calado;
	}

	public void setCalado(int calado) {
		this.calado = calado;
	}

	public int getNumeroAncoras() {
		return numeroAncoras;
	}

	public void setNumeroAncoras(int numeroAncoras) {
		this.numeroAncoras = numeroAncoras;
	}
	@Override
	protected void printInformacoes() {
		super.printInformacoes();
		System.out.println("nivel do calado:    " + calado);
		
		System.out.println("numero de ancoras:  " + numeroAncoras);
	}
}