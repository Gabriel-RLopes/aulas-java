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
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Funcionario implements ModeloCrud {
    private int id;
    private String nome;
    private String cidade;
    private String uf;
    
    public void setId( int i ){ id = i; }
    public void setNome( String n ){ nome = n; }
    public void setCidade( String c ){ cidade = c; }
    public void setUf( String u ) { uf = u; }
    
    public int getId(){ return id; }
    public String getNome(){ return nome; }
    public String getCidade(){ return cidade; }
    public String getUf(){ return uf; }
    
    @Override
    public void incluir(){
        
        try{
            Connection conexao = Conexao.criaConexao();
            String sql = "INSERT INTO funcionarios ( id, nome, cidade, uf ) VAlues( " 
                         + Integer.toString(id) + ", '" + nome + "', '"+ cidade + "', '"+ uf + "')"; 
            PreparedStatement ps = conexao.prepareStatement( sql );
            ps.execute();
            conexao.commit();
        }catch( SQLException exc ){
            System.out.println("Erro de sql");
        }
    }
    
    @Override
    public void alterar(){
        
    }
    
    @Override
    public void excluir(){
        
    }
    
    @Override
    public void recuperar(){
        
    }
    
    @Override
    public void validar(){
        
    }
}
