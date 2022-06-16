/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vartest;

/**
 *
 * @author grgab
 */
public class VarTest {

    /**
     * @param args the command line arguments
     */
    
    static void vaTest(int ... v){
        System.out.println("Number of Args: " + v.length );
        System.out.println("Contents: ");
        for( int i=0; i < v.length; i++ )
            System.out.println( " arg " + i + ": " + v[i] );
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        vaTest(10);
        vaTest( 1,2,3 );
        vaTest();
    }
    
}
