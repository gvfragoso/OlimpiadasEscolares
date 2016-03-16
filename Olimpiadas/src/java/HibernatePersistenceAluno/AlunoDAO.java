
package HibernatePersistenceAluno;
import HibernatePersistenceConexão.ConectarBanco;
import sakila.util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.*;

public class AlunoDAO {
    
   private Session session;
    private Transaction transaction;
    public void salvar(Aluno aluno) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            this.session.save(aluno);
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
    public boolean existe(Aluno aluno) {
        boolean achou = false;
        try {
            Session sessao = ConectarBanco.conecta();
            Aluno user = null;
            user = (Aluno) sessao.createQuery("from aluno where matricula = ?").setParameter(0, aluno.getMatriculaAluno()).uniqueResult();
    
            if (user != null) {
                achou = true;
            }
            sessao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return achou;
    }

    public Aluno getUsuario(String login, String senha) {
        Aluno user = null;
        Session sessao = ConectarBanco.conecta();
        try {
            System.out.println("tentando");
            user = (Aluno) sessao.createQuery("from aluno where login = ? and senha = ?").setParameter(0, login).setParameter(1, senha).uniqueResult();
            System.out.println("ok");
            if (user == null) {
                System.out.println("erro");
            } else {
                System.out.println("user " + user.getNomeAluno());
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return user;
    }
}

