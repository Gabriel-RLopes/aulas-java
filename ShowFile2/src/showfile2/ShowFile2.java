/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showfile2;

/**
 *
 * @author grgab
 */
import java.io.*;

public class ShowFile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        if( args.length != 1 ){
            System.out.println("usage showfile filename");
            return;
        }
        
        try( FileInputStream fin = new FileInputStream( args[0] ) ){
            do{
                i = fin.read();
                if( i != -1 ) System.out.print((char) i);
            }while( i != -1 );
        }catch( IOException exc ){
            System.out.println("I/O error " + exc );
        }
    }
    
}
