package bancodedados;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String email = req.getParameter("email");
		String senha = req.getParameter("senha");

		// Hash da senha digitada
		String senhaHash = null;
		try {
			senhaHash = hashSenha(senha); // função que mostramos acima
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/seubanco", "usuario",
				"senha")) {
			String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, email);
			stmt.setString(2, senhaHash);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				HttpSession sessao = req.getSession();
				sessao.setAttribute("usuario", rs.getString("nome"));
				res.sendRedirect("home.html");
			} else {
				res.getWriter().println("Login inválido.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
