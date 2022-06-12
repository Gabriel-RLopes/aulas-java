/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upcase;

/**
 *
 * @author grgab
 */
public class UpCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ch;
        
        for( int i = 0; i < 10; i++ ){
            ch = ( char ) ( 'a' + i );
            System.out.print( ch );
            
            ch = ( char ) ( ( int ) ch & 65503 );
            System.out.print( ch + " ");
        }
    }
    
}
