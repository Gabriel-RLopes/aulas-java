/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdemo;

/**
 *
 * @author grgab
 */
class StaticDemo {
    int x;
    static int y;
    
    int sum(){
        return x+y;
    }
}

public class SDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();
        
        ob1.x = 10;
        ob2.x = 20;
        
        System.out.println("Of course, ob1.x and ob2.x are independent");
        System.out.println("ob1.x: " + ob1.x  +  "\nob2.x: " + ob2.x );
        System.out.println();
        System.out.println("The Static variable y is shared.");
        StaticDemo.y = 19;
        System.out.println("Set staticDemo.y to 19");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
        StaticDemo.y = 100;
        System.out.println("Change StaticDemo.y to 100");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
    
}
