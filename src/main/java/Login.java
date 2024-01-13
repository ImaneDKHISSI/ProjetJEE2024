

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String DBurl = "jdbc:mysql://localhost:3309/projet_plateforme_enligne"; //On met le nom du notre jdbc et le port de notre bd et le nom de notre BD
        String user = "root";
        String password = "H130407184";
        
        String login=request.getParameter("login"); //Pour la récupération du name de formulaire
        String password1=request.getParameter("password"); //Pour la récupération du mot de passe de formulaire
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //Ce forName dans les versions anciennes c'est obligée ms dans le new V il est par défaut parce que si on travaille sur plusieurs projet il faut mettre pour connaitre notre driver
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try (Connection cn = DriverManager.getConnection(DBurl, user, password)) 
        {
        	

             	 String sql = "SELECT * FROM etudiant WHERE login = ? AND password = ?"; 
        	 try(PreparedStatement stmt = cn.prepareStatement(sql))
        	 {
        		 stmt.setString(1, login); //le 1 c'est le 1er point d'interogation quand on a dans la requêtte SQL
        		 stmt.setString(2 , password1); //le 2 c'est le 2eme point d'interogation quand on a dans la requêtte SQL
        		 try(ResultSet result = stmt.executeQuery())
        		 {
        			 if(result.next())
        			 {		 
        				 HttpSession session = request.getSession();
        				 session.setAttribute("login", login);
        				 response.sendRedirect(request.getContextPath() + "/Welcome.jsp"); //si le nom et pass sont remplicéé par ce que on a dans notre BD redirect vers une jsp welcomme et affichée un msg
        			 }else 
        			 {
        				 response.sendRedirect(request.getContextPath() + "/Loginjdbc.jsp");

        			 }
        		 }
        	 }
        	 
                 
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PrintWriter out= response.getWriter();
			 out.print("<p>hhhhh</p>");

		}
	
	}

}
