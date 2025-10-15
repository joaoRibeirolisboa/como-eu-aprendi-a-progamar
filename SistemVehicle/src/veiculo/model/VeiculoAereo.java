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
    public void decolar() throws InterruptedException {
        if (!emVoo) {
            emVoo = true;
            System.out.println("Avião decolando..."+ levantandovoo());
        } else {
            System.out.println("O avião já está em voo.");
        }
    }

    public void pousar() throws InterruptedException {
        if (emVoo) {
            emVoo = false;
            System.out.println("Avião pousando"+ pousandovoo());
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
    @Override
    public void acelerar(int acelerar) {
        if (!emVoo) {
            System.out.println("O avião está no solo. Decole antes de acelerar.");
            return;
        }
        super.acelerar(acelerar);
    }
    public static boolean levantandovoo() throws InterruptedException {
        String[] frames = {"--==✈==----->>>", "-----==✈==-->>>", "-------==✈==>>>", "^^^^✈"};
        for (int i = 0; i < 1; i++) {
            for (String frame : frames) {
                System.out.print("\r" + frame);
                Thread.sleep(750);
            }
        }
        System.out.print("\rPronto\n");
        Thread.sleep(1000);
        return true;
    }
    public static boolean pousandovoo() throws InterruptedException {
        String[] frames = {"✈>>>       ||  || ", "✈>>>    || ||   ", "✈ || ||      ", "-- --"};
        for (int i = 0; i < 1; i++) {
            for (String frame : frames) {
                System.out.print("\r" + frame);
                Thread.sleep(750);
            }
        }
        System.out.print("\rPronto\n");
        Thread.sleep(1000);
        return true;
    }

}
