/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sync;

/**
 *
 * @author grgab
 */

class SumArray{
    private int sum;
    
    synchronized int sumArray( int nums[] ){
        sum = 0;
        
        for( int i = 0; i < nums.length; i++ ){
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum );
            try{
                Thread.sleep(10);
            }catch( InterruptedException exc ){
                System.out.println("Thread interrupted.");
            }
            
        }
        return sum;
    }
}

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[]; 
    int answer;
    
    MyThread( String name, int nums[] ){
        thrd = new Thread( this, name );
        a = nums;
        thrd.start();
    }
    
    public void run(){
        int sum;
        
        System.out.println(thrd.getName() +  " starting");
        answer = sa.sumArray(a);
        System.out.println("sum for " + thrd.getName() + " is " + answer );
        System.out.println(thrd.getName() +  " terminating");
    }
}

public class Sync {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        int a[] = { 1, 2, 3, 4, 5 };
        MyThread mt1 = new MyThread( "child #1", a );
        MyThread mt2 = new MyThread( "child #2", a );
        
        try{
            mt1.thrd.join();
            mt2.thrd.join();
        }catch( InterruptedException exc ){
            System.out.println("main Thread Interrupted. ");
        }
    }
    
}
