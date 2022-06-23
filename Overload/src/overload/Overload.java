/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overload;

/**
 *
 * @author grgab
 */

class A {
    int i, j;
    
    A( int a, int b ){
        i = a;
        j = b;
    }
    
    void show(){
        System.out.println("i and j: " + i + " " + j );
    }
}

class B extends A{
    int k;
    
    B( int a, int b, int c ){
        super( a, b );
        k = c;
    }
    
    void show( String msg ){
        System.out.println( msg + k );
    }
}
public class Overload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B subOb = new B( 1, 2, 3 );
        subOb.show( "This is K: " );
        subOb.show();
    }
    
}
