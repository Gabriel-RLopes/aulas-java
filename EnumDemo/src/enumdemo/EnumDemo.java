/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumdemo;

/**
 *
 * @author grgab
 */
enum Transport{
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class EnumDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Transport tp;
        tp = Transport.AIRPLANE;
        
        System.out.println("Value od tp: " + tp);
        System.out.println();
        
        tp = Transport.TRAIN;
        
        if( tp == Transport.TRAIN )
            System.out.println("tp contains TRAIN. \n");
        
        switch(tp){
            case CAR:
                System.out.println("a car carries people");
                break;
            case TRUCK:
                System.out.println("A truck carries freight");
                break;
            case AIRPLANE:
                System.out.println("an airplane flies");
                break;
            case TRAIN:
                System.out.println("a train runs on rails");
                break;
            case BOAT:
                System.out.println("a boat sails on water");
                break;
        }
    }
    
}
