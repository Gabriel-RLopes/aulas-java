/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalize;

/**
 *
 * @author grgab
 */
class FDemo{
    int x;
    
    FDemo(  int i ){
        x = i;
    }
    
    protected void finalize(){
        System.out.println( "Finalizing " + x );
    }
    
    void generator( int i ){
        FDemo o = new FDemo( i );
    }
}

public class Finalize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count;
        FDemo ob = new FDemo( 0 );
        
        for( count = 1; count < 100000000; count++ )
            ob.generator(count);
    }
    
}
