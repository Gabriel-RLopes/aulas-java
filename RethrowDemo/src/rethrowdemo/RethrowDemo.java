/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rethrowdemo;

/**
 *
 * @author grgab
 */
class Rethrow{
    public static void genException(){
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };
        
        for( int i = 0; i < numer.length; i++ ){
            try{
                System.out.println( numer[i]+ " / " + denom[i] + " is " + numer[i]/denom[i]);
            } catch( ArithmeticException exc ){
                System.out.println("Can't divide by zero");
            } catch( ArrayIndexOutOfBoundsException exc ){
                System.out.println("No matching element found");
                throw exc;
            }
        }
    }
}
public class RethrowDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Rethrow.genException();
        } catch( ArrayIndexOutOfBoundsException exc ){
            System.out.println( "Fatal error - program terminated." );
        }
    }
    
}
