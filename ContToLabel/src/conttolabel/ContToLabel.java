/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conttolabel;

/**
 *
 * @author grgab
 */
public class ContToLabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outerloop:
            for( int i = 1; i < 10; i ++ ){
                System.out.print( "\n outer loop pass " + i + ", inner loop: " );
                for( int j = 1; j < 10; j++ ){
                    if( j == 5 ) continue outerloop;
                    System.out.print( j );
                }
            }
    }
    
}
