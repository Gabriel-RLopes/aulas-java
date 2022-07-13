/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genarrays;

/**
 *
 * @author grgab
 */

class Gen<T extends Number>{
    T ob;
    
    T vals[];
    
    Gen( T o, T[] nums){
        ob = o;
        vals = nums;
    }
}
public class GenArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer n[] = { 1, 2, 3, 4, 5 };
        Gen<Integer> iOb = new Gen<Integer>(50, n);
        
        Gen<?> gens[] = new Gen<?>[10];
        
    }
    
}
