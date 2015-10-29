package Entidades;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entidades.Aluno;
import Entidades.ConectarBanco;
import java.sql.SQLException;

public class AlunoDAO extends ConectarBanco
{
   
    public void inserir(Aluno aluno)
    {
        try
        {
            Connection conexao = CriaConexao();
            PreparedStatement pstm = conexao.prepareStatement("Insert into aluno (nome, matricula, serie, login, senha, data) values (?,?,?,?,?,?)");
            pstm.setString(1, aluno.getNome());
            pstm.setString(2, aluno.getMatricula());
            pstm.setString(3, aluno.getSerie());
            pstm.setString(4, aluno.getLogin());
            pstm.setString(5, aluno.getSenha());
            pstm.setString(6, aluno.getData());
            pstm.execute();
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public boolean existe(Aluno aluno)
    {
        boolean achou = false;
        try
        {
            Connection conexao = CriaConexao();
            PreparedStatement pstm = conexao.prepareStatement("Select * from aluno where matricula = ?");
            pstm.setString(2, aluno.getMatricula());
            ResultSet rs = pstm.executeQuery();
            if (rs.next())
            {
                achou = true;
            }
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return achou;
    }
    
    public Aluno getAluno( String matricula, String senha )
    {
        Connection conexao = CriaConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            ps = conexao.prepareStatement("select * from aluno where matricula = ? and senha = ?");
            ps.setString(1, matricula);
            ps.setString(2, senha);
 
            
            rs = ps.executeQuery();
            System.out.println("o nome da tabela é aluno, o  nome é " + matricula + " e a senha é " + senha);
 
            
            
            if ( rs.next() )
            {
                Aluno user = new Aluno();
                user.setMatricula(matricula);
                user.setSenha(senha);
 
                return user;
            }
            else
            {
                System.out.println("VOLTOU NADA DA BASE, MANO! LOKO!!!");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (rs != null )
            {
                try { rs.close();
                }
                catch (SQLException e)
                {
                    ;
                }
                rs = null;
            }
            if (ps != null )
            {
                try { ps.close();
                } catch (SQLException e)
                {
                    ;
                }
                ps = null;
            }
            if (conexao != null )
            {
                try { conexao.close();
                } catch (SQLException e)
                {
                    ;
                }
                conexao = null;
            }
        }
        return null;
    }
}