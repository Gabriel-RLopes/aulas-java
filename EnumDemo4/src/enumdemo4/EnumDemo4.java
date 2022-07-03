/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumdemo4;

/**
 *
 * @author grgab
 */

enum Transport{
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class EnumDemo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Transport tp, tp2, tp3;
        
        System.out.println("Here are all Transport constants and their ordinal values: ");
        for( Transport t : Transport.values() )
            System.out.println( t + " " + t.ordinal() );
    
        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;
        
        System.out.println();
        
        if( tp.compareTo(tp2) < 0 )
            System.out.println(tp + " comes betfore " + tp2 );
        
        if ( tp.compareTo(tp2) > 0 )
            System.out.println(tp2 + " comes before " + tp);
        
        if ( tp.compareTo(tp3) == 0 )
            System.out.println(tp + " equals " + tp3);
        
    
    }
    
}
