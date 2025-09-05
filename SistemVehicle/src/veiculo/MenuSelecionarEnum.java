package veiculo;

public enum MenuSelecionarEnum {

	TERRESTRE(1, "terresatre"), AEREO(2, "aereo"), AQUATICO(3, "aquatico"), BACK(0, "back  <-");

	public String getDescricao() {
		return descricao;
	}

	private final String descricao;

	MenuSelecionarEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	private final int codigo;

	public int getCodigo() {
		return this.codigo;
	}

	public static MenuSelecionarEnum getFromCodigo(int codigo) {
		for (MenuSelecionarEnum menu : values()) {
			if (menu.getCodigo() == codigo) {
				return menu;

			}
		}

		return null;
	}

}
