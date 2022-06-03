/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package break3;

/**
 *
 * @author grgab
 */
public class Break3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        
        for( i = 1; i < 4; i++ ){
            one: {
                two: {
                    three: {
                        System.out.println( "\ni is " + i );
                        if( i == 1 ) break one;
                        if( i == 2 ) break two;
                        if( i == 3 ) break three;
                        
                        System.out.println( "won't print" );
                    }
                    System.out.println( "after block three" );
                }
                System.out.println( "after block two" );
            }
            System.out.println( "after block one." );
        }
        System.out.println( "after for" );
    }
    
}
