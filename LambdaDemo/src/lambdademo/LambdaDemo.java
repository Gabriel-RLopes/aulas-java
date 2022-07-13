/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambdademo;

/**
 *
 * @author grgab
 */

interface MyParamValue{
    double getValue( double v );
}

interface MyValue{
    double getValue();
}

public class LambdaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyValue myVal;
        
        myVal = () -> 98.6;
        
        System.out.println("A constant value: " + myVal.getValue() );
        
        MyParamValue myPval = (n) -> 1.0 /n;
        
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("reciprocal of 8 is " + myPval.getValue(8.0));
    }
    
}
