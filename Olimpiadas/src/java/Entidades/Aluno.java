package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;

import java.util.Date;
import javax.persistence.Id;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Entidades.ConectarBanco;
import Entidades.AlunoDAO;

public class Aluno implements Serializable
{

    private static final long serialVersionUID = 1L;

    private String nome;
    @Id
    private String matricula;
    private String serie;
    private String login; 
    private String senha;
    private String data;
    

    public final String getNome() //get pegar
    {
        return nome;
    }

    public final void setNome(String value) //set definir
    {
        nome = value;
    }
    
    public final String getMatricula()
    {
        return matricula;
    }

    public final void setMatricula(String value)
    {
        matricula = value;
    }
    
    public final String getSerie()
    {
        return serie;
    }

    public final void setSerie(String value)
    {
        serie = value;
    }
    
    public final String getLogin()
    {
        return login;
    }

    public final void setLogin(String value)
    {
        login = value;
    }
    
    public final String getSenha() //get pegar
    {
        return senha;
    }

    public final void setSenha(String value) //set definir
    {
        senha = value;
    }
       public final String getData()
    {
        return data;
    }

    public final void setData(String value)
    {
        data = value;
    }

    public Aluno(String matricula)
    {
        super();
        this.matricula = matricula;
    }
    //public Aluno(String matricula, String login)
    //{
    //    super();
    //    this.matricula = matricula;
    //    this.nome = nome;
    //}
    
    public Aluno ()
    {
    }

    @Override
    public String toString()
    {
        return "Aluno [nome=" + nome + ", matricula=" + matricula
                + ", serie=" + serie + ", login=" + login
                + ", senha=" + senha + ", data=" + data + "]";
    }

    public String getMatriculaAluno()
    {
        return matricula;
    }

    public void setMatriculaAluno(String matricula)
    {
        this.matricula = matricula;
    }
    
    public void SalvarAluno()
    {
        String sql = "insert into aluno values (";    

        sql = sql + "'" + nome + "', ";  
        sql = sql + "'" + matricula + "', ";   
        sql = sql + "'" + serie + "', ";   
        sql = sql + "'" + login + "', ";
        sql = sql + "'" + senha + "', ";   
        sql = sql + "'" + data + "')";  

        ConectarBanco banco = new ConectarBanco();
        try
        {
            banco.SalvarObjeto(sql);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean aut(String userid, String password)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Aluno getNome(String userid)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}