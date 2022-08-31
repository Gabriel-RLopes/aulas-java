/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa4;

/**
 *
 * @author grgab
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection criaConexao() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/mapa?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "senha1";
        
        Connection conexao = null;
        
        try{
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            }catch( ClassNotFoundException e ){
                System.out.println("Driver não encontrado! " + e);
            }
            conexao = DriverManager.getConnection( url, user, password );
        }catch( SQLException exc ){
            exc.printStackTrace();
        }
        
        return conexao;
    }
    
}
