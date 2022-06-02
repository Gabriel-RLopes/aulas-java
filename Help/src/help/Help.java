/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package help;

/**
 *
 * @author grgab
 */
public class Help {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
        char choice;
        
        System.out.println( "Help on: \n  1. if\n  2. switch\nChoose one" );
        choice = ( char ) System.in.read();
        
        System.out.println("\n");
        
        switch( choice ){
            case '1':
                System.out.println( "the if\nif( condition ) statement;\nelse statement;" );
                break;
            case '2':
                System.out.println( "the switch: \n switch( expression )"
                                  + " {\n   case constant:\n      "
                                  + "statement sequence\n      break;\n   //...\n}" );
                break;
            default:
                System.out.println( "Selection not found." );
        }
        
    }
    
}
