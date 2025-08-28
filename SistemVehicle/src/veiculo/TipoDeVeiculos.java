package veiculo;

public enum TipoDeVeiculos {
	TERRESTRE(1), AEREO(2), AQUATICO(3), SAIR(0);

	private final int codigo;

	TipoDeVeiculos(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public static TipoDeVeiculos getFromCodigo(int codigo) {
		for (TipoDeVeiculos tipo : values()) {
			if (tipo.getCodigo() == codigo) {
				return tipo;
			}
		}
		return SAIR;
	}
}
