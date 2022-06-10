/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consdemo;

/**
 *
 * @author grgab
 */

class MyClass{
    int x;
    
    MyClass(){
        x = 10;
    }
    
}
public class ConsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        
        System.out.println( t1.x + " "  + t2.x );
    }
    
}
