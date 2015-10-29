package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;

import java.util.Date;
import javax.persistence.Id;

import Entidades.ConectarBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modalidades implements Serializable {

    private static final long serialVersionUID = 1L;

    private String modalidade1;
    private String modalidade2;
    private String modalidade3;
    @Id
    private String modalidade4;
    private String modalidade5;     

    public final String getModalidade1() //get pegar
    {
        return modalidade1;
    }

    public final void setModalidade1(String value) //set definir
    {
        modalidade1 = value;
    }

    public final String getModalidade2() //get pegar
    {
        return modalidade2;
    }

    public final void setModalidade2(String value) //set definir
    {
        modalidade2 = value;
    }

    public final String getModalidade3()
    {
        return modalidade3;
    }

    public final void setModalidade3(String value)
    {
        modalidade3 = value;
    }

    public final String getModalidade4()
    {
        return modalidade4;
    }

    public final void setModalidade4(String value)
    {
        modalidade4 = value;
    }

    public final String getModalidade5()
    {
        return modalidade5;
    }

    public final void setModalidade5(String value)
    {
        modalidade5 = value;
    }

    public Modalidades(String modalidade1)
    {
        super();
        this.modalidade1 = modalidade1;
    }

    //public Perturbador(String emailperturbador, String nome)
    //{
    //    super();
    //    this.emailperturbador = emailperturbador;
    //    this.nomeperturbador = nomeperturbador;
    //}
    
    public Modalidades ()
    {
    }

    @Override
    public String toString() {
        return "modalidades [modalidade1=" + modalidade1 + ", modalidade2=" + modalidade2
                + ", modalidade3=" + modalidade3
                + ", modalidade4=" + modalidade4
                + ", modalidade5=" + modalidade5 + "]";
    }

    //public String getModalidade1()
    //{
    //    return modalidade1;
    //}

    //public void setModalidade1(String modalidade1)
    //{
    //    this.modalidade1 = modalidade1;
    //}
    

    public void SalvarModalidade()
    {
        String sql = "insert into modalidades values (";    //insere na tabela perturbador

        sql = sql + "'" + modalidade1 + "', ";  //insere os dados digitados na caixa E-MAIL na coluna email
        sql = sql + "'" + modalidade2 + "', ";   //insere os dados digitados na caixa SENHA na coluna senha
        sql = sql + "'" + modalidade3 + "', ";   //insere os dados digitados na caixa SEXO na coluna sexo
        sql = sql + "'" + modalidade4 + "', ";   //insere os dados digitados na caixa TELEFONE na coluna telefone
        sql = sql + "'" + modalidade5 + "')";   //insere os dados digitados na caixa NOME na coluna nome

        ConectarBanco banco = new ConectarBanco();
        try
        {
            banco.SalvarObjeto(sql);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Modalidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean aut(String userid, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Modalidades getModalidadeE1(String userid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
