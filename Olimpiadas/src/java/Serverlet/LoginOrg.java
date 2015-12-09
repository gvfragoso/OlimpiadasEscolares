package Serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entidades.Organizador;
import Entidades.OrganizadorDAO;
import Entidades.ConectarBanco;

@WebServlet(name = "loginOrg", urlPatterns = {"/LoginOrg"})

public class LoginOrg extends HttpServlet
{

    //private static final long serialVersionUID = 7633293501883840556L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession(); //obtem a sessao do usuario, caso exista

        Organizador user = null;
        String siape = request.getParameter("siape"); // Pega o Login vindo do formulario
        String  senhaorg = request.getParameter("senhaorg"); //Pega a senha vinda do formulario

        try
        {
            OrganizadorDAO dao = new OrganizadorDAO(); //cria uma instancia do DAO usuario
            user = dao.getOrganizador(siape, senhaorg);
        }
        catch (Exception e)
        {

        }

        //se nao encontrou usuario no banco, redireciona para a pagina de erro!
        if (user != null)
        {
            //se o dao retornar um usuario, coloca o mesmo na sessao
            session.setAttribute("user", user);
            request.getRequestDispatcher("modalidades.jsp").forward(request, response);
        }
        else
        {
            session.invalidate();
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Acesso negado, desculpe');");
            out.println("location='pagInicial.jsp';");
            out.println("</script>");
            //request.getRequestDispatcher("pagInicial.jsp").forward(request, response);//
            System.out.println("NÃO FUNCIONOU");
        }
    }
}
