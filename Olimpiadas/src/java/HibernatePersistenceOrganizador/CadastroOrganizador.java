/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernatePersistenceOrganizador;
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
/**
 *
 * @author TATIANA
 */
public class CadastroOrganizador extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        System.out.println("teste");
        OrganizadorDAO organizadorHibernateDAO = new OrganizadorDAO();
        Organizador organizador = new Organizador();
        organizador.setSiape(request.getParameter("siape"));
        organizador.setNomeOrg(request.getParameter("nomeorg"));
        organizador.setCpfOrg(request.getParameter("cpforg"));
        organizador.setSenhaOrg(request.getParameter("senhaorg"));
        organizadorHibernateDAO.salvar(organizador); 
    }
    
}
