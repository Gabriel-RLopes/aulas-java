/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpgen;

/**
 *
 * @author grgab
 */
class TwoGen< T, V >{
    T ob1;
    V ob2;
    
    TwoGen( T o1, V o2 ){
        ob1 = o1;
        ob2 = o2;
    }
    
    void showTypes(){
        System.out.println("Type of T is " + ob1.getClass().getName() );
        System.out.println("Type of V is " + ob2.getClass().getName() );
    }
    
    T getOb1(){
        return ob1;
    }
    
    V getOb2(){
        return ob2;
    }
}
public class SimpGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>( 88, "Generics" );
        
        tgObj.showTypes();
        int v = tgObj.getOb1();
        System.out.println( "Value: " + v );
        
        String str = tgObj.getOb2();
        System.out.println("Value: " + str);
    }
    
}
