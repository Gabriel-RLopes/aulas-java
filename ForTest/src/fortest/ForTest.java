/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fortest;

/**
 *
 * @author grgab
 */
public class ForTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException{
        // TODO code application logic here
        int i;
        
        System.out.println( "Press S to Stop." );
        
        for( i = 0; ( char ) System.in.read() != 'S'; i++ )
            System.out.println( "Pass #" + i );
    }
    
}
