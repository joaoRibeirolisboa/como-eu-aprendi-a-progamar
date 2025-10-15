package src.veiculo.model;

public class VeiculoAquatico extends Veiculo {
    private int calado;
    private int numeroAncoras;
    private boolean ancorado;

    public VeiculoAquatico(int calado, int numeroAncoras, boolean ancorado) {
        super(); // garante inicialização da classe base
        this.calado = calado;
        this.numeroAncoras = numeroAncoras;
        this.ancorado = ancorado;
    }

    public VeiculoAquatico(int numeroAncoras) {
        super();
        this.numeroAncoras = numeroAncoras;
        this.ancorado = true; // começa ancorado por padrão
    }

    // Getters e setters
    public int getCalado() { return calado; }
    public void setCalado(int calado) { this.calado = calado; }

    public int getNumeroAncoras() { return numeroAncoras; }
    public void setNumeroAncoras(int numeroAncoras) { this.numeroAncoras = numeroAncoras; }

    public boolean isAncorado() { return ancorado; }
    public void setAncorado(boolean ancorado) { this.ancorado = ancorado; }


    public void subirAncora() throws InterruptedException {
        if (ancorado) {
            ancorado = false;
            System.out.println("ancora esta levantada        "+spinner()  );
        } else {
            System.out.println("A âncora já está levantada.");
        }
    }

    public void descerAncora() throws InterruptedException {
        if (!ancorado) {
            ancorado = true;
            System.out.println("a ancora esta abaixada   " + spinner());
        } else {
            System.out.println("A âncora já está abaixada.");
        }
    }

    @Override
    public void printInformacoes() {
        super.printInformacoes();
        System.out.println("Calado: " + calado);
        System.out.println("Número de âncoras: " + numeroAncoras);
        System.out.println("Status: " + (ancorado ? "Ancorado" : "Livre"));
    }

    // 🔹 O veículo só pode mover se não estiver ancorado
    @Override
    public boolean podeMover(int velocidadeAtual, int acelerar) {
        if (ancorado) {
            System.out.println("Não é possível mover — o veículo está ancorado!");
            return false;
        }
        return super.podeMover(velocidadeAtual, acelerar);
    }

    // 🔹 Bloqueia aceleração se estiver ancorado
    @Override
    public void acelerar(int acelerar) {
        if (ancorado) {
            System.out.println("Não é possível acelerar com a âncora abaixada!");
            return;
        }
        super.acelerar(acelerar);
        System.out.println("Acelerando para " + getVelocidadeAtual() + " nós.");
    }
    public static boolean spinner() throws InterruptedException {
        String[] frames = {"/", "-", "\\", "|"};
        for (int i = 0; i < 10; i++) {
            for (String frame : frames) {
                System.out.print("\r" + frame);
                Thread.sleep(250);
            }
        }
        System.out.print("\rPronto\n");
        Thread.sleep(1000);
        return true;
    }
}
