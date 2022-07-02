/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printwriterdemo;

/**
 *
 * @author grgab
 */
import java.io.*;

public class PrintWriterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintWriter pw = new PrintWriter( System.out, true );
        int i = 10;
        double d = 123.56;
        
        pw.println("using a printWriter.");
        pw.println( i );
        pw.println( d );
        pw.println( i + " + " + d + " is " + ( i + d ) );
    }
    
}
