/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchdemo;

/**
 *
 * @author grgab
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        for( i = 0; i < 10; i++ )
            switch( i ){
                case 0:
                    System.out.println( "i is zero" );
                    break;
                case 1:
                    System.out.println( "i is one" );
                    break;
                case 2:
                    System.out.println( "i is two" );
                    break;
                case 3:
                    System.out.println( "i is three" );
                    break;
                case 4:
                    System.out.println( "i is four" );
                    break;
                default:
                    System.out.println( "i is five or more" );
            }
    }
    
}
