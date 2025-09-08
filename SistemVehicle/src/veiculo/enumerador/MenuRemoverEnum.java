package src.veiculo.enumerador;

public enum MenuRemoverEnum {
    TERRESTRE(1, "terrestre"), AEREO(2, "aéreo"), AQUATICO(3, "aquático"), BACK(0, "back <-");

    private final int codigo;
    private final String descricao;

    MenuRemoverEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static MenuRemoverEnum getFromCodigo(int codigo) {
        for (MenuRemoverEnum menu : values()) {
            if (menu.getCodigo() == codigo) {
                return menu;
            }
        }
        return BACK; // valor padrão se não encontrar
    }
}
