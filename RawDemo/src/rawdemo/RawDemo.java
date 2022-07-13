/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rawdemo;

/**
 *
 * @author grgab
 */

class Gen<T>{
    T ob;
    
    Gen( T o ){
        ob = o;
    }
    
    T getOb(){
        return ob;
    }
    
}

public class RawDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<String>("Generic Test");
        Gen raw = new Gen( new Double(98.6) );
        
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);
        
        strOb = raw;
        raw = iOb;
    }
    
}
