/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wildcarddemo;

/**
 *
 * @author grgab
 */
class NumericFns<T extends Number>{
    T num;
    
    NumericFns( T n ){
        num = n;
    }
    
    double reciprocal(){
        return 1 / num.doubleValue();
    }
    
    double fraction(){
        return num.doubleValue() - num.intValue();
    }
    
    boolean absEqual( NumericFns<?> ob ){
        if( Math.abs( num.doubleValue() ) == Math.abs(ob.num.doubleValue()) ) return true;
        return false;
    }
}
public class WildcardDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>( -6.0 );
        NumericFns<Long> lOb = new NumericFns<Long>( 5L );
        
        System.out.println("Testing iOb and dOb");
        if( iOb.absEqual(dOb) )
            System.out.println("Absolute values are equals");
        else
            System.out.println("Absolute values differ");
        
        System.out.println();
        
        System.out.println("Testing iOb and lOb.");
        if( iOb.absEqual(lOb) )
            System.out.println("Absoute values are equals");
        else
            System.out.println("Absolute values differ");
    }
    
}
