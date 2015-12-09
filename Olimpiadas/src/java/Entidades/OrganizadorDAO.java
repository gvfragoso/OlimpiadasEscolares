package Entidades;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entidades.Organizador;
import Entidades.ConectarBanco;
import java.sql.SQLException;

public class OrganizadorDAO extends ConectarBanco
{
   
    public void inserir(Organizador organizador)
    {
        try
        {
            Connection conexao = CriaConexao();
            PreparedStatement pstm = conexao.prepareStatement("Insert into organizador (siape, nomeorg, cpforg, senhaorg) values (?,?,?,?)");
            pstm.setString(1, organizador.getSiape());
            pstm.setString(2, organizador.getNomeOrg());
            pstm.setString(3, organizador.getCpfOrg());
            pstm.setString(4, organizador.getSenhaOrg());
            pstm.execute();
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public boolean existe(Organizador organizador)
    {
        boolean achou = false;
        try
        {
            Connection conexao = CriaConexao();
            PreparedStatement pstm = conexao.prepareStatement("select * from organizador where siape = ?");
            pstm.setString(1, organizador.getSiape());
            ResultSet rs = pstm.executeQuery();
            if (rs.next())
            {
                achou = true;
            }
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return achou;
    }
    
    public Organizador getOrganizador( String siape, String senhaorg )
    {
        Connection conexao = CriaConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            ps = conexao.prepareStatement("select * from organizador where siape = ? and senha = ?");
            ps.setString(1, siape);
            ps.setString(4, senhaorg);
            rs = ps.executeQuery();
            System.out.println("o nome da tabela é organizador, o  siape é" + siape + " e a senha é" + senhaorg);
 
            
            
            if ( rs.next() )
            {
                Organizador user = new Organizador();
                user.setSiape(siape);
 
                return user;
            }
            else
            {
                System.out.println("Desculpa, estamos tentando resolver esse problema");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (rs != null )
            {
                try { rs.close();
                }
                catch (SQLException e)
                {
                    ;
                }
                rs = null;
            }
            if (ps != null )
            {
                try { ps.close();
                } catch (SQLException e)
                {
                    ;
                }
                ps = null;
            }
            if (conexao != null )
            {
                try { conexao.close();
                } catch (SQLException e)
                {
                    ;
                }
                conexao = null;
            }
        }
        return null;
    }
}