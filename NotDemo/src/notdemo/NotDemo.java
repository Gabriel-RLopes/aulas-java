/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notdemo;

/**
 *
 * @author grgab
 */
public class NotDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b = -34;
        
        for( int t = 128; t > 0; t /= 2 ){
            if( (b & t) != 0 ) System.out.print("1 ");
            else System.out.print("0 ");
        }
        
        System.out.println();
        
        b = ( byte ) ~b;
        
        for( int t = 128; t > 0; t /= 2 ){
            if( ( b & t) != 0 ) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
    
}
