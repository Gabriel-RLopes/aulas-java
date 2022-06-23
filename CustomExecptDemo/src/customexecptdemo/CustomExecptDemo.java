/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customexecptdemo;

/**
 *
 * @author grgab
 */

class NonIntResultException extends Exception{
    int n, d;

    public NonIntResultException( int i, int j ) {
        n = i;
        d = j;
    }
    
    public String toString(){
        return "Result of " + n + " / " + d + " is non integer.";
    }

}
public class CustomExecptDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numer[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };
        
        for( int i = 0; i < numer.length; i++ ){
            try{
                if( (numer[i]%2) != 0 )
                    throw new NonIntResultException( numer[i], denom[i] );
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            }catch( ArithmeticException exc ){
                System.out.println("can't divide by zero");
            }catch( ArrayIndexOutOfBoundsException exc ){
                System.out.println("No natchinf element found");
            }catch( NonIntResultException exc ){
                System.out.println(exc);
            }
        }
    }
    
}
