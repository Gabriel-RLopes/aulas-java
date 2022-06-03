/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guess4;

/**
 *
 * @author grgab
 */
public class Guess4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
        char ch, ignore, answer = 'k';
        
        do{
            System.out.println( "i'm thinking of a letter between a and z" );
            System.out.print( "can you guess it: ");
            
            ch = ( char ) System.in.read();
            
            do{
                ignore = ( char ) System.in.read();
            } while( ignore != '\n' );
            
            if( ch == answer ) System.out.println( "**RIGHT**" );
            else{
                System.out.print( "sorry, you are " );
                if( ch < answer ) System.out.println( "too low" );
                else System.out.println( "too high" );
                System.out.println( "try again!\n" );
            }
        } while( answer != ch );
        
    }
    
}
