/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloaddemo;

/**
 *
 * @author grgab
 */
class Overload{
    void ovlDemo(){
        System.out.println("No Parameters");
    }
    
    void ovlDemo( int a ){
        System.out.println("one parameter: " + a );
    }
    
    int ovlDemo( int a, int b ){
        System.out.println("Two parameters: " + a + " " + b );
        return a + b;
    }
    
    double ovlDemo( double a, double b ){
        System.out.println("Two double parameters: " + a + " " + b );
        return a + b;
    }
}

public class OverloadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Overload ob = new Overload();
        int resI;
        double resD;
        
        ob.ovlDemo();
        System.out.println();
        
        ob.ovlDemo(2);
        System.out.println();
        
        resI = ob.ovlDemo( 4, 6 );
        System.out.println(" Resulst of ob.ovlDemo( 4, 6 ): " + resI);
        System.out.println();
        
        resD = ob.ovlDemo(1.1, 2.32 );
        System.out.println("Result of ob.ovlDemo( 1.1, 2.32 ): " +  resD);
        
    }
    
}
