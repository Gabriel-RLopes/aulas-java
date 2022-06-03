/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakerr;

/**
 *
 * @author grgab
 */
public class BreakErr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        one: for( int i = 0; i < 3; i++){
            System.out.println( "Pass " + i + ":" );
        }
        
        for( int j = 0; j < 100; j++ ){
            if( j == 10 ) break one;
            System.out.print( j + " " );
        }
    }
    
}
