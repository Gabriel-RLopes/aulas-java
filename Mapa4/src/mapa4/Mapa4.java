/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapa4;

import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author grgab
 */
public class Mapa4 {

    //mostra menu de opções
    public static void Menu( String[] options ){
        System.out.println("Menu de funcionarios");
        for( String option : options ){
            System.out.println(option);
        }
        System.out.println("Escolha sua opção:");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        
        String[] options = { "1 - Incluir",
                             "2 - Excluir",
                             "3 - Buscar funcionario",
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
            
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");

            
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
    
    }
    
    public static void optionRecuperar(){
        Scanner scan = new Scanner(System.in);
        int id;
        String nome, cidade, uf;
        Funcionario funcionario = new Funcionario();
        System.out.println("Informe o id para busca: ");
        id = scan.nextInt();
        funcionario.setId(id);
        funcionario.recuperar();
        nome = funcionario.getNome();
        cidade = funcionario.getCidade();
        uf = funcionario.getUf();
        
        System.out.println("ID: " + id );
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("UF: " + cidade);
    }
    
    public static void optionValidar(){
        Funcionario funcionario = new Funcionario();
        funcionario.validar();
    }
    
}