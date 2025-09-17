package src.veiculo.enumerador;

public enum MenuSelecionarEnum {

	TERRESTRE(1, "1 terresatre"),  AQUATICO(2, "2 aquatico"),AEREO(3, "3 aereo"), BACK(0, "0 back  <-");

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
