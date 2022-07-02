/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usethreads;

/**
 *
 * @author grgab
 */
class MyThread implements Runnable{
    String thrdName;
    
    MyThread( String name ){
        thrdName = name;
    }
    
    public void run(){
        System.out.println( thrdName + " starting" );
        try{
            for( int count = 0; count < 10; count++ ){
                Thread.sleep(400);
                System.out.println("in " + thrdName + " count is " + count );
            }
        }catch( InterruptedException exc ){
            System.out.println( thrdName + " interrupted");
        }
        System.out.println( thrdName + " terminated" );
    }
}
public class UseThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("main threadd starting.");
        
        MyThread mt = new MyThread( "child #1" );
        Thread newThrd = new Thread( mt );
        
        newThrd.start();
        
        for( int i = 0; i < 50; i++ ){
            System.out.print(".");
            try{
               Thread.sleep(100);
            }catch( InterruptedException exc ){
                System.out.println("main thread interrupted.");
            }
        }
        System.out.println("main thread ending");
    }
    
}
