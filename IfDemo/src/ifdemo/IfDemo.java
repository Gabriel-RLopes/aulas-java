/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifdemo;

/**
 *
 * @author grgab
 */
public class IfDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b, c;
        // TODO code application logic here
        
        a = 2;
        b = 3;
        
        if( a < b ) System.out.println( "a is less than b" );
        if( a == b ) System.out.println( "you won't see this" );
        
        System.out.println();
        
        c = a - b;
        
        System.out.println( "c conteins -1");
        if( c >= 0 ) System.out.println( "c is non negative" );
        if( c < 0 ) System.out.println( "c is negative" );
        
        System.out.println();

        c = b - a;
        
        System.out.println( "c contains 1" );
        if( c >= 0 ) System.out.println( "c is non negative" );
        if( c < 0 ) System.out.println( " c is negative" );
    }
    
}
