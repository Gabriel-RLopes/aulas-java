/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guess2;

/**
 *
 * @author grgab
 */
public class Guess2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
        char ch, answer = 'K';
        
        System.out.println( "i'm thinking of a letter between A and Z." );
        System.out.print( "Can you guess it: " );
        
        ch = ( char ) System.in.read();
        
        if( ch == answer ) System.out.println( "**RIGHT**" );
        else System.out.println( "...Sorry you are wrong." );
    }
    
}
