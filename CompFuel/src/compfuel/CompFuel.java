/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compfuel;

/**
 *
 * @author grgab
 */

class Vehicle{
    int passengers, fuelcap, mpg;
    
    int range(){
        return mpg * fuelcap;
    }
    
    double fuelneeded( int miles ){
        return ( double ) miles /mpg;
    }
}
public class CompFuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double gallons;
        int dist = 252;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        
        gallons = minivan.fuelneeded( dist );
        System.out.println( "to go "  + dist + " miles minivan needs " + gallons + " gallons of fuel");
        
        gallons = sportcar.fuelneeded( dist );
        System.out.println( "to go "  + dist + " miles sportcar needs " + gallons + " gallons of fuel");
    }
    
}
