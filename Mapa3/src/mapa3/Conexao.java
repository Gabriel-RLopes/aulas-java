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
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection criaConexao() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/mapa";
        String user = "root";
        String password = "senha1";
        
        Connection conexao = null;
        conexao = DriverManager.getConnection( url, user, password );
        
        return conexao;
    }
    
}
