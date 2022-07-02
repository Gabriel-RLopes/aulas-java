/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomacessdemo;

/**
 *
 * @author grgab
 */
import java.io.*;

public class RandomAcessDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;
        
        try( RandomAccessFile raf = new RandomAccessFile( "random.dat", "rw" ) ){
            for( int i = 0; i < data.length; i++ ){
                raf.writeDouble( data[ i ] );
            }
            
            raf.seek( 0 );
            d = raf.readDouble();
            System.out.println("first value is " + d );
            
            raf.seek( 8 );
            d = raf.readDouble();
            System.out.println("second value is " + d );
            
            raf.seek( 8 * 3 );
            d = raf.readDouble();
            System.out.println("fourth value is " + d );
            
            System.out.println();
            
            System.out.println("Here is every other value: ");
            for( int i = 0; i < data.length; i += 2 ){
                raf.seek( 8 * i );
                d = raf.readDouble();
                System.out.print( d + " " );
            }
        }catch( IOException exc ){
            System.out.println("I/O error:" + exc );
        }
    }
    
}
