
package HibernatePersistenceOrganizador;
import HibernatePersistenceConexão.ConectarBanco;
import sakila.util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.*;

public class OrganizadorDAO {
    
   private Session session;
    private Transaction transaction;
    public void salvar(Organizador organizador) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.session.save(organizador);
            this.transaction.commit();
            System.out.println("entrou aqui");
        }catch (HibernateException e) {
            System.out.println("erro, desculpa"
                    + e.getMessage());
            
        }finally {
            try {
                if (this.session.isOpen()) {
                    this.session.close();
                    
                }
            }catch (Throwable e) {
                System.out.println("erro :( "
                        + e.getMessage());
            }
        }
    }
    public boolean existe(Organizador organizador) {
        boolean achou = false;
        try {
            Session sessao = ConectarBanco.conecta();
            Organizador user = null;
            user = (Organizador) sessao.createQuery("from organizador where siape = ?").setParameter(0, organizador.getSiape()).uniqueResult();
    
            if (user != null) {
                achou = true;
            }
            sessao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return achou;
    }

    public Organizador getUsuario(String siape, String senha) {
        Organizador user = null;
        Session sessao = ConectarBanco.conecta();
        try {
            System.out.println("tentando");
            user = (Organizador) sessao.createQuery("from organizador where siape = ? and senha = ?").setParameter(0, siape).setParameter(1, senha).uniqueResult();
            System.out.println("ok");
            if (user == null) {
                System.out.println("erro");
            } else {
                System.out.println("user " + user.getNomeOrg());
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return user;
    }
}

