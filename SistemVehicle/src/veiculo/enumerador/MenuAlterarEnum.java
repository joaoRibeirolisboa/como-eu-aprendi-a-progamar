package src.veiculo.enumerador;

public enum MenuAlterarEnum {
    TUDO(1),
    ANOFABRICACAO(2),
    VELOMAXIMA(3),
    CAPACIDADE(4),
    MODELO(5),
    VOLTAR(6);

    private final int codigo;

    MenuAlterarEnum(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static MenuAlterarEnum getFromCodigo(int codigo) {
        for (MenuAlterarEnum op : values()) {
            if (op.getCodigo() == codigo) {
                return op;
            }
        }
        return null;
    }

    public static String listarOpcoes() {
        StringBuilder sb = new StringBuilder();
        for (MenuAlterarEnum op : values()) {
            sb.append(op.getCodigo())
                    .append(" - ")
                    .append(op.name())
                    .append("\n");
        }
        return sb.toString();
    }
}

