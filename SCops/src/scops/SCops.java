/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scops;

/**
 *
 * @author grgab
 */
public class SCops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, d, q;
        
        n = 10;
        d = 2;
        if( d != 0 && ( n % d ) == 0 ) System.out.println( d + " is a factor of " + n );
        
        d = 0;
        if( d != 0 && ( n % d ) == 0 ) System.out.println( d + " is a factor of " + n );
        
        if( d != 0 & ( n % d ) == 0 ) System.out.println( d + " is a factor of " + n );
        
    }
    
}
