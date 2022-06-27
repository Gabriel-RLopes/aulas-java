/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapa;

/**
 *
 * @author grgab
 */

import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.exit;

public class Mapa {

    /**
     * @param args the command line arguments
     */
    //mostra menu de opções
    public static void Menu( String[] options ){
        System.out.println("Menu de funcionarios");
        for( String option : options ){
            System.out.println(option);
        }
        System.out.println("Escolha sua opção:");
    }
    
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        
        String[] options = { "1 - Incluir",
                             "2 - Excluir",
                             "3 - Recuperar Ultimo excluido",
                             "4 - alterar",
                             "5 - valida funcionarios na fila",
                             "6 - Exit" };
        Scanner scan = new Scanner( System.in );
        int option = 1;
        
        do {
            
            Menu( options );
            try {
                option = scan.nextInt();
                //chama a opção correspondente
                switch( option ){
                    case 1: optionIncluir(); break;
                    case 2: optionExcluir(); break;
                    case 3: optionRecuperar(); break;
                    case 4: optionAlterar(); break;
                    case 5: optionValidar(); break;
                    case 6: exit( 0 );
                }
            } catch( Exception ex ){
                System.out.println("Um erro inesperado ocorrreu tente novamente");
                System.out.println("Por favor entre com uma opção entre 1 e " + options.length );
                scan.next();
            }
            
        }while( option != 6 );
        
    }
    
    //faz a chamada do metódo incluir
    public static void optionIncluir(){
        
        Scanner scan = new Scanner( System.in );
        String nome, cidade, uf;
        int id;
        Funcionario funcionario = new Funcionario();
        
        System.out.print("Informa o Id do funcionario: ");
        id = scan.nextInt();
        funcionario.setId(id);
        
        System.out.print("Informe o nome do funcionario: ");
        nome = scan.next();
        funcionario.setNome(nome);
        
        System.out.print("Informe a cidade do funcionario: ");
        cidade = scan.next();
        funcionario.setCidade(cidade);
        
        System.out.print("Informe o estado da cidade do funcionario: ");
        uf = scan.next();
        funcionario.setUf(uf);
        
        funcionario.incluir();
        funcionario.show();
        
    }
    
    // faz a chamada do metodo excluir
    public static void optionExcluir(){
        int id;
        Scanner scan = new Scanner( System.in );
        Funcionario funcionario = new Funcionario();
        
        System.out.println( "informe o Id do funcionario a ser excluido: " );
        id = scan.nextInt();
        funcionario.setId( id );
        
        funcionario.excluir();
        funcionario.show();
    }
    
    // faz a chamada do metodo recuperar
    public static void optionRecuperar(){
        Funcionario funcionario = new Funcionario();
        
        funcionario.recuperar();
        funcionario.show();
    }
    
    // faz chamada do metodo alterar
    public static void optionAlterar(){
        
        Scanner scan = new Scanner( System.in );
        String nome, cidade, uf;
        int id;
        Funcionario funcionario = new Funcionario();
        
        System.out.print( "Informa o Id do funcionario: " );
        id = scan.nextInt();
        funcionario.setId( id );
        
        System.out.print( "Informe o nome do funcionario: " );
        nome = scan.next();
        funcionario.setNome( nome );
        
        System.out.print( "Informe a cidade do funcionario: " );
        cidade = scan.next();
        funcionario.setCidade( cidade );
        
        System.out.print( "Informe o estado da cidade do funcionario: " );
        uf = scan.next();
        funcionario.setUf( uf );
        
        funcionario.alterar();
        funcionario.show();
    
    }
    
    public static void optionValidar(){
        Funcionario funcionario = new Funcionario();
        funcionario.validar();
    }
    
}
