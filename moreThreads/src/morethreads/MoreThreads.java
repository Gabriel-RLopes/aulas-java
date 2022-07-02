/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morethreads;

/**
 *
 * @author grgab
 */

class MyThread implements Runnable{
    Thread thrd;
    
    MyThread( String name ){
        thrd = new Thread( this, name );
        thrd.start();
    }
    
    public void run(){
        System.out.println(thrd.getName() + " starting");
        try{
            for( int count = 0; count < 10; count++ ){
                Thread.sleep( 400 );
                System.out.println( "in " + thrd.getName() + " count is " + count );
            }
        }catch( InterruptedException exc ){
            System.out.println( thrd.getName() + " interrupted." );
        }
        System.out.println( thrd.getName() + " terminating." );
    }
}
public class MoreThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println( "main thread starting" );
        
        MyThread mt1 = new MyThread( "child #1" );
        MyThread mt2 = new MyThread( "child #2" );
        MyThread mt3 = new MyThread( "child #3" );
        
        for( int i = 0; i < 50; i++ ){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch( InterruptedException exc ){
                System.out.println("main thread interrupted");
            }
        }
        System.out.println("main thread ending");
    }
    
}
