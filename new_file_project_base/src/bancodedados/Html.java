package bancodedados;

public class Html {
    public static void main(String[] args) {
    	
    }
    @WebServlet("/formulario")
    public class FormularioServlet extends HttpServlet {
        
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html lang='pt'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>Formulário de Usuário</title>");
            out.println("</head>");
            out.println("<body>");

            // Cadastro de Usuário @ pronto
            out.println("<h1>Cadastro de Usuário</h1>");
            out.println("<form action='cadastrarUsuario' method='POST'>");
            out.println("Título: <input type='text' name='titulo' required><br>");
            out.println("Autor: <input type='text' name='autor' required><br>");
            out.println("<input type='submit' value='Cadastrar'>");
            out.println("</form><hr>");

            // Cadastro de ID @ estava tentando colocar o id mas N cossegui 
            out.println("<h1>Cadastro de ID</h1>");
            out.println("<form action='cadastrarID' method='POST'>");
            out.println("ID: <input type='number' name='ID' required><br>");
            out.println("<input type='submit' value='Cadastrar ID'>");
            out.println("</form><hr>");

            // Remover usuário @ "pronto" so N esta aparecendo o botão escrito remover 
            out.println("<h1>Remover Usuário</h1>");
            out.println("<form action='removerUsuario' method='POST'>");
            out.println("ID do usuário: <input type='number' name='id' required><br>");
            out.println("Nome do usuário: <input type='text' name='nome' required><br>");
            out.println("<input type='submit' value='Remover'>");
            out.println("</form><hr>");

            // Buscar usuário @ em andamento 
            out.println("<h1>Buscar Usuários</h1>");
            out.println("<form action='buscarUsuario' method='GET'>");
            out.println("<input type='text' name='termo' placeholder='Digite nome ou email'>");
            out.println("<input type='submit' value='Buscar'>");
            out.println("</form><hr>");

            // esigir senha @ em andamento
            out.println("<h1>Entrar</h1>");
            out.println("<form method='POST' action='login'>");
            out.println("Email: <input type='email' name='email'><br>");
            out.println("Senha: <input type='password' name='senha'><br>");
            out.println("<input type='submit' value='Entrar'>");
            out.println("</form>");

            out.println("</body>");
            out.println("</html>");
        }
    }

}
