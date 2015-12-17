/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernatePersistenceAluno;
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
public class CadastroAluno extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        System.out.println("teste");
        AlunoDAO alunoHibernateDAO = new AlunoDAO();
        Aluno aluno = new Aluno();
        aluno.setNomeAluno(request.getParameter("nome"));
        aluno.setMatriculaAluno(request.getParameter("matricula"));
        aluno.setSerieAluno(request.getParameter("serie"));
        aluno.setLoginAluno(request.getParameter("login"));
        aluno.setSenhaAluno(request.getParameter("senha"));
        aluno.setDataAluno(request.getParameter("data"));
        alunoHibernateDAO.salvar(aluno); 
    }
    
}
