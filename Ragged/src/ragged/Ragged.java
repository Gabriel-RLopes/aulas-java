/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ragged;

/**
 *
 * @author grgab
 */
public class Ragged {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int riders[][] = new int[ 7 ][];
        int i, j;
        
        riders[ 0 ] = new int[ 10 ];
        riders[ 1 ] = new int[ 10 ];
        riders[ 2 ] = new int[ 10 ];
        riders[ 3 ] = new int[ 10 ];
        riders[ 4 ] = new int[ 10 ];
        riders[ 5 ] = new int[ 2 ];
        riders[ 6 ] = new int[ 2 ];
        
        for( i = 0; i < 5; i++ )
            for( j = 0; j < 10; j++ )
                riders[ i ][ j ] = i + j + 10;
        for( i = 5; i < 7; i++ )
            for( j = 0; j < 2; j++ )
                riders[ i ][ j ] = i + j + 10;
        
        System.out.println( "Riders per trip during the week: " );
        for( i = 0; i < 5; i++){
            for( j = 0; j < 10; j++ )
                System.out.print( riders[ i ][ j ] + " " );
            System.out.println();
        }
        
        System.out.println( "riders per trip on the weekend: " );
        for( i = 5; i < 7; i++ ){
            for( j = 0; j < 2; j++ )
                System.out.print( riders[ i ][ j ] +  " " );
            System.out.println();
        }
            
    }
    
}
