/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readlines;

/**
 *
 * @author grgab
 */

import java.io.*;

public class ReadLines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String str;
        
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do{
            str = br.readLine();
            System.out.println(str);
        }while( !str.equals("stop") );
    }
    
}
