package bancodedados;

import java.io.IOE/xception;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/removerUsuario")
public class RemoverUsuario extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String jdbcURL = "jdbc:postgresql://localhost:5432/seubanco";
		String jdbcUser = "seuusuario";
		String jdbcSenha = "suasenha";

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			Class.forName("org.postgresql.Driver");
			try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcSenha)) {
				String sql = "DELETE FROM usuarios WHERE id = ? AND nome = ?";
				try (PreparedStatement stmt = conn.prepareStatement(sql)) {
					stmt.setInt(1, id);
					stmt.setString(2, nome);

					int linhasAfetadas = stmt.executeUpdate();

					if (linhasAfetadas > 0) {
						out.println("Usuário removido com sucesso.");
					} else {
						out.println("Nenhum usuário encontrado com esse ID e nome.");
					}
				}
			}
		} catch (Exception e) {
			out.println("Erro ao remover usuário.");
			e.printStackTrace(out);
		}
	}
}
