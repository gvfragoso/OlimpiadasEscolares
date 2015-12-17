/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernatePersistenceAluno;
import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Entity;

import HibernatePersistenceConexão.ConectarBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author TATIANA
 */
public class Aluno implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String nome;

    public final String getNomeAluno() {
        return nome;
    }

    public final void setNomeAluno(String value) {
        nome = value;
    }

    private String serie;

    public final String getSerieAluno() {
        return serie;
    }

    public final void setSerieAluno(String value) {
        serie = value;
    }
    
    private String login;

    public final String getLoginAluno() {
        return login;
    }

    public final void setLoginAluno(String value) {
        login = value;
    }
    
    private String senha;

    public final String getSenhaAluno() {
        return senha;
    }

    public final void setSenhaAluno(String value) {
        senha = value;
    }
    
    private String data;

    public final String getDataAluno() {
        return data;
    }

    public final void setDataAluno(String value) {
        data = value;
    }
    
    @Id
    private String matricula;

    public final String getMatriculaAluno() {
        return matricula;
    }

    public final void setMatriculaAluno(String value) {
        this.matricula = value;
    }

    
    public Aluno(String nome)
    {
        super();
        this.nome = nome;
    }

    public Aluno(String nome, String matricula)
    {
        super();
        this.nome = nome;
        this.matricula = matricula;
    }
    public Aluno ()
    {
    
    }
    
}
