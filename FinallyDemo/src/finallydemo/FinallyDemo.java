/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finallydemo;

/**
 *
 * @author grgab
 */

class UseFinally {
    public static void genException( int what ){
        int t, nums[] = new int[2];
        
        System.out.println("Receiving " + what);
        
        try{
            switch( what ){
                case 0:
                    t= 10 /what;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        }catch( ArithmeticException exc ){
            System.out.println("can't divide by zero");
            return;
        }catch( ArrayIndexOutOfBoundsException exc ){
            System.out.println("No Matching element found");
        }finally{
            System.out.println("leveing try");
        }
    }
}
public class FinallyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for( int i=0; i < 3; i++ ){
            UseFinally.genException(i);
            System.out.println();
        }
    }
    
}
