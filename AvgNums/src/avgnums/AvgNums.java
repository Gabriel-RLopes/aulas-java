/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avgnums;

/**
 *
 * @author grgab
 */
import java.io.*;
public class AvgNums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String str;
        int n;
        double sum = 0.0;
        double avg, t;
        
        System.out.println("How many numbers will you enter: ");
        str = br.readLine();

        try{
            n = Integer.parseInt(str);
        }catch( NumberFormatException exc ){
            System.out.println("Invalid Format");
            n = 0;
        }
        
        System.out.println("Enter " + n + " values: ");
        for( int i = 0; i < n; i++ ){
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            }catch( NumberFormatException exc ){
                System.out.println("Invalid format");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Average is " + avg );
    }
    
}
