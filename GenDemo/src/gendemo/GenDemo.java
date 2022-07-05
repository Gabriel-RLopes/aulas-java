/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gendemo;

/**
 *
 * @author grgab
 */

class Gen<T>{
    T ob;
    
    Gen( T o ){
        ob = o;
    }
    
    T getOb(){
        return ob;
    }
    
    void showType(){
        System.out.println("Type of T is "+ ob.getClass().getName() );
    }
}
public class GenDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value: " + v);
        System.out.println();
        
        Gen<String> strOb = new Gen<String>( "Generics test" );
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value: " + str );
        
    }
    
}
