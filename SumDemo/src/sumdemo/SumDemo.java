/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumdemo;

/**
 *
 * @author grgab
 */

class Summation{
    int sum;
    
    Summation(int num){
        sum = 0;
        for( int i = 1; i <= num; i++)
            sum += i;
    }
    
    Summation( Summation ob ){
        sum = ob.sum;
    }
   
}
public class SumDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Summation s1 = new Summation(5);
        Summation s2 = new Summation( s1 );
        
        System.out.println("s1.sum: " + s1.sum );
        System.out.println("s2.sum: " + s2.sum );
    }
    
}
