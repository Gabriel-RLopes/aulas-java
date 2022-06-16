/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qdemo2;

/**
 *
 * @author grgab
 */

class Queue {
    private char q[];
    private int putloc, getloc;
    
    Queue( int size ){
        q = new char[size];
        putloc = getloc = 0;
    }
    
    Queue( Queue ob ){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        
        for( int i=getloc; i<putloc; i++ )
            q[i] = ob.q[i];
    }
    
    Queue( char a[] ){
        putloc = getloc = 0;
        q = new char[a.length];
        for( int i = 0; i < a.length; i++ ) put( a[i] );
    }
    
    void put(char ch){
        if(putloc == q.length){
            System.out.println("- Queue is full");
            return;
        }
        
        q[putloc++] = ch;
    }
    
    char get(){
        if( getloc == putloc ){
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        
        return q[getloc++];
    }
}

public class QDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q1 = new Queue(10);
        char name[] = { 'T', 'o', 'm' };
        Queue q2 = new Queue( name );
        
        char ch;
        int i;
        
        for( i = 0; i < 10; i++ )
            q1.put( ( char ) ( 'A' + i ) );
        
        Queue q3 = new Queue( q1 );
        
        System.out.print("Contents of q1: ");
        for( i = 0; i < 10; i++ ){
            ch = q1.get();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        System.out.print("Contents of q2: ");
        for( i = 0; i < 3; i++ ){
            ch = q2.get();
            System.out.print(ch);
        }
        
        System.out.println("\n");
        System.out.print("Contents of q3: ");
        for( i = 0; i < 10; i++ ){
            ch = q3.get();
            System.out.print(ch);
        }
    }
    
}
