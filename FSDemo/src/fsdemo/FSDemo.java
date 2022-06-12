/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fsdemo;

/**
 *
 * @author grgab
 */

class FailSoftArray{
    private int a[];
    private int errval;
    public int length;
    
    public FailSoftArray( int size, int errv ){
        a = new int[size];
        errval = errv;
        length = size;
    }
    
    public int get( int index ){
        if( indexOk(index)) return a[index];
        return errval;
    }
    
    
    public boolean put( int index, int val ){
        if(  indexOk(index) ){
            a[index] = val;
            return true;
        }
        return false;
    }
    
    private boolean indexOk( int index ){
        if( index >= 0 & index < length ) return true;
        return false;
    }
}
public class FSDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FailSoftArray fs = new FailSoftArray( 5, -1 );
        int x;
        
        System.out.println("Fail quietly.");
        
        for( int i = 0; i < ( fs.length * 2); i++ )
            fs.put( i, i*10 );
        
        for( int i = 0; i < ( fs.length * 2 ); i++ ){
            x = fs.get( i );
            if( x != -1 ) System.out.println( x + " ");
        }
        System.out.println("");
        
        System.out.println("\n Faila with error reports.");
        for( int i = 0; i < ( fs.length * 2 ); i++ )
            if( !fs.put(i, i*10 ) )
                System.out.println("Index " + i + " out of bounds");
        
        for( int i = 0; i < ( fs.length * 2 ); i++ ){
            x = fs.get(i);
            if( x!= -1 ) System.out.println( x + " " );
            else System.out.println("index " + i + " out of bounds");
        }
            
    }
    
}
