/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ktod;

/**
 *
 * @author grgab
 */
import java.io.*;

public class KToD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        
        System.out.println("Enter text ( 'stop' to quit ). ");
        
        try( FileWriter fw = new FileWriter( "text.txt" ) ){
            do{
                System.out.print(" : ");
                str = br.readLine();
                
                if( str.compareTo("stop") == 0 ) break;
                
                str = str + "\r\n";
                fw.write(str);
            }while( str.compareTo("stop") != 0 );
            
        } catch( IOException exc ){
            System.out.println("I/O error: " + exc );
        }
    }
    
}
