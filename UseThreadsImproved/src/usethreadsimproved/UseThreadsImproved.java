/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usethreadsimproved;

/**
 *
 * @author grgab
 */
class MyThread implements Runnable{
    Thread thrd;
    
    MyThread( String name){
        thrd = new Thread( this, name );
        thrd.start();
    }
    
    @Override
    public void run(){
        System.out.println(thrd.getName() + " starting");
        try{
            for( int count=0; count < 10; count++ ){
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count );
            }
        }catch( InterruptedException exc ){
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating");
    }
}
public class UseThreadsImproved {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Main thread starting");
        
        MyThread mt = new MyThread( "child #1" );
        
        for(  int i = 0; i < 50; i++){
            System.out.println(".");
            try{
                Thread.sleep(100);
            }catch( InterruptedException exc ){
                System.out.println("Main thread interrupted");
            }
            System.out.println("main thread ending");
        }
    }
    
}
