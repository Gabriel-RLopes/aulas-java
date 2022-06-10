/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demopwr;

/**
 *
 * @author grgab
 */

class Pwr{
    double b, val;
    int e;
    
    Pwr( double base, int exp ){
        b = base;
        e = exp;
        
        val = 1;
        
        if( exp == 0 ) return;
        for( ; exp > 0; exp--) val = val * base;
    }
    
    double get_pwd(){
        return val;
    }
}
public class DemoPwr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pwr x = new Pwr( 4.0, 2 );
        Pwr y = new Pwr( 2.5, 1 );
        Pwr z = new Pwr( 5.7, 0 );
        
        System.out.println( x.b + " raised to the " + x.e + " power is " + x.get_pwd() );
        System.out.println( y.b + " raised to the " + y.e + " power is " + y.get_pwd() );
        System.out.println( z.b + " raised to the " + z.e + " power is " + z.get_pwd() );
    }
    
}
