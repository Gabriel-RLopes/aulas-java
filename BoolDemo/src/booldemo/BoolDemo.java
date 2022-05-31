/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package booldemo;

/**
 *
 * @author grgab
 */
public class BoolDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean b;
        
        b = false;
        System.out.println( "b is " + b );
        b = true;
        System.out.println( "b is " + b );
        
        if( b ) System.out.println( "this is executed" );
        
        b = false;
        if( b ) System.out.println( "this is not executed" );
        
        System.out.println( "10 > 9 is" + ( 10 > 9 ) );
    }
    
}
