/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa3;

/**
 *
 * @author grgab
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioRecupera {
 
    private String nome;
    private String cidade;
    private String uf;
    
    private void selectFuncionario( int id ){
        ResultSet rs = null;
        try{
            Connection conexao = Conexao.criaConexao();
            
            String select = "Select nome, cidade, uf from funcionarios where id=" +Integer.toString( id ) ;
            PreparedStatement ps = conexao.prepareStatement( select );
            rs = ps.executeQuery();
            nome = rs.getString("nome");
            cidade = rs.getString("cidade");
            uf = rs.getString("uf");
        }catch( SQLException exc ){
            System.out.println("Erro de sql em select" + exc );
        }

    }
    
    public void insertFuncionarioRec( int id ){
        
        selectFuncionario( id );
        try{
            Connection conexao = Conexao.criaConexao();
            String insert = "Insert into funcionariosrec ( id, nome, cidade, uf ) VAlues( " 
                            + Integer.toString( id ) + ", '" + nome +
                            "', '"+ cidade + "', '"+ uf.trim() + "')";
            PreparedStatement pi = conexao.prepareStatement( insert );
            pi.executeUpdate();
        }catch( SQLException exc ){
            System.out.println("Erro de sql ao tentar fazer insert " + exc );
        }
    }
    
}
