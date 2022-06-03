/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package power;

/**
 *
 * @author grgab
 */
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int e, result;
        
        for( int i = 0; i < 10; i++ ){
            result = 1;
            e = i;
            
            while( e > 0 ){
                result *= 2;
                e--;
            }
            
            System.out.println( "2 to the " + i + " power is " + result );
        }
    }
    
}
