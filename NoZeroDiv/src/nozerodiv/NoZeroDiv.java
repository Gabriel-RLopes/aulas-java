/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nozerodiv;

/**
 *
 * @author grgab
 */
public class NoZeroDiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result;
        
        for( int i = -5; i < 6; i++ ){
            result = i != 0 ? 100 / i : 0;
            if(  i !=0 )
                System.out.println("100 / " + i + " is " + result );
        }
    }
    
}
