/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findfac;

/**
 *
 * @author grgab
 */
public class FindFac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for( int i = 2; i <= 100; i++ ){
            System.out.print( "Factors of "+  i + ": " );
            for( int j = 2; j < i; j++ )
                if( ( i % j ) == 0 ) System.out.print( j + " " );
            System.out.println();
        }
    }
    
}
