package Entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;  

public class ConectarBanco
{
    public Connection CriaConexao()
    {
        Connection conexao = null;
        String usuario = "postgres";
        String senha = "postgres";
        String nomeBancoDados = "olimpiadas";

        try
        {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + nomeBancoDados, usuario, senha);
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");  
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conexao;
    }

    public final void SalvarObjeto(String sql) throws SQLException
    {
        Connection con = CriaConexao();

        Statement stm = con.createStatement();
        stm.execute(sql);
        con.commit();
    }    
}
