/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moddemo;

/**
 *
 * @author grgab
 */
public class ModDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iresult, irem;
        double dresult, drem;
        
        iresult = 10 / 3;
        irem = 10 % 3;
        
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;
        
        System.out.println( "Result and remainder of 10 / 3 " + iresult + " " + irem );
        System.out.println( "Result and remainder of 10.0 / 3.0 " + dresult + " " + drem );
    }
    
}
