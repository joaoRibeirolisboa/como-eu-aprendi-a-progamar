package src.listas;

import java.util.Objects;

public class Item {

	private String nome;
	private double preco;
	private double status;
	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, preco, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco)
				&& Double.doubleToLongBits(status) == Double.doubleToLongBits(other.status);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getStatus() {
		return status;
	}
	public void setStatus(double status) {
		this.status = status;
	}
	
}
