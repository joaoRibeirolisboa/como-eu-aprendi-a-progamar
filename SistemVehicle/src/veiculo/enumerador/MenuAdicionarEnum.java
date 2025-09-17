package src.veiculo.enumerador;

public enum MenuAdicionarEnum {

	TERRESTRE(1, "1 terresatre"), AEREO(2, "2 aereo"), AQUATICO(3, "3 aquatico"), BACK(0, "0 back  <-");

	public String getDescricao() {
		return descricao;
	}

	private final String descricao;

	MenuAdicionarEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	private final int codigo;

	public int getCodigo() {
		return this.codigo;
	}

	public static MenuAdicionarEnum getFromCodigo(int codigo) {
		for (MenuAdicionarEnum menu : values()) {
			if (menu.getCodigo() == codigo) {
				return menu;

			}
		}

		return BACK;
	}

}
