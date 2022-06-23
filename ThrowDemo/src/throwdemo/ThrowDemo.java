/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throwdemo;

/**
 *
 * @author grgab
 */
public class ThrowDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            System.out.println("Before throw");
            throw new ArithmeticException();
        }catch( ArithmeticException exc ){
            System.out.println("Exception caugth");
        }
        System.out.println("Afrter try/catch block");
        
    }
    
}
