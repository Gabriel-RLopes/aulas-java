/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parmdemo;

/**
 *
 * @author grgab
 */

class ChkNum{
    boolean isEven( int x ){
        if( ( x % 2 ) == 0 ) return true;
        else return false;
    }
}

public class ParmDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChkNum e = new ChkNum();
        
        if( e.isEven( 10 ) ) System.out.println( "10 is even" );
        if( e.isEven( 9 ) ) System.out.println( "9 is even" );
        if( e.isEven( 8 ) ) System.out.println( "8 is even" );
    }
    
}
