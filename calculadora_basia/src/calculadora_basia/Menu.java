package calculadora_basia;

public enum Menu {
	SOMA(1), SUBTRACAO(2), MULTIPLICACAO(3), DIVISAO(4), SAIR(0);

	Menu(int codigo) {
		this.codigo = codigo;
	}

	private final int codigo;

	public int getCodigo() {
		return this.codigo;
	}

	 public static Menu getFromCodigo(int codigo) {
	        for (Menu menu : values()) {
	            if (menu.getCodigo() == codigo) {
	                return menu;
	            }
	        }
	        return SAIR;
	    }
	
}
