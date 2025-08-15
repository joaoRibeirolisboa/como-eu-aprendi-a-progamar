package bancodedados;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/buscarUsuario")
public class BuscarUsuarioServlet extends HttpServlet {

	private List<Usuario> usuarios = new ArrayList<>();

	public void init() throws ServletException {
		usuarios.add(new Usuario("Maria", "maria@email.com"));
		usuarios.add(new Usuario("João", "joao@email.com"));
		usuarios.add(new Usuario("Ana", "ana@email.com"));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String termo = request.getParameter("termo");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<h1>Resultado da Busca</h1>");
		out.println("<a href='index.html'>Voltar</a><br><br>");

		if (termo == null || termo.trim().isEmpty()) {
			out.println("<p>Por favor, digite um termo para buscar.</p>");
		} else {
			termo = termo.toLowerCase();
			List<Usuario> encontrados = new ArrayList<>();

			for (Usuario u : usuarios) {
				if (u.getNome().toLowerCase().contains(termo) || u.getEmail().toLowerCase().contains(termo)) {
					encontrados.add(u);
				}
			}

			if (encontrados.isEmpty()) {
				out.println("<p>Nenhum usuário encontrado para: <b>" + termo + "</b></p>");
			} else {
				out.println("<ul>");
				for (Usuario u : encontrados) {
					out.println("<li>" + u.getNome() + " - " + u.getEmail() + "</li>");
				}
				out.println("</ul>");
			}
		}
	}
}

class Usuario {
	private String nome;
	private String email;

	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
}
