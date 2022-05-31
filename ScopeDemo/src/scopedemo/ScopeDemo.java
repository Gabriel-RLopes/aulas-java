/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scopedemo;

/**
 *
 * @author grgab
 */
public class ScopeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        
        if( x == 10 ){
            int y = 20;
            System.out.println( "x and y " + x + " " + y );
            x = y * 2;
            
            System.out.println( "x is " + x );
        }
    }
    
}
