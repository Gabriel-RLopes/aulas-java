/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genconsdemo;

/**
 *
 * @author grgab
 */

class Summation{
    private int sum;
    
    <T extends Number> Summation( T arg ){
        sum  = 0;
        
        for( int i = 0; i <= arg.intValue(); i++ )
            sum += i;
    }
    
    int getSum(){
        return sum;
    }
    
}

public class GenConsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Summation ob = new Summation( 4.0 );
        System.out.println("Summation of 4.0 is " + ob.getSum() );
    }
    
}
