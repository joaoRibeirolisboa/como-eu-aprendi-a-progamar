package src.veiculo.model;

import java.util.stream.DoubleStream;

import src.veiculo.enumerador.TipoVeiculo;

public abstract class Veiculo {
    private int codigo;
    private int anoFabricacao;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int capacidade;


    private int passageiro;
   // List<Passageiro> Passageiros = new ArrayList<>();
   private String modelo;
    boolean isligado ;
    TipoVeiculo tipo;

    public static void add(Veiculo novo) {
    }

    public static DoubleStream stream() {
        return DoubleStream.empty();
    }

    public void printInformacoesresumidas() {

        System.out.println(modelo + "-"+codigo + " " + anoFabricacao);
    }
    public void printInformacoes() {

        System.out.println("modelo: " +modelo);
        System.out.println("ano de Fabricacao: " +anoFabricacao);
        System.out.println("velocidade Maxima: " +velocidadeMaxima);
        System.out.println("capacidade de passageiros: "+capacidade);


    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnofabricacao() {
        return anoFabricacao;
    }

    public void setAnofabricacao(int anofabricacao) {
        this.anoFabricacao = anofabricacao;
    }


    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

   /* public List<Passageiro> getPassageiros() {
        return Passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        Passageiros = passageiros;
    }*/

    public boolean isIsligado() {
        return isligado;
    }

    public void setIsligado(boolean isligado) {
        this.isligado = isligado;
    }

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + modelo + " (" + anoFabricacao + ")";
    }

    public static int getCodigo(double v) {
        return 0;
    }
    public abstract boolean podeMover(int velocidadeAtual, int acelerar);
}


