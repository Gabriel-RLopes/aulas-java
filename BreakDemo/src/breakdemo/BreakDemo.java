/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakdemo;

/**
 *
 * @author grgab
 */
public class BreakDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 100;
        
        for(  int i = 0; i < num; i++){
            if( i * i >= num ) break;
            System.out.print( i + " ");
        }
        System.out.println( "loop complete" );
    }
    
}
