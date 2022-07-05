/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autobox3;

/**
 *
 * @author grgab
 */
public class AutoBox3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer iOb, iOb2;
        int i;
        
        iOb =99;
        System.out.println("Original value of iOb: " + iOb );
        
        ++iOb;
        System.out.println("after ++iOb: " + iOb);
        
        iOb += 10;
        System.out.println("after iOb += 10: " + iOb);
        
        iOb2 = iOb + ( iOb / 3 );
        System.out.println("iOb2 after expression: " + iOb2 );
        
        i = iOb + ( iOb /3 );
        System.out.println("i after expression: " + i);
    }
    
}
