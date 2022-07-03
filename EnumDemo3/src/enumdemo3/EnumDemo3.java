/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumdemo3;

/**
 *
 * @author grgab
 */

enum Transport{
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    
    private int speed;
    
    Transport(int s){ speed = s; }
    
    int getSpeed() { return speed; }
}
public class EnumDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Transport tp;
        
        System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per houn. \n");
        System.out.println("all transport speeds: ");
        for( Transport t : Transport.values() )
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
        
    }
    
}
