package bancodedados;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Estante_2 extends HttpServlet {
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
      
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	    String titulo = request.getParameter("titulo");
    	    String autor = request.getParameter("autor");
    	}

      
        String jdbcURL = "jdbc:mysql://localhost:3306/meu_banco";
        String jdbcUsername = "root";
        String jdbcPassword = "senha"; 

       
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

           
            String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
            statement = connection.prepareStatement(sql);

         
            statement.setString(1, nome);
            statement.setString(2, email);

           
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response.getWriter().println("Usuário cadastrado com sucesso!");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.getWriter().println("Erro ao cadastrar usuário.");
        } finally {
          
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
