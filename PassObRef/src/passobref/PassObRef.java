/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passobref;

/**
 *
 * @author grgab
 */

class Test{
    
    int a, b;
    
    Test( int i, int j ){
        a = i;
        b = j;
    }
    
    void noChange( Test ob ){
        ob.a += ob.b;
        ob.b = -ob.b;
    }
}
public class PassObRef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test ob = new Test( 15, 20 );
        
        System.out.println( "ob.a and ob.b before call: " + ob.a + " " + ob.b );
        ob.noChange( ob );
        
        System.out.println( "ob.a and ob.b after call: " + ob.a + " " + ob.b );
    }
    
}
