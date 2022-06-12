/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shiftdemo;

/**
 *
 * @author grgab
 */
public class ShiftDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val = 1;
        
        for( int i = 0; i < 8; i++ ){
            for( int t = 128; t>0; t/=2 ){
                if( ( val & t ) != 0 ) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val << 1;
        }
        
        System.out.println();
        val = 128;
        for( int i = 0; i < 8; i++ ){
            for( int t = 128; t > 0; t/=2 ){
                if( ( val & t ) != 0 ) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val >> 1;
        }
    }
    
}
