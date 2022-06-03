/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dwdemo;

/**
 *
 * @author grgab
 */
public class DWDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
        char ch;
        
        do{
            System.out.print( "press a key followed by enter: " );
            ch = ( char ) System.in.read();
        } while( ch != 'q' );
    }
    
}
