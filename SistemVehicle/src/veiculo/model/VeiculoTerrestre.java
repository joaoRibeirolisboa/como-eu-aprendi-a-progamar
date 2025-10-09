package src.veiculo.model;

public class VeiculoTerrestre extends Veiculo {
    private static int numeroRodas;

    public VeiculoTerrestre(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    @Override
    public void printInformacoes() {
        super.printInformacoes();
        System.out.println("Número de rodas: " + numeroRodas);
    }

    @Override
    public boolean podeMover(int velocidadeAtual, int acelerar) {
        return true;
    }

    public void frear() {
    }
}
