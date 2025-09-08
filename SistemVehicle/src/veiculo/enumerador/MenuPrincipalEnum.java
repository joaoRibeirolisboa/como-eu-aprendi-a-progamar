package src.veiculo.enumerador;

public enum MenuPrincipalEnum {
	SELECIONAR(1, "1.selecionar veiculo"), ADICIONAR(2, "2.adicionar veiculo"), REMOVER(3, "3.remover veiculo"),
	LISTAR(4, "4.listar veiculos"), SAIR(0, "0.sair");

	public String getDescricao() {
		return descricao;
	}

	private final String descricao;

	MenuPrincipalEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	private final int codigo;

	public int getCodigo() {
		return this.codigo;
	}

	public static MenuPrincipalEnum getFromCodigo(int codigo) {
		for (MenuPrincipalEnum menu : values()) {
			if (menu.getCodigo() == codigo) {
				return menu;

			}
		}

		return SAIR;
	}

}
