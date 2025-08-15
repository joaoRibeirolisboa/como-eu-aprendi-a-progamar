package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Java {
	public static void main(String[] args) {
		String nome = "joao";
		String email = "joao123@hotmil.com";

		String url = "jdbc:mysql://localhost:3306/postgresql";
		String usuario = "root";
		String senha = "123456";

		try {
			Class.forName("org.postgresql.Driver");
  
			try (Connection conn = DriverManager.getConnection(url, usuario, senha)) {
				System.out.println("Conexão estabelecida com sucesso!");

				String sqlInsert = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
				try (PreparedStatement pstmt = conn.prepareStatement(sqlInsert)) {
					pstmt.setString(1, nome);
					pstmt.setString(2, email);
					pstmt.executeUpdate();
					System.out.println("Usuário inserido com sucesso.");
				}

				String query = "SELECT id, nome, email FROM usuarios";
				try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
					System.out.println("\nLista de usuários:");
					while (rs.next()) {
						int id = rs.getInt("id");
						String nomeLido = rs.getString("nome");
						String emailLido = rs.getString("email");
						System.out.println("ID: " + id + ", Nome: " + nomeLido + ", Email: " + emailLido);
					}
				}
			}
		} catch (SQLException e) {
			System.err.println("Erro ao conectar ou executar a query: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Driver JDBC não encontrado: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
