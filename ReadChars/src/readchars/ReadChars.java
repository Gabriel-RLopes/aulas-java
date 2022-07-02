/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readchars;

/**
 *
 * @author grgab
 */
import java.io.*;

public class ReadChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char c;
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        
        System.out.println("Enter characters, period to quit");
        
        do{
            c = ( char ) br.read();
            System.out.println(c);
        }while( c != '.' );
    }
    
}
