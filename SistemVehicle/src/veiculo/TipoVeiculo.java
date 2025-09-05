package veiculo;

public enum TipoVeiculo {
	TERRESTRE(1,""), AEREO(2,""), AQUATICO(3,"");

	private final int codigo;

	private final String descricao;

	TipoVeiculo(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public static TipoVeiculo getFromCodigo(int codigo) {
		for (TipoVeiculo tipo : values()) {
			if (tipo.getCodigo() == codigo) {
				return tipo;
			}
		}
		return null;
	}
}
