/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usesuper;

/**
 *
 * @author grgab
 */
class A{
    int i;
}

class B extends A{
    int i;
    
    B( int a, int b){
        super.i = a;
        i = b;
    }
    
    void show(){
        System.out.println("i in superclass: " + super.i );
        System.out.println("i in subclass: " + i );
    }
}
public class UseSuper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B subOb = new B( 1, 2);
        subOb.show();
    }
    
}
