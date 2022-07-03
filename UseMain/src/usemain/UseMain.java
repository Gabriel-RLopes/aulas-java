/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usemain;

/**
 *
 * @author grgab
 */
public class UseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread thrd;
        
        thrd = Thread.currentThread();
        
        System.out.println("main thread called: " + thrd.getName() );
        System.out.println("priority: " + thrd.getPriority());
        System.out.println();
        System.out.println("setting name and priority");
        
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);
        System.out.println("main thread now is called: " + thrd.getName());
        System.out.println("priority now is " + thrd.getPriority());
    }
    
}
