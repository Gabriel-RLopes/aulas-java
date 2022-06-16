/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdemo2;

/**
 *
 * @author grgab
 */
class StaticMeth{
    static int val = 1024;
    
    static int valDiv2(){
        return val/2;
    }
}
public class SDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Val is " + StaticMeth.val );
        System.out.println("StaticMeth.ValDiv2(): " + StaticMeth.valDiv2());
        StaticMeth.val = 4;
        System.out.println("Val is " + StaticMeth.val );
        System.out.println("StaticMeth.ValDiv2(): " + StaticMeth.valDiv2());
    }
    
}
