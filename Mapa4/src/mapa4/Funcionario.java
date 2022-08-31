/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author grgab
 */
public class Funcionario implements ModeloCrud {
    
    private int    id    ;
    private String nome  ;
    private String cidade;
    private String uf    ;
    
    public void   setId( int n )        { id     = n   ; }
    public void   setNome( String s )   { nome   = s   ; }
    public void   setCidade( String s ) { cidade = s   ; }
    public void   setUf( String s )     { uf     = s   ; }
    
    public int    getId()               { return id    ; }
    public String getNome()             { return nome  ; }
    public String getCidade()           { return cidade; }
    public String getUf()               { return uf    ; }
    
    @Override
    public void incluir(){
        //criar conexao
        Connection conexao;
        
        try{
            conexao = Conexao.criaConexao();
            
            //preparar query
            String sql = "INSERT INTO funcionario( id, nome, cidade, uf ) VALUES ( "
                    + Integer.toString( id ) + ", '" + nome + "', '"+ cidade
                    + "', '"+ uf + "')";
            PreparedStatement ps = conexao.prepareStatement(sql);
            //executar comando query
            int retorno = ps.executeUpdate();
            //exibir resposta
            if ( retorno > 0 )
                System.out.println("gravado com sucesso");
            else
                System.out.println("Não foi possivel gravar");
        } catch( SQLException exc ){
            System.out.println("Erro de sql " + exc);
        }
    }
    
    @Override
    public void alterar(){
        try{
            Connection conexao = Conexao.criaConexao();
            String sql = "UPDATE funcionario SET nome=?, cidade=?, uf=? where id=?";
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
            String sql = "DELETE FROM funcionario WHERE id=?";
            PreparedStatement pd = conexao.prepareStatement(sql);
            pd.setString(1, Integer.toString(id));
            
            int retorno = pd.executeUpdate();
            if( retorno > 0 ){
                System.out.println("Registro deletado com sucesso");
            }else{
                System.out.println("Não foi possivel deletar registro");
            }
        }catch(SQLException exc){
            System.out.println("ERRO de sql" + exc);
        }
    }
    
    @Override
    public void recuperar(){
        try{
            Connection conn = Conexao.criaConexao();
            String sql = "Select nome, cidade, uf from funcionario where id=" + Integer.toString(id);
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while( rs.next() ){
            
                nome = rs.getString("nome");
                cidade = rs.getString("cidade");
                uf = rs.getString("uf");
            }
            
        }catch( SQLException e ){
            System.out.println("erro de sql " );
            e.printStackTrace();
        }
    }
    
    @Override
    public void validar(){
        try{
            Connection conn = Conexao.criaConexao();
            String sql = "Select count(*) from funcionario";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(  rs.next() ){ 
                int count = rs.getInt(1);
                System.out.printf("Numero de funcionarios na fila %d", count);
            }
        }catch( SQLException e ){
            System.out.println("erro de sql " + e);
        }
    }
    
}
