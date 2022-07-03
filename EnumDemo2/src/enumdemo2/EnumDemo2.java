/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumdemo2;

/**
 *
 * @author grgab
 */

enum Transport{
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class EnumDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Transport tp;
        
        System.out.println("here are all Transports constants");
        
        Transport allTransports[] = Transport.values();
        for( Transport t : allTransports )
            System.out.println(t);
        
        System.out.println();
        
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
    
}
