package src.veiculo.model;

public class VeiculoAquatico extends Veiculo {
    private int calado;
    private int numeroAncoras;
    private boolean ancorado;

    public VeiculoAquatico(int calado, int numeroAncoras, boolean ancorado) {
        this.calado = calado;
        this.numeroAncoras = numeroAncoras;
        this.ancorado = ancorado;
    }

    public VeiculoAquatico(int numeroAncoras) {
        super();
        this.numeroAncoras = numeroAncoras;
    }

    public int getCalado() { return calado; }
    public void setCalado(int calado) { this.calado = calado; }

    public int getNumeroAncoras() { return numeroAncoras; }
    public void setNumeroAncoras(int numeroAncoras) { this.numeroAncoras = numeroAncoras; }

    public boolean isAncorado() { return ancorado; }
    public void setAncorado(boolean ancorado) { this.ancorado = ancorado; }

    // 🔹 novos métodos públicos
    public void subirAncora() {
        if (ancorado) {
            ancorado = false;
            System.out.println("Âncora levantada! O navio está livre para navegar.");
        } else {
            System.out.println("O navio já está livre, sem âncora!");
        }
    }

    public void descerAncora() {
        if (!ancorado) {
            ancorado = true;
            System.out.println("Âncora baixada! O navio está ancorado.");
        } else {
            System.out.println("O navio já está ancorado.");
        }
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

    @Override
    public void acelerar(int acelerar) {
        if (podeMover(getVelocidadeAtual(), acelerar)) {
            super.acelerar(acelerar);
            System.out.println("Acelerando para " + getVelocidadeAtual() + " nós.");
        } else {
            System.out.println("Não é possível acelerar. O veículo está ancorado.");
        }
    }
}
