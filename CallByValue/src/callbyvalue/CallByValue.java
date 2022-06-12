/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package callbyvalue;

/**
 *
 * @author grgab
 */
class Test{
    void noChange( int i, int j){
        i +=j;
        j = -j;
    }
}
public class CallByValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test ob = new Test();
        
        int a = 15, b = 20;
        
        System.out.println( "a and b before call: " + a + " " + b );
        
        ob.noChange( a, b );
        
        System.out.println( "a and b after call: " + a + " " + b );
    }
    
}
