/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qdemo;

/**
 *
 * @author grgab
 */

class Queue{
    char q[];
    int putloc, getloc;
    
    Queue( int size){
        q = new char[size];
        putloc = getloc = 0;
    }
    
    void put( char ch ){
        if( putloc == q.length ){
            System.out.println( " - Queue is full." );
            return;
        }
        q[ putloc++ ] = ch;
    }
    
    char get(){
        if( getloc == putloc ){
            System.out.println( " - Queue is empty." );
            return ( char ) 0;
        }
        
        return q[ getloc++ ];
    }
    
    
    
}
public class QDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue bigQ = new Queue( 100 );
        Queue smallQ = new Queue( 4 );
        final int A = 65;
        char ch;
        int i;
        
        System.out.println("Using to store the alphabet.");
        for( i = 0; i < 26; i++ )
            bigQ.put( (char) ( A + i ) );
        
        System.out.print( "Content of bigQ: " );
        for( i = 0; i < 26; i++ ){
            ch = bigQ.get();
            if( ch != ( char ) 0 ) System.out.print(ch);
        }
        
        System.out.println("\n");
        
        System.out.println( "Using smallQ to generete errors " );
        for( i = 0; i < 5; i++ ){
            System.out.print("Attempting to store " + ( char ) ( 'Z' - i ) );
            smallQ.put( ( char ) ( 'Z' - i ));
            System.out.println();
        }
        
        System.out.println();
        
        System.out.print("Contents of smallQ: " );
        for( i= 0; i < 5; i++){
            ch = smallQ.get();
            if( ch != ( char) 0 ) System.out.println(ch);
        }
        
    }
    
}
