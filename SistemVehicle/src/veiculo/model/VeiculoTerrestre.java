package src.veiculo.model;

public class VeiculoTerrestre extends Veiculo {
    private int numeroRodas;
    private boolean ligado;

    public VeiculoTerrestre(int numeroRodas) {
        this.numeroRodas = numeroRodas;
        this.ligado = false;
    }

    public int getNumeroRodas() { return numeroRodas; }
    public void setNumeroRodas(int numeroRodas) { this.numeroRodas = numeroRodas; }

    public boolean isLigado() { return ligado; }
    public void setLigado(boolean ligado) { this.ligado = ligado; }

    @Override
    public void printInformacoes() {
        super.printInformacoes();
        System.out.println("Número de rodas: " + numeroRodas);
    }

    @Override
    public boolean podeMover(int velocidadeAtual, int acelerar) {
        return ligado;
    }
}
