/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dyndispdemo;

/**
 *
 * @author grgab
 */
class Sup{
    void who(){
        System.out.println("who() in Sup");
    }
}
class Sub1 extends Sup{
    void who(){
        System.out.println("who() in sub1");
    }
}
class Sub2 extends Sup{
    void who(){
        System.out.println("who() in sub2");
    }
}
public class DynDispDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();
        
        Sup SupRef;
        
        SupRef = superOb;
        SupRef.who();
        
        SupRef = subOb1;
        SupRef.who();
        
        SupRef = subOb2;
        SupRef.who();
    }
    
}
