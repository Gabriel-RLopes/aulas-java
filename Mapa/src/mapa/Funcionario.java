/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa;

/**
 *
 * @author grgab
 */
public class Funcionario implements ModeloCrud {
    
    private String nome;
    private String cidade;
    private String uf;
    private int id;
    
    //criado array estatico assim o mesmo array é utilizado para multiplas instancias de funcionarios
    private static String[][] funcionarios = new String[ 10 ][ 4 ];
    private static String[] recuperar = new String[ 4 ];
    
    //getters e setters
    public void   setNome( String name )   { nome = name;     }
    public String getNome()                { return nome;     }
    public void   setCidade( String city ) { cidade = city;   }
    public String getCidade()              { return cidade;   }
    public void   setUf( String state )    { uf = state;      }
    public String getUf()                  { return uf;       }
    public void   setId( int identifier )  { id = identifier; }
    public int    getId()                  { return id;       }
    
    //mensagem de erro
    public void   errMessage()             { System.out.println( "Erro de acesso ao array, posição não encontrada ou excede o limite do array" ); }
    
    //metodo para imprimir na tela valores do array de funcionarios.
    public void show(){
        for( int i = 0; i < funcionarios.length; i++ ){
            if( funcionarios[ i ][ 0 ] == null ) break;
            for( int j = 0; j < funcionarios[ i ].length; j++ ){
                System.out.print( funcionarios[ i ][ j ] + " ");
            } 
          
            System.out.println();
        }
        System.out.println();
    }
    
    /*No metódo incluir é feita uma rotina para adicionar ao array 
    uma posição com os dados do funcionario informados no contrutor ao instanciar a classe
    */
    @Override
    public void incluir(){
        int i;
        
        try{
            for( i = 0; i < funcionarios.length; i++ ){
                if( funcionarios[ i ][ 0 ] == null ) break;
            }
        
            funcionarios[ i ][ 0 ] = Integer.toString( id );
            funcionarios[ i ][ 1 ] = nome;
            funcionarios[ i ][ 2 ] = cidade;
            funcionarios[ i ][ 3 ] = uf;
        } catch( ArrayIndexOutOfBoundsException exc ){
            errMessage();
        }
        
    }
    
    /* No método excluir é feita a exclusao do funcionarios cojo id foi informado 
    o mesmo faz o redimencionamento do array movendo todos como uma fila deixando a ultima posição livre*/
    @Override
    public void excluir(){
        int j;
        
        try{
            if( funcionarios[0][0] == null ) throw new ArrayIndexOutOfBoundsException();
            for( j = 0; j < funcionarios.length; j++ ){
                if( id == Integer.parseInt( funcionarios[ j ][ 0 ] ) ) break;
            }
            
            for( int i = 0; i < funcionarios[ j ].length; i++ ){
                recuperar[ i ] = funcionarios[ j ][ i ];
                funcionarios[ j ][ i ] = null;
            }
            
            for( int i = j; i < funcionarios.length; i++ ){
                if( funcionarios[ i+1 ][ 0 ] != null )
                    for( int y = 0; y < funcionarios[ i ].length; y++ ){
                        funcionarios[ i ][ y ] = funcionarios[ i + 1 ][ y ];
                        funcionarios[ i + 1 ][ y ] = null;
                    }
                else
                    break;
            }
            
            nome = null;
            cidade = null;
            id = 0;
            uf = null;
            
        }catch( ArrayIndexOutOfBoundsException exc ){
            errMessage();
        }
    }
    
    /* Faz a recuperação do ultimo item excluido do array */
    @Override
    public void recuperar(){
        int i;
        
        try{ 
            for( i = 0; i < funcionarios.length; i++ ){
                if( funcionarios[ i ][ 0 ] == null ) break;
                else if( i == ( 1 - ( funcionarios.length ) ) ) 
                    throw new ArrayIndexOutOfBoundsException();
            }
            
            for( int j = 0; j < funcionarios[ i ].length; j++ ){
                if( recuperar[ j ] == null ) break;
                funcionarios[ i ][ j ] = recuperar[ j ];
            }
            
        } catch( ArrayIndexOutOfBoundsException exc ){
            errMessage();
        }
    }
    
    /* altera o item do array cujo id seja igual ao informado na chamada do método */
    @Override
    public void alterar(){
        int i;
        
        try{ 
            if( funcionarios[0][0] == null ) throw new ArrayIndexOutOfBoundsException();
            for( i = 0; i < funcionarios.length; i++ ){
                if( Integer.parseInt( funcionarios[ i ][ 0 ] ) == id ) break;
                else if( funcionarios[ i ][ 1 ].equals( nome ) ) break;
                else if( i == ( funcionarios.length -1 ) )
                    throw new ArrayIndexOutOfBoundsException();
            }
            
            funcionarios[ i ][ 0 ] = Integer.toString( id );
            funcionarios[ i ][ 1 ] = nome;
            funcionarios[ i ][ 2 ] = cidade;
            funcionarios[ i ][ 3 ] = uf;
            
        }catch( ArrayIndexOutOfBoundsException exc ){
            errMessage();
        }
        
    }
    
    @Override
    public void validar(){
        if( funcionarios[0][0] == null )
            System.out.println("Nenhum funcionario incluido na fila atualmente!");
        else
            System.out.println("Funcionarios na fila: " + contaFuncionarios() );
    }
    
    public int contaFuncionarios(){
        int i;
        for( i =0; i < funcionarios.length; i++ )
            if( funcionarios[i][0] == null ) break;
        
        return i;
    }
    
}
