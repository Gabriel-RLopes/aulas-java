/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thowsdemo;

/**
 *
 * @author grgab
 */
public class ThowsDemo {

    /**
     * @param args the command line arguments
     */
    public static char prompt(String str)
        throws java.io.IOException{
        System.out.println(str + ": ");
        return (char) System.in.read();
            
    }
    public static void main(String[] args) {
        // TODO code application logic here
        char ch;
        
        try{
            ch = prompt( "Enter a letter" );
        } catch( java.io.IOException exc ){
            System.out.println("I/O exception occured.");
            ch = 'X';
        }
        
        System.out.println("You pressed " + ch );
    }
    
}
