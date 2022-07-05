/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boundsdemo;

/**
 *
 * @author grgab
 */
class NumericFns< T extends Number>{
    T num;
    
    NumericFns( T n ){
        num = n;
    }
    
    double reciprocal(){
        return 1/num.doubleValue();
    }
    
    double fraction(){
        return num.doubleValue() - num.intValue();
    }
}

public class BoundsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);
        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
        System.out.println("Fractional componet of iOb is " + iOb.fraction() );
        
        NumericFns<Double> dOb = new NumericFns<Double>(5.25);
        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("Fractional component of dOb is " + dOb.fraction());
        
        //NumericFns<String> strOb = new NUmericFns<String>("error");
    }
    
}
