/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rwdata;

/**
 *
 * @author grgab
 */

import java.io.*;


public class RwData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        
        try( DataOutputStream dataOut = new DataOutputStream( new FileOutputStream( "Testdata" ) ) ){
            System.out.println("writing " + i );
            dataOut.writeInt(i);
            
            System.out.println("Writing " + d);
            dataOut.writeDouble( d );
            
            System.out.println("Writing " + b );
            dataOut.writeBoolean(b);
            
            System.out.println("Writing " + 12.2 * 7.4 );
            dataOut.writeDouble( 12.2 * 7.4 );

        }catch( IOException  exc){
            System.out.println("Write error");
            return;
        } 
        
        System.out.println();
        
        try( DataInputStream dataIn = new DataInputStream( new FileInputStream( "Testdata") ) ){
            i = dataIn.readInt();
            System.out.println("Reading " + i );
            
            d = dataIn.readDouble();
            System.out.println("Reading " + d );
            
            b = dataIn.readBoolean();
            System.out.println("Reading " + b );
            
            d = dataIn.readDouble();
            System.out.println("Reading " + d );
            
        } catch( IOException exc ){
            System.out.println("Read error.");
        }
        
    }
    
}
