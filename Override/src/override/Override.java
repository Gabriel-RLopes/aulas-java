/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package override;

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
        System.out.println("i and j" + i + " " + j );
    }
}

class B extends A{
    int k;
    
    B( int a, int b, int c){
        super( a, b );
        k = c;
    }
    
    void show(){
        super.show();
        System.out.println("K: " + k );
    }
}
public class Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B subOb = new B( 1, 2, 3 );
        
        subOb.show();
    }
    
}
