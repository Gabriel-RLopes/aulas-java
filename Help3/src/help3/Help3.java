/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package help3;

/**
 *
 * @author grgab
 */
public class Help3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
        char choice, ignore;
        
        for( ; ; ){
            do{
                System.out.println( "help on: ");
                System.out.println( "   1. if" );
                System.out.println( "   2. Switch" );
                System.out.println( "   3. for");
                System.out.println( "   4. while" );
                System.out.println( "   5. do while" );
                System.out.println( "   6. break" );
                System.out.println( "   7. continue\n" );
                System.out.print( "choose one ( q to quit): " );
                
                choice = ( char ) System.in.read();
            
                do{
                    ignore = ( char ) System.in.read();
                } while( ignore != '\n' );
            } while ( choice < '1' | choice > '7' & choice != 'q' );
            
            if( choice == 'q' ) break;
            System.out.println( "\n" );
            
            switch( choice ){
            case '1':
                System.out.println( "The if: \n" );
                System.out.println( "if( condition ) statement;" );
                System.out.println( "else statement;" );
                break;
            case '2':
                System.out.println( "The switch:\n" );
                System.out.println( "Switch( expression ) { " );
                System.out.println( "   case Constant:" );
                System.out.println( "      statement sequence" );
                System.out.println( "      break;" );
                System.out.println( "     // ..." );
                System.out.println( "}" );
                break;
            case '3':
                System.out.println( "The for:\n" );
                System.out.println( "for(  init; condition; iteration )" );
                System.out.println( "   statement;" );
                break;
            case '4':
                System.out.println( "The while: \n" );
                System.out.println( "while( condition ) statement; " );
                break;
            case '5':
                System.out.println( "The do-while:\n" );
                System.out.println( "do {" );
                System.out.println( "   statement;" );
                System.out.println( "} while( condition ); " );
                break;
            case '6':
                System.out.println( "The break: \n" );
                System.out.println( "break; or break label;" );
                break;
            case '7':
                System.out.println( "The continue\n" );
                System.out.println( "continue; or continue label;" );
                break;
        }
        System.out.println();
        }
    }
    
}
