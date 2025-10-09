package src.veiculo.model;

public class VeiculoAereo extends Veiculo {
    private  int altitudeMaxima;
    private  int velocidadeMinimaDecolagem;
    private  int decolar;
    private  int pousar;

    public int getPousar() {
        return pousar;
    }

    public void setPousar(int pousar) {
        this.pousar = pousar;
    }

    public int getDecolar() {
        return decolar;
    }

    public void setDecolar(int decolar) {
        this.decolar = decolar;
    }

    public VeiculoAereo(int altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
        this.velocidadeMinimaDecolagem = velocidadeMinimaDecolagem;
    }

    public int getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public void setAltitudeMaxima(int altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }

    public int getVelocidadeMinimaDecolagem() {
        return velocidadeMinimaDecolagem;
    }

    public void setVelocidadeMinimaDecolagem(int velocidadeMinimaDecolagem) {
        this.velocidadeMinimaDecolagem = velocidadeMinimaDecolagem;
    }

    @Override
    public void printInformacoes() {
        super.printInformacoes();
        System.out.println("Altitude máxima: " + altitudeMaxima + " m");
        System.out.println("Velocidade mínima de decolagem: " + velocidadeMinimaDecolagem + " km/h");
    }

    @Override
    public boolean podeMover(int velocidadeAtual, int acelerar ) {

        return (velocidadeAtual + acelerar) >= velocidadeMinimaDecolagem;
    }

    @Override
    public void frear() {

    }


}
