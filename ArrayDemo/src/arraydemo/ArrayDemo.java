/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

/**
 *
 * @author grgab
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sample[] = new int[10];
        int i;

        for( i = 0; i < 10; i++ )
            sample[ i ] = i;
        
        for( i = 0; i < 10; i++ )
            System.out.println( "Sample[" + i + "]: " + sample[ i ] );
    }
    
}
