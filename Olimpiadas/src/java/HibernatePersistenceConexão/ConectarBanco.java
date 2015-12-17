/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernatePersistenceConexão;
import sakila.util.HibernateUtil;
import org.hibernate.Session;
/**
 *
 * @author TATIANA
 */
public class ConectarBanco {
    public static Session conecta() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Conexão realizada com sucesso");
        return sessao;

    }
    
}
