/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minmax2;

/**
 *
 * @author grgab
 */
public class MinMax2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
        int min, max;
        
        min = max = nums[ 0 ];
        
        for( int i = 0; i < 10; i++ ){
            if( nums[ i ] < min ) min = nums[ i ];
            if( nums[ i ] > max ) max = nums[ i ];
        }
        
        System.out.println( "min and max: " + min + " " + max );
    }
    
}
