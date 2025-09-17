package src.veiculo.enumerador;

public enum menuUsarEnum {

        ADICIONARPASSAGEIRO(1, "1 Adicionar um passageiro"), REMOMEVERPASSAGEIRO(2, "2 Remover um passageiro"), DIRIGIR (3, "3 Dirigir"),REPARAR(4, "4 repar o seu veiculo"),VOLTAR(0, "0 Voltar");

        public String getDescricao() {
            return descricao;
        }

        private final String descricao;

    menuUsarEnum(int codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
        }

        private final int codigo;

        public int getCodigo() {
            return this.codigo;
        }

        public static src.veiculo.enumerador.menuUsarEnum getFromCodigo(int codigo) {
            for (src.veiculo.enumerador.menuUsarEnum menu : values()) {
                if (menu.getCodigo() == codigo) {
                    return menu;

                }
            }

            return null;
        }
    }


