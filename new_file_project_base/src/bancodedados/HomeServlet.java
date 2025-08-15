package bancodedados;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession sessao = req.getSession(false);

		if (sessao == null || sessao.getAttribute("usuario") == null) {
			res.sendRedirect("login.html"); // Não logado
		} else {
			res.setContentType("text/html");
			res.getWriter().println("Bem-vindo, " + sessao.getAttribute("usuario") + "!");
		}
	}
}
