package src.veiculo.model;

public class VeiculoAereo extends Veiculo {
    private int altitudeMaxima;
    private int velocidadeMinimaDecolagem;
    private boolean emVoo; // estado do avião

    public VeiculoAereo(int altitudeMaxima, int velocidadeMinimaDecolagem) {
        this.altitudeMaxima = altitudeMaxima;
        this.velocidadeMinimaDecolagem = velocidadeMinimaDecolagem;
        this.emVoo = false;
    }

    public int getAltitudeMaxima() { return altitudeMaxima; }
    public void setAltitudeMaxima(int altitudeMaxima) { this.altitudeMaxima = altitudeMaxima; }

    public int getVelocidadeMinimaDecolagem() { return velocidadeMinimaDecolagem; }
    public void setVelocidadeMinimaDecolagem(int velocidadeMinimaDecolagem) { this.velocidadeMinimaDecolagem = velocidadeMinimaDecolagem; }

    // 🔹 novos métodos públicos
    public void decolar() {
        if (!emVoo) {
            emVoo = true;
            System.out.println("Avião decolando...");
        } else {
            System.out.println("O avião já está em voo.");
        }
    }

    public void pousar() {
        if (emVoo) {
            emVoo = false;
            System.out.println("Avião pousando...");
        } else {
            System.out.println("O avião já está no solo.");
        }
    }

    @Override
    public void printInformacoes() {
        super.printInformacoes();
        System.out.println("Altitude máxima: " + altitudeMaxima + " m");
        System.out.println("Velocidade mínima de decolagem: " + velocidadeMinimaDecolagem + " km/h");
    }

    @Override
    public boolean podeMover(int velocidadeAtual, int acelerar) {
        return (velocidadeAtual + acelerar) >= velocidadeMinimaDecolagem;
    }
    public VeiculoAereo(int altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
        this.velocidadeMinimaDecolagem = 200; // valor padrão
        this.emVoo = false;
    }

}
