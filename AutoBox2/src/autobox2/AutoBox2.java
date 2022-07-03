/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autobox2;

/**
 *
 * @author grgab
 */
public class AutoBox2 {

    /**
     * @param args the command line arguments
     */
    static void m( Integer v ){
        System.out.println("m() received " + v);
    }
    
    static int m2(){
        return 10;
    }
    
    static Integer m3(){
        return 99;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        m(199);
        Integer iOb = m2();
        System.out.println("Return value from m2() is " + iOb );
        
        int i = m3();
        System.out.println("Return value from m3() is " + i );
        
        iOb = 100;
        System.out.println("square root of iOb is " + Math.sqrt(iOb));
    }
    
}
