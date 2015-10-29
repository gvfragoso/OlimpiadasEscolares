package Entidades;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Entidades.Time;

public class TimeDAO extends ConectarBanco
{
    public void inserir(Time time)
    {
        try
        {
            Connection conexao = CriaConexao();
            PreparedStatement pstm = conexao.prepareStatement("insert into time (nomejogador, matriculajogador, nometime) values (?,?,?)");
            pstm.setString(1, time.getNomeJogador());
            pstm.setString(2, time.getMatriculaJogador());
            pstm.setString(3, time.getNomeTime());
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