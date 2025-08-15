package bancodedados;

import java.sql.*;

public class Sql {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/seubanco";
		String usuario = "root";
		String senha = "1234";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, usuario, senha);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM estante");

			while (rs.next()) {
				System.out.println("Título: " + rs.getString("titulo"));
			}
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
