/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addmeth;

/**
 *
 * @author grgab
 */

class Vehicle{
    int passengers, fuelcap, mpg;
    
    void range(){
        System.out.println( "Range is " + fuelcap * mpg );
    }
}

public class AddMeth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        
        System.out.print( "minivan can carry " + minivan.passengers + ". " );
        minivan.range();
        System.out.print( "sportcar can carry " + sportcar.passengers + ". " );
        sportcar.range();
    }
    
}
