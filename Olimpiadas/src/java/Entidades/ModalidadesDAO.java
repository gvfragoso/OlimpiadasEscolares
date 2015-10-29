package Entidades;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entidades.Modalidades;

public class ModalidadesDAO extends ConectarBanco
{
    public void inserir(Modalidades modalidades)
    {
        try
        {
            Connection conexao = CriaConexao();
            PreparedStatement pstm = conexao.prepareStatement("Insert into modalidades (modalidade1, modalidade2, modalidade3, modalidade4, modalidade5) values	(?,?,?,?,?)");
            pstm.setString(1, modalidades.getModalidade1());
            pstm.setString(2, modalidades.getModalidade2());
            pstm.setString(3, modalidades.getModalidade3());
            pstm.setString(4, modalidades.getModalidade4());
            pstm.setString(5, modalidades.getModalidade5());
            pstm.execute();
            pstm.close();
            conexao.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
