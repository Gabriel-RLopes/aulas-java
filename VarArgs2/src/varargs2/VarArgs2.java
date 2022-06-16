/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varargs2;

/**
 *
 * @author grgab
 */
public class VarArgs2 {

    /**
     * @param args the command line arguments
     */
    static void vaTest( String msg, int ... v ){
        System.out.println(msg + v.length);
        System.out.println("Content: ");
        
        for( int i = 0; i < v.length; i++ )
            System.out.println( " arg " + i + ": " + v[i]);
        
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        vaTest( "one vararg: ", 10 );
        vaTest( "three Vararags: ", 1, 2, 3);
        vaTest( "No Varargs: " );
    }
    
}
