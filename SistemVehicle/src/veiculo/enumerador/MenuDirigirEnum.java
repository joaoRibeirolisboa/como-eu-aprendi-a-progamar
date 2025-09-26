package src.veiculo.enumerador;

import java.util.Arrays;
import java.util.List;

public enum MenuDirigirEnum {

    LIGAR(1, "1  Ligar veículo"),
    DESLIGAR(2, "2  Desligar veículo"),
    ACELERAR(3, "3  Acelerar"),
    FREAR(4, "4  Frear"),
    SUBIR_ANCORA(5, TipoVeiculo.AQUATICO, "5  Subir âncora"),
    DESCER_ANCORA(6, TipoVeiculo.AQUATICO,"6  Descer âncora"),
    DECOLAR(7, TipoVeiculo.AEREO,"7  Decolar"),
    POUSAR(8, TipoVeiculo.AEREO,"8  Pousar"),
    BACK(0, "0  Voltar");

    private final int codigo;
    private final String descricao;
    private final TipoVeiculo tipoVeiculo;

    MenuDirigirEnum(int codigo, TipoVeiculo tipoVeiculo, String descricao) {
        this.codigo = codigo;
        this.tipoVeiculo = tipoVeiculo;
        this.descricao = descricao;
    }


    MenuDirigirEnum(int codigo, String descricao) {
        this(codigo, null, descricao);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public static MenuDirigirEnum getFromCodigo(int codigo) {
        for (MenuDirigirEnum opcao : MenuDirigirEnum.values()) {
            if (opcao.getCodigo() == codigo) {
                return opcao;
            }
        }
        return null;
    }

    public static List<MenuDirigirEnum> montarPorVeiculo(TipoVeiculo tipoVeiculo) {
        return Arrays.stream(values()).filter(v -> v.tipoVeiculo == null || v.tipoVeiculo == tipoVeiculo).toList();
    }
}
