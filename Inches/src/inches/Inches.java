/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inches;

/**
 *
 * @author grgab
 */
public class Inches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long ci, im;
        
        im = 5280 * 12;
        ci = im * im * im;
        System.out.println( "there are " + ci + " cubic inches in cubic mile." );
    }
    
}
