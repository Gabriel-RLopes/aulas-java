/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package castdemo;

/**
 *
 * @author grgab
 */
public class CastDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x, y;
        byte b;
        int i;
        char ch;
        
        x = 10.0;
        y = 3.0;
        
        i = ( int ) ( x / y );
        System.out.println( "Integer outcome of x/y: " + i );
        
        i = 100;
        b = ( byte ) i;
        System.out.println( "value of b: " + b );
        
        i = 257;
        b = ( byte ) i;
        System.out.println( "value of b: " + b );
        
        b = 88;
        ch = ( char ) b;
        System.out.println( "ch: " + ch );
    }
    
}
