/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dtos;

/**
 *
 * @author grgab
 */
import java.io.*;

public class DToS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        
        try( BufferedReader br = new BufferedReader( new FileReader( "test.txt" ) ) ){
            while( ( s = br.readLine() ) != null ){
                System.out.println(s);
            }
            
        } catch( IOException exc ){
            System.out.println("I/O error: " + exc );
        }
    }
    
}
