package src.veiculo.enumerador;
public enum MenuDirigirEnum {
    LIGAR(1, "1  Ligar veículo"),
    DESLIGAR(2, "2  Desligar veículo"),
    ACELERAR(3, "3  Acelerar"),
    FREAR(4, "4  Frear"),
    BACK(0, "0  Voltar"),
    SUBIR_ANCORA(6, "6  Subir âncora"),
    DESCER_ANCORA(7, "7  Descer âncora"),
    DECOLAR(8, "8  Decolar"),
    POUSAR(9, "9  Pousar");

    private final int codigo;
    private final String descricao;

    MenuDirigirEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static MenuDirigirEnum getFromCodigo(int codigo) {
        for (MenuDirigirEnum opcao : MenuDirigirEnum.values()) {
            if (opcao.getCodigo() == codigo) {
                return opcao;
            }
        }
        return null;
    }
}
