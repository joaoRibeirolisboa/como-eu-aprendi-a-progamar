package bancodedados;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession sessao = req.getSession(false);
		if (sessao != null) {
			sessao.invalidate();
		}
		res.sendRedirect("login.html");
	}
}