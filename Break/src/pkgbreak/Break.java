/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgbreak;

/**
 *
 * @author grgab
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
        char ch;
        
        for( ; ; ){
            ch = ( char ) System.in.read();
            if( ch == 'q' ) break;
        }
        System.out.println( "you pressed q!" );
    }
    
}
