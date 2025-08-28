package veiculo;

public enum Passageiro {
	PCD(1), MASCULINO(2), FEMININO(3), SAIR(0);

	private final int codigo;

	Passageiro(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public static Passageiro getFromCodigo(int codigo) {
		for (Passageiro tipo : values()) {
			if (tipo.getCodigo() == codigo) {
				return tipo;
			}
		}
		return SAIR;
	}
}