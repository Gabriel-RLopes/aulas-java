/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parmconsdemo;

/**
 *
 * @author grgab
 */

class MyClass{
    int x;
    
    MyClass( int i ){
        x = i;
    }
}
public class ParmConsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass t1 = new MyClass( 10 );
        MyClass t2 = new MyClass( 88 );
        
        System.out.println( t1.x + " "  + t2.x );
    }
    
}
