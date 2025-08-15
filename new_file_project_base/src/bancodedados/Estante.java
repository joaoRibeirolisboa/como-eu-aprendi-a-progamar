package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Estante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor: ");
        String autor = scanner.nextLine();


        String url = "jdbc:mysql://localhost:3306/seubanco";
        String usuario = "root"; 
        String senha = "1234";    

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection conn = DriverManager.getConnection(url, usuario, senha)) {
                System.out.println("Conexão bem-sucedida!");

                String criarTabela = "CREATE TABLE IF NOT EXISTS estante (" +
                                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                                     "titulo VARCHAR(255) NOT NULL, " +
                                     "autor VARCHAR(255) NOT NULL" +
                                     ")";
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(criarTabela);
                    System.out.println("Tabela 'estante' criada/verificada com sucesso.");
                }

                String sql = "INSERT INTO estante (titulo, autor) VALUES (?, ?)";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, titulo);
                    statement.setString(2, autor);
                    statement.executeUpdate();
                    System.out.println("Dados inseridos com sucesso.");
                }

            } catch (SQLException e) {
                System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Erro ao carregar o driver JDBC: " + e.getMessage());
        }

        scanner.close();
    }
}
