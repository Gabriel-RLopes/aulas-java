/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twovehicles;

/**
 *
 * @author grgab
 */
class Vehicle{
    int passengers, fuelcap, mpg;
}

public class TwoVehicles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range1, range2;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;
        
        System.out.println( "minivan can carry " + minivan.passengers + " with range of " + range1 );
        System.out.println( "sportcar can carry " + sportcar.passengers + " with range of " + range2 );
    }
    
}
