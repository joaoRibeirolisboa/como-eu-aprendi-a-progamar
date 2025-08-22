package estanol_vs_gasolina;

import estanol_vs_gasolina.Menu;

public enum Menu {
ETANOLeGASOLINA(1),
GASOLINAeDISEL(2), 
DISELeETANOL(3),
TUDO(4),
SAIR(0);
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