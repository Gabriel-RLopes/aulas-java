/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suspend;

/**
 *
 * @author grgab
 */

class MyThread implements Runnable{
    Thread thrd;
    
    boolean suspend, stoped;
    
    MyThread( String name ){
        thrd = new Thread( this, name );
        suspend = false;
        stoped = false;
        thrd.start();
    }
    
    public void run(){
        System.out.println(thrd.getName() + " starting.");
        try{
            for( int i = 1; i < 1000; i++ ){
                System.out.println( i + " ");
                if( (i%10)==0 ){
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized(this){
                    while(suspend){
                        wait();
                    }
                    if(stoped) break;
                }
            }
            
        }catch( InterruptedException exc ){
            System.out.println(thrd.getName() + " interrupted");
        }
        System.out.println(thrd.getName() + " exiting");
    }
    
    synchronized void mystop(){
        stoped = true;
        suspend = false;
        notify();
    }
    
    synchronized void mysuspend(){
        suspend = true;
    }
    
    synchronized void myresume(){
        suspend = false;
        notify();
    }
}
public class Suspend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread ob1 = new MyThread( "my thread" );
        
        try{
            Thread.sleep(1000);
            
            ob1.mysuspend();
            System.out.println("suspending thread");
            Thread.sleep(1000);
            
            ob1.myresume();
            System.out.println("resuming thread");
            Thread.sleep(1000 );
            
            ob1.mysuspend();
            System.out.println("suspending thread");
            Thread.sleep(1000);
            
            ob1.myresume();
            System.out.println("resuming thread");
            Thread.sleep(1000 );
            
            ob1.mysuspend();
            System.out.println("stoping thread");
            ob1.mystop();
        }catch( InterruptedException e ){
            System.out.println("Main thread interrupted");
        }
        
        try{
            ob1.thrd.join();
        }catch( InterruptedException e ){
            System.out.println("main thread interrupted");
        }
        
        System.out.println("main thread exiting");
    }
    
}
