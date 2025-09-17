package src.veiculo.enumerador;

public enum MenuVeiculoEnum {
    REMOVER(1, "1 Remover veículo"),
    USAR(2, "2 usar"),
    ALTERAR(3, "3 Alterar"),
    BACK(0, "0 Voltar <-");

    private final int codigo;
    private final String descricao;

    MenuVeiculoEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static MenuVeiculoEnum getFromCodigo(int codigo) {
        for (MenuVeiculoEnum menu : values()) {
            if (menu.getCodigo() == codigo) {
                return menu;
            }
        }
        return BACK; // valor padrão se não encontrar
    }
}