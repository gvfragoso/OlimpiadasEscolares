package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;

import java.util.Date;
import javax.persistence.Id;

import Entidades.ConectarBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Time
{

    private String nomejogador;
    private String matriculajogador;
    private String nometime;
    
    public final String getNomeJogador() //get pegar
    {
        return nomejogador;
    }

    public final void setNomeJogador(String value) //set definir
    {
        nomejogador = value;
    }

    public final String getMatriculaJogador()
    {
        return matriculajogador;
    }

    public final void setMatriculaJogador(String value)
    {
        matriculajogador = value;
    }

    public final String getNomeTime()
    {
        return nometime;
    }

    public final void setNomeTime(String value)
    {
        nometime = value;
    }
    public Time(String nometime)
    {
        super();
        this.nometime = nometime;
    }
    public Time()
    {
    }
    
    public String toString() {
        return "Time [nomejogador=" + nomejogador +
                ", matriculajogador=" + matriculajogador +
                ", nometime=" + nometime + "]";
    }
    
    public void SalvarTime()
    {
        String sql = "insert into time values (";
        
        sql = sql + "'" + nomejogador + "', ";
        sql = sql + "'" + matriculajogador + "', ";
        sql = sql + "'" + nometime +  "')";
        
        ConectarBanco banco = new ConectarBanco();
        try
        {
            banco.SalvarObjeto(sql);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}