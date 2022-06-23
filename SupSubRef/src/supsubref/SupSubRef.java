/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supsubref;

/**
 *
 * @author grgab
 */

class X {
    int a;
    
    X(int i) { a = i; }
}

class Y extends X {
    int b;
    
    Y(int i, int j){
        super(j);
        b = i;
    }
}
public class SupSubRef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        X x = new X(10);
        X x2;
        Y y = new Y( 5, 6 );
        
        x2 = x;
        System.out.println("x2.a: " + x2.a );
        
        x2 = y;
        System.out.println("x2.a: " + x2.a );
        
        x2.a = 19;
        
        // x2.b = 27;
    }
    
}
