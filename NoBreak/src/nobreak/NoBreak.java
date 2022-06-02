/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nobreak;

/**
 *
 * @author grgab
 */
public class NoBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        for( i = 0; i <= 5; i++ ){
            switch( i ){
                case 0: 
                    System.out.println( "i is less than one" );
                case 1:
                    System.out.println( "i is less than two" );
                case 2:
                    System.out.println( "i is less than three" );
                case 3:
                    System.out.println( "i is less than four" );
                case 4:
                    System.out.println( "i is less than five" );
            }
            System.out.println();
        }
    }
    
}
