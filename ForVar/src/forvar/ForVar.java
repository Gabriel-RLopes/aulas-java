/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forvar;

/**
 *
 * @author grgab
 */
public class ForVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0, fact = 1;
        
        for( int i = 1; i <= 5; i++ ){
            sum += i;
            fact *= i;
        }
        
        System.out.println( "sum is: " + sum );
        System.out.println( "factorial is " + fact );
    }
    
}
