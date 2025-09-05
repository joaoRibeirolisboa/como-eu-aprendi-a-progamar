package veiculo;

import java.util.Scanner;

public class VeiculoAereo extends Veiculo {
	private int altitude;

	public VeiculoAereo(int altitude) {
		this.altitude = altitude;
	}
	
	
	
	public int getAltitude() {
		return this.altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	@Override
	protected void printInformacoes() {
		super.printInformacoes();
		System.out.println("altitude:           " + altitude);
	}
}
