import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/InscriptionSrvlt")
public class InscriptionSrvlt extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public InscriptionSrvlt() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String DBurl = "jdbc:mysql://localhost:3309/projet_plateforme_enligne";
        String user = "root";
        String password = "H130407184";

        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String niveau = request.getParameter("niveau");
        String login = request.getParameter("login");
        String password1 = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection cn = DriverManager.getConnection(DBurl, user, password)) {
            String sql = "INSERT INTO etudiant (nom, prenom, email, niveau, login, password1) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = cn.prepareStatement(sql)) {
                stmt.setString(1, nom);
                stmt.setString(2, prenom);
                stmt.setString(3, email);
                stmt.setString(4, niveau);
                stmt.setString(5, login);
                stmt.setString(6, password1);

                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    HttpSession session = request.getSession();
                    session.setAttribute("nom", nom);
                    session.setAttribute("prenom", prenom);
                    
                } else {
                    response.sendRedirect(request.getContextPath() + "/Loginjdbc.jsp");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
