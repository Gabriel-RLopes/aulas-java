
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showfile;

/**
 *
 * @author grgab
 */

import java.io.*;
        
public class ShowFIle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        FileInputStream fin;
        
        if( args.length != 1 ){
            System.out.println("usage showfile file");
            return;
        }
        
        try {
            fin = new FileInputStream( args[0] );
        } catch( FileNotFoundException exc ){
            System.out.println("File not found");
            return;
        }
        
        try{
            do{
                i = fin.read();
                if( i != -1 ) System.out.println((char) i);
            }while( i != -1 );
        } catch( IOException exc ){
            System.out.println("Error reading file");
        }
        
        try {
            fin.close();
        }catch( IOException exc ){
            System.out.println("error closing file");
        }
    }
    
}
