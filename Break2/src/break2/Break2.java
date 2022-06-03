/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package break2;

/**
 *
 * @author grgab
 */
public class Break2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for( int i = 0; i < 3; i++ ){
            System.out.println( "outer loop count: " + i );
            System.out.print( "   Inner loop count: " );
            
            int t = 0;
            while( t < 100 ){
                if( t == 10 ) break;
                System.out.print( t + " " );
                t++;
            }
            System.out.println();
        }
        System.out.println( "loops complete" );
    }
    
}
