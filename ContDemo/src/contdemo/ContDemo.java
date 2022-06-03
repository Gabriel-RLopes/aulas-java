/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contdemo;

/**
 *
 * @author grgab
 */
public class ContDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        for( i = 0; i <= 100; i++ ){
            if( ( i % 2 ) != 0 ) continue;
            System.out.println( i );
        }
    }
    
}
