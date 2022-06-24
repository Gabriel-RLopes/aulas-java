/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copyfile;

/**
 *
 * @author grgab
 */

import java.io.*;

public class CopyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        
        if( args.length != 2 ){
            System.out.println("Usage copy file to");
            return;
        }
        
        try{
            fin = new FileInputStream( args[0] );
            fout = new FileOutputStream( args[1] );
            
            do{
                i= fin.read();
                if ( i != -1 ) fout.write(i);
            }while( i != -1 );
        } catch( IOException exc ){
            System.out.println("I/O error: " + exc);
        } finally{
            try {
                if( fin != null ) fin.close();
            }catch( IOException exc ){
                System.out.println("Error closing input file");
            }
            
            try{
                if( fout != null ) fout.close();
            }catch( IOException exc ){
                System.out.println("Error closing output file");
            }
        }
    }
    
}
