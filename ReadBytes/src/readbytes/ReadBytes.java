/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readbytes;

/**
 *
 * @author grgab
 */

import java.io.*;

public class ReadBytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        byte data[] = new byte[10];
        
        System.out.println("Enter some characters.");
        System.in.read( data );
        System.out.print("you entered: ");
        for( int i =0; i < data.length; i++ )
            System.out.print( (char) data[i] );
        
    }
    
}
