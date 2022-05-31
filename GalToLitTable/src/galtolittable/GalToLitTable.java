/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package galtolittable;

/**
 *
 * @author grgab
 */
public class GalToLitTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons, liters;
        int count;
        
        count = 0;
        
        for( gallons = 1; gallons <= 100; gallons++ ){
            
            liters = gallons * 3.7854;
            
            System.out.println( gallons + " gallons is " + liters + " liters" );
            
            count++;
            
            if( count == 10 ){
                System.out.println();
                count = 0;
            }
        }
    }
    
}
