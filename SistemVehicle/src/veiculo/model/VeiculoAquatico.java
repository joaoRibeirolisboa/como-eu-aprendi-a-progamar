package src.veiculo.model;

public class VeiculoAquatico extends Veiculo {
    private int calado;
    private int numeroAncoras;
    private boolean ancorado;
    private int subirAncora;
    private int descerAncora;

    public int getSubirAncora() {
        return subirAncora;
    }

    public void setSubirAncora(int subirAncora) {
        this.subirAncora = subirAncora;
    }

    public int getDescerAncora() {
        return descerAncora;
    }

    public void setDescerAncora(int descerAncora) {
        this.descerAncora = descerAncora;
    }

    public VeiculoAquatico(int calado, int numeroAncoras, boolean ancorado) {
        this.calado = calado;
        this.numeroAncoras = numeroAncoras;
        this.ancorado = ancorado;
    }

    public VeiculoAquatico(int numeroAncoras) {
        super();
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

    public boolean isAncorado() {
        return ancorado;
    }

    public void setAncorado(boolean ancorado) {
        this.ancorado = ancorado;
    }

    @Override
    public void printInformacoes() {
        super.printInformacoes();
        System.out.println("Calado: " + calado);
        System.out.println("Número de âncoras: " + numeroAncoras);
        System.out.println("Status: " + (ancorado ? "⚓ Ancorado" : "Livre"));
    }

    @Override
    public boolean podeMover(int velocidadeAtual, int acelerar) {
        return !ancorado && super.podeMover(velocidadeAtual, acelerar);
    }

    public void acelerar(int acelerar) {
        if (podeMover(getVelocidadeAtual(), acelerar)) {
            System.out.println("Acelerando para " + getVelocidadeAtual() + " nós.");
            super.acelerar(acelerar);
        } else {
            System.out.println("Não é possível acelerar. O veículo está ancorado.");
        }
    }
}
