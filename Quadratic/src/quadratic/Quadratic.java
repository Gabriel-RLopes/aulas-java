/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadratic;

/**
 *
 * @author grgab
 */

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, x;
        
        a = 4;
        b = 1;
        c = -3;
        
        x = ( -b + sqrt( pow(b, 2) - 4 * a * c ) ) / ( 2 * a );
        System.out.println("First solution: " + x );
        
        x = ( -b - sqrt( pow(b, 2) - 4 * a * c ) ) / ( 2 * a );
        System.out.println("second solution: " + x );
    }
    
}
