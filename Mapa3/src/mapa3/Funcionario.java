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
import java.sql.ResultSet;

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
                         + Integer.toString( id ) + ", '" + nome + "', '"+ cidade + "', '"+ uf + "')"; 
            PreparedStatement ps = conexao.prepareStatement( sql );
            ps.execute();
        }catch( SQLException exc ){
            System.out.println( "Erro de sql" + exc );
        }
    }
    
    @Override
    public void alterar(){
        
        try{
            Connection conexao = Conexao.criaConexao();
            String sql = "UPDATE funcionarios SET nome=?, cidade=?, uf=? where id=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString( 1, nome );
            ps.setString( 2, cidade );
            ps.setString( 3, uf );
            ps.setString( 4, Integer.toString( id ) );
            
            int retorno = ps.executeUpdate();
            if( retorno > 0 ){
                System.out.println("Registro alterado");
            } else {
                System.out.println("Não foi possivel alterar o registro");
            }
        }catch( SQLException exc ){
            System.out.println("Erro de sql" + exc );
        }
        
    }
    
    @Override
    public void excluir(){
        try{
            Connection conexao = Conexao.criaConexao();
            FuncionarioRecupera funcionario = new FuncionarioRecupera();
            
            funcionario.insertFuncionarioRec(id);
            
            String sql = "DELETE FROM funcionarios WHERE id=?";
            PreparedStatement pd = conexao.prepareStatement( sql );
            pd.setString( 1, Integer.toString( id ) );
            
            int retorno = pd.executeUpdate();
            if( retorno > 0 ){
                System.out.println("Registro deletado com sucesso");
            }else{
                System.out.println("Não foi possivel deletar registro");
            }
        }catch( SQLException exc ){
            System.out.println("ERRO de sql" + exc );
        }
    }
    
    @Override
    public void recuperar(){
        
    }
    
    @Override
    public void validar(){
        
    }
}
