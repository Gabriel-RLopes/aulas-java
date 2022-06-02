/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promdemo;

/**
 *
 * @author grgab
 */
public class PromDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b;
        int i;
        
        b = 10;
        i = b * b;
        
        b = 10;
        b = ( byte ) ( b *b );
        
        System.out.println( "i and b: " + i + " " + b );
    }
    
}
