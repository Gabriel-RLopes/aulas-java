/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extendthread;

/**
 *
 * @author grgab
 */

class MyThread extends Thread {
    
    MyThread( String name ){
        super(name);
        start();
    }
    
    public void run(){
        System.out.println( getName() + " starting" );
        try{
            for( int count = 0; count < 10; count++ ){
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count );
            }
        }catch( InterruptedException exc ){
            System.out.println( getName() + " Interrupted" );
        }
        System.out.println( getName() + " terminating" );
    }
}
public class ExtendThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println( "Main thread starting." );
        
        MyThread mt = new MyThread( "child #1" );
        
        for( int i = 0; i < 50; i++ ){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch( InterruptedException exc ){
                System.out.println( "Main thread interrupted." );
            }
        }
        
        System.out.println( "Main thread endind." );
    }
    
}
