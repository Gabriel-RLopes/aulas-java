/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varargs3;

/**
 *
 * @author grgab
 */
public class VarArgs3 {

    /**
     * @param args the command line arguments
     */
    static void vaTest( int ... v ){
        System.out.println("vaTest(int ...): Number of args: " + v.length);
        System.out.println("Contents: ");
        
        for( int i = 0; i < v.length; i++ )
            System.out.println( " arg " + i + ": " + v[i] );
        
        System.out.println();
    }
    
    static void vaTest(boolean ... v ){
        System.out.println("vaTest(boolean ... ): Number of args: " + v.length);
        System.out.println("Contents: ");
        for( int i=0; i < v.length; i++ )
            System.out.println( " arg " + i + ": " + v[i] );
        System.out.println();
    }
    
    static void vaTest(String msg, int ... v ){
        System.out.println("vaTest(String, int ... ): " + msg + v.length);
        System.out.println("Contents: ");
        for(int i=0; i < v.length; i++)
            System.out.println( " arg " + i + ": " + v[i] );
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        vaTest( 1, 2, 3 );
        vaTest( "Testing: ", 10, 20 );
        vaTest( true, false, false );
    }
    
}
