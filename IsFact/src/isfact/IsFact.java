/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isfact;

/**
 *
 * @author grgab
 */

class Factor{
    boolean isFactor( int a, int b ){
        if( ( b % a ) == 0 ) return true;
        else return false;
    }
}

public class IsFact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factor x = new Factor();
        
        if( x.isFactor( 2, 20 ) ) System.out.println( "2 is factor" );
        if( x.isFactor( 3, 20 ) ) System.out.println( "this won't be displayed" );
    }
    
}
