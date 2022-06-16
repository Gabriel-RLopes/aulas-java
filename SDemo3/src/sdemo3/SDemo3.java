/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdemo3;

/**
 *
 * @author grgab
 */
class StaticBlock{
    static double rootof2;
    static double rootof3;
    
    static {
        System.out.println("Inside static block.");
        rootof2 = Math.sqrt(2.0);
        rootof3 = Math.sqrt(3.0);
    }
    
    StaticBlock( String msg ){
        System.out.println(msg);
    }
}
public class SDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StaticBlock ob = new StaticBlock("inside Constructor");
        
        System.out.println("Square root of 2 is: " + StaticBlock.rootof2 );
        System.out.println("Square root of 3 is: " + StaticBlock.rootof3 );
    }
    
}
