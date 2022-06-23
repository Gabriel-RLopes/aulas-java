/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seriesdemo;

/**
 *
 * @author grgab
 */

public class SeriesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ByTwos ob = new ByTwos();
        
        for( int i = 0; i < 5; i++ )
            System.out.println( "next value is " + ob.getNext() );
        
        System.out.println("\nResetting");
        ob.reset();
        for( int i = 0; i < 5; i++)
            System.out.println( "next value is " + ob.getNext() );
        
        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for( int i =0; i < 5; i++)
            System.out.println( "next value is " + ob.getNext() );
    }
    
}
