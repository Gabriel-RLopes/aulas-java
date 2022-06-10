/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nochange;

/**
 *
 * @author grgab
 */
public class NoChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        for( int x : nums){
            System.out.print( x + " ");
            x *= 10;
        }
        
        System.out.println();
        
        for(  int x : nums )
            System.out.print( x + " ");
        System.out.println();
    }
    
}
