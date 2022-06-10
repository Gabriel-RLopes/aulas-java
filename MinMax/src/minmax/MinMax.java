/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minmax;

/**
 *
 * @author grgab
 */
public class MinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = new int[ 10 ];
        int min, max;
        
        nums[ 0 ] = 99;
        nums[ 1 ] = -10;
        nums[ 2 ] = 100123;
        nums[ 3 ] = 18;
        nums[ 4 ] = -978;
        nums[ 5 ] = 5623;
        nums[ 6 ] = 463;
        nums[ 7 ] = -9;
        nums[ 8 ] = 287;
        nums[ 9 ] = 49;
        
        min = max = nums[ 0 ];
        
        for( int i = 0; i < 10; i++ ){
            if( nums[ i ] < min ) min = nums[ i ];
            if( nums[ i ] > max ) max = nums[ i ];
        }
        
        System.out.println( "min and max: " + min + " " + max );
    }
    
}
