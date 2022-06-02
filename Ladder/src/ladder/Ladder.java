/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ladder;

/**
 *
 * @author grgab
 */
public class Ladder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        
        for( x = 0; x < 6; x++ ){
            if( x == 1 )
                System.out.println( "x is one" );
            else if( x == 2 ) 
                System.out.println( "x is two" );
            else if( x == 3 ) 
                System.out.println( "x is three" );
            else if ( x == 4 )
                System.out.println( "x is four" );
            else
                System.out.println( "x is not between 1 and 4" );
        }
    }
    
}
