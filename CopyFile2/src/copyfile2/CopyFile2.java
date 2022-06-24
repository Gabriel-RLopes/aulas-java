/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copyfile2;

/**
 *
 * @author grgab
 */

import java.io.*;
public class CopyFile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        if( args.length != 2 ){
            System.out.println("Usage copyfile from to");
            return;
        }
        
        try( FileInputStream fin = new FileInputStream( args[0] ); 
             FileOutputStream fout = new FileOutputStream( args[1] ) ){
            do{
                i = fin.read();
                if( i != -1 ) fout.write(i);
            }while( i != -1 );
        } catch( IOException exc ){
            System.out.println("I/O error: " + exc);
        }
    }
    
}
