/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genifdemo;

/**
 *
 * @author grgab
 */
interface Containment<T>{
    boolean contains(T o);
}

class MyClass<T> implements Containment<T>{
    T[] arrayRef;
    
    MyClass( T[] o ){
        arrayRef = o;
    }
    
    public boolean contains( T o ){
        for( T x : arrayRef )
            if( x.equals(o) ) return true;
        return false;
    }
}

public class GenIFDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer x[] = { 1, 2, 3 };
        MyClass<Integer> ob = new MyClass<Integer>(x);
        
        if( ob.contains(2) )
            System.out.println("2 is in ob");
        else
            System.out.println("2 is not in ob");
        
        if( ob.contains(5) )
            System.out.println("5 is in ob");
        else
            System.out.println("5 is not in ob");
    }
    
}
