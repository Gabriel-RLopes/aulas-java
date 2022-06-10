/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foreach2;

/**
 *
 * @author grgab
 */
public class ForEach2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        
        int nums[][] = new int[3][5];
        
        for( int i = 0; i < 3; i++ )
            for( int j = 0; j < 5; j++ )
                nums[i][j] = ( i + 1 ) * ( j + 1 );
        
        for( int x[] : nums ){
            for( int y : x ){
                System.out.println("Value is: " + y );
                sum += y;
            }
        }
        
        System.out.println("Summation: " + sum );
    }
    
}
