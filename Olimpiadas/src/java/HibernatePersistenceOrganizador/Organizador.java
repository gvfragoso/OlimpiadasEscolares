/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernatePersistenceOrganizador;
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
public class Organizador implements Serializable{
    private static final long serialVersionUID = 1L;

    private String nomeorg;

    public final String getNomeOrg() {
        return nomeorg;
    }

    public final void setNomeOrg(String value) {
        nomeorg = value;
    }
    
    private String cpforg;

    public final String getCpfOrg() {
        return cpforg;
    }

    public final void setCpfOrg(String value) {
        cpforg = value;
    }
    
    private String senhaorg;

    public final String getSenhaOrg() {
        return senhaorg;
    }

    public final void setSenhaOrg(String value) {
        senhaorg = value;
    }
    
    @Id
    private String siape;

    public final String getSiape() {
        return siape;
    }

    public final void setSiape(String value) {
        this.siape = value;
    }

    
    public Organizador(String siape)
    {
        super();
        this.siape = siape;
    }

    public Organizador(String nomeorg, String siape)
    {
        super();
        this.nomeorg = nomeorg;
        this.siape = siape;
    }
    public Organizador ()
    {
    
    }
    
}
