/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kbin;

/**
 *
 * @author grgab
 */
public class KbIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        // TODO code application logic here
        throws java.io.IOException{
        char ch;
        System.out.print("Press a key followed by enter");
        ch = ( char ) System.in.read();
        
        System.out.println( "yout key is: " + ch );
        
    }

    
}
