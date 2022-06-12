/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showbits;

/**
 *
 * @author grgab
 */
public class ShowBits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        byte val;
        
        val = 123;
        for( t = 128; t > 0; t /= 2 ){
            if( ( val & t ) != 0 ) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
    
}
