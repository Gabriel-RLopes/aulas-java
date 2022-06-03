/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicledemo;

/**
 *
 * @author grgab
 */

class Vehicle{
    int passengers, fuelcap, mpg;
}
public class VehicleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle minivan = new Vehicle();
        int range;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        range = minivan.fuelcap * minivan.mpg;
        
        System.out.println( "minivan can carry " + minivan.passengers + " with range of " + range );
    }
    
}
