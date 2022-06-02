/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicaloptable;

/**
 *
 * @author grgab
 */
public class LogicalOpTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean p, q;
        
        System.out.println( "P\tQ\tAnd\tOr\tXor\tNot" );
        
        p = true;
        q = true;
        System.out.println( p + "\t" + q + "\t" + ( p & q ) + "\t" + ( p | q ) + "\t" + ( p ^ q ) + "\t" + !p );
        
        p = true;
        q = false;
        System.out.println( p + "\t" + q + "\t" + ( p & q ) + "\t" + ( p | q ) + "\t" + ( p ^ q ) + "\t" + !p );
        
        p = false;
        q = true;
        System.out.println( p + "\t" + q + "\t" + ( p & q ) + "\t" + ( p | q ) + "\t" + ( p ^ q ) + "\t" + !p );
        
        p = false;
        q = false;
        System.out.println( p + "\t" + q + "\t" + ( p & q ) + "\t" + ( p | q ) + "\t" + ( p ^ q ) + "\t" + !p );
    }
    
}
