/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orderofcontruction;

/**
 *
 * @author grgab
 */
class A {
    A(){
        System.out.println("Constructing A");
    }
}

class B extends A{
    B(){
        System.out.println("Constructing B");
    }
}

class C extends B{
    C(){
        System.out.println("Constructing C");
    }
}


public class OrderofContruction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        C c = new C();
        
    }
    
}
