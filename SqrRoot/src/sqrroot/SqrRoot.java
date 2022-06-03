/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sqrroot;

/**
 *
 * @author grgab
 */
public class SqrRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num, sroot, rerr;
        
        for( num = 1.0; num < 100.0; num++ ){
            sroot = Math.sqrt(num);
            
            System.out.println( "Square root of " + num + " is " + sroot );
            
            rerr = num - ( sroot * sroot );
            System.out.println( "rounding error is " + rerr );
            System.out.println();
        }
    }
    
}
