/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prioritydemo;

/**
 *
 * @author grgab
 */

class Priority implements Runnable{
    int count;
    Thread thrd;
    
    static boolean stop = false;
    static String currentName;
    
    Priority( String name ){
        thrd = new Thread( this, name );
        count = 0;
        currentName = name;
    }
    
    public void run(){
        System.out.println(thrd.getName() + " starting");
        do{
            count++;
            
            if( currentName.compareTo(thrd.getName()) != 0 ){
                currentName = thrd.getName();
                System.out.println("in " + currentName);
            }
            
        }while( stop == false && count < 10000000 );
        stop =true;
        System.out.println("\n" + thrd.getName() + " terminating");
    }
}
public class PriorityDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Priority mt1 = new Priority( "High Priority" );
        Priority mt2 = new Priority( "low Priority" );
        
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);
        
        mt1.thrd.start();
        mt2.thrd.start();
        
        try{
            mt1.thrd.join();
            mt2.thrd.join();
        }catch( InterruptedException exc ){
            System.out.println("main Thread interrupted");
        }
        System.out.println("High priority thread counted to " + mt1.count );
        System.out.println("low priority thread counted to " + mt2.count );
    }
    
}
