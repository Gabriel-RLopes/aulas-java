/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nozerodiv2;

/**
 *
 * @author grgab
 */
public class NoZeroDiv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for( int i = -5; i < 6; i++ ){
            if(  i !=0 ? true : false )
                System.out.println("100 / " + i + " is " + 100/i );
        }
    }
    
}
