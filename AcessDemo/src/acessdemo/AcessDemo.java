/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acessdemo;

/**
 *
 * @author grgab
 */
class MyClass {
    private int alpha;
    public int beta;
    int gamma;
            
    void setAlpha( int a ){
        alpha = a;
    }
    
    int getAlpha(){
        return alpha;
    }
}


public class AcessDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyClass ob = new MyClass();
        
        ob.setAlpha( -99 );
        
        System.out.println("ob.alpha is " + ob.getAlpha() );
        
     //   ob.alpha = 10;
        
        ob.beta = 88;
        ob.gamma = 99;
    }
    
}
