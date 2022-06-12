/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cldemo;

/**
 *
 * @author grgab
 */
public class ClDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("There are " + args.length + "command line arguments" );
        
        System.out.println("They are: ");
        System.out.println(args.length );
        for( int i = 0; i < args.length; i++ )
            System.out.println( "args[" + i +  "]: " + args[i] );
    }
    
}
