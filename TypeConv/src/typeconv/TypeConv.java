/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package typeconv;

/**
 *
 * @author grgab
 */
class Overload2{
    void f( int x ){
        System.out.println("inside f(int): " + x );
    }
    
    void f( double x ){
        System.out.println("Inside f(double): " + x );
    }
    
    void f( byte x){
        System.out.println("Inside f(byte): " + x );
    }
}
public class TypeConv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Overload2 ob = new Overload2();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        
        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);
    }
    
}
