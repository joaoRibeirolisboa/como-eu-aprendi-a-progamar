package src.veiculo.model;

public class VeiculoTerrestre extends Veiculo {
    List<Veiculo> terrestres = Veiculo.stream()
            .filter(v -> v instanceof VeiculoTerrestre)
            .toList();

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
	public void printInformacoes() {
		super.printInformacoes();
        System.out.println("numero de rodas:    " +numeroRodas);
	}


}
