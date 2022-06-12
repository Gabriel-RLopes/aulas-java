/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encode;

/**
 *
 * @author grgab
 */
public class EnCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String msg = "This is a test";
        String decmsg = "";
        String encmsg = "";
        int key = 88;
        
        System.out.print("Original Message: ");
        System.out.println(msg);
        
        for( int i = 0; i < msg.length(); i++ )
            encmsg += ( char ) ( msg.charAt(i) ^ key );
        
        System.out.print("Encoded message: ");
        System.out.println(encmsg);
        
        for( int i = 0; i < encmsg.length(); i++ )
            decmsg += ( char ) ( encmsg.charAt(i) ^ key );
        
        System.out.print("Decoded Message: ");
        System.out.println(decmsg);
            
        
    }
    
}
