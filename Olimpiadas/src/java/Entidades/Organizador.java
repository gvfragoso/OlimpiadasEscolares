package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;

import java.util.Date;
import javax.persistence.Id;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Entidades.ConectarBanco;
import Entidades.OrganizadorDAO;

public class Organizador implements Serializable
{

    private static final long serialVersionUID = 1L;

    private String siape;
    @Id
    private String nomeorg;
    private String cpforg;
    private String senhaorg;
   
    

    public final String getSiape() 
    {
        return siape;
    }

    public final void setSiape(String value) 
    {
        siape = value;
    }
    
    public final String getNomeOrg()
    {
        return nomeorg;
    }

    public final void setNomeOrg(String value)
    {
        nomeorg = value;
    }
    
    public final String getCpfOrg()
    {
        return cpforg;
    }

    public final void setCpfOrg(String value)
    {
        cpforg = value;
    }
    
    public final String getSenhaOrg()
    {
        return senhaorg;
    }

    public final void setSenhaOrg(String value)
    {
        senhaorg = value;
    }
  
    public Organizador(String siape)
    {
        super();
        this.siape = siape;
    }
    //public Aluno(String matricula, String login)
    //{
    //    super();
    //    this.matricula = matricula;
    //    this.nome = nome;
    //}
    
    public Organizador ()
    {
    }

    @Override
    public String toString()
    {
        return "Organizador [siape=" + siape + ", nomeorg=" + nomeorg +
             ", cpforg=" + cpforg + ", senhaorg=" + senhaorg + "]";
    }

    public String getSiapeOrganizador()
    {
        return siape;
    }

    public void setSiapeOrganizador(String siape)
    {
        this.siape = siape;
    }
    
    public void SalvarOrganizador()
    {
        String sql = "insert into organizador values (";    

        sql = sql + "'" + siape + "', ";  
        sql = sql + "'" + nomeorg + "', "; 
        sql = sql + "'" + cpforg + "', "; 
        sql = sql + "'" + senhaorg + "')";  

        ConectarBanco banco = new ConectarBanco();
        try
        {
            banco.SalvarObjeto(sql);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Organizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean aut(String userid, String password)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Organizador getNome(String userid)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}