/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehconsdemo;

/**
 *
 * @author grgab
 */

class Vehicle{
    int passengers, fuelcap, mpg;
    
    Vehicle( int p, int f, int m ){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    
    int range(){
        return mpg * fuelcap;
    }
    
    double fuelneeded( int miles ){
        return ( double ) miles / mpg;
    }
}
public class VehConsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle minivan = new Vehicle( 7, 16, 21 );
        Vehicle sportcar = new Vehicle( 2, 14, 12 );
        double gallons;
        int dist = 252;
        
        gallons = minivan.fuelneeded(dist);
        System.out.println( "to go " + dist + " miles minivan needs " + gallons + " gallons of fuel" );
        gallons = sportcar.fuelneeded(dist);
        System.out.println( "to go " + dist + " miles sportcar needs " + gallons + " gallons of fuel" );
    }
    
}
