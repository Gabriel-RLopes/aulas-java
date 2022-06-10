/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble;

/**
 *
 * @author grgab
 */
public class Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
        int a, b, t, size;
        
        size = 10;
        
        System.out.print( "original Array is: " );
        for( int i = 0; i < size; i++ )
            System.out.print( " " + nums[ i ] );
        System.out.println();
        
        for( a = 1; a < size; a++ )
            for( b = size - 1; b >= a; b-- ){
                if( nums[ b-1 ] > nums[ b ] ){
                    t = nums[ b - 1 ];
                    nums[ b - 1 ] = nums[ b ];
                    nums[ b ] = t;
                }
            }
        
        System.out.print( "Sorted array is: " );
        for( int i = 0; i < size; i++ )
            System.out.print( " " + nums[ i ] );
        System.out.println();
    }
    
}
