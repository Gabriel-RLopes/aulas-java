/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringarray;

/**
 *
 * @author grgab
 */
public class StringArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strs[] = { "this", "is", "a", "teste" };
        
        System.out.println("Original array: ");
        for( String s : strs )
            System.out.print( s + " " );
        System.out.println();
        
        strs[1] = "was";
        strs[3] = "test, too!";
        
        System.out.println("modified array: ");
        for( String s : strs )
            System.out.print( s + " " );
    }
    
}
