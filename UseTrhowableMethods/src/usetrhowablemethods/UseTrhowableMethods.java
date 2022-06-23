/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usetrhowablemethods;

/**
 *
 * @author grgab
 */
class ExcTest{
    static void genException(){
        int nums[] = new int[ 4 ];
        
        System.out.println( "before exception is genereted" );
        
        nums[ 7 ] = 10;
        System.out.println( "this wont be displayed" );
    }
}
public class UseTrhowableMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ExcTest.genException();
        }catch( ArrayIndexOutOfBoundsException exc ){
            System.out.println("standart message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace");
            exc.printStackTrace();
        }
        System.out.println("after catch statement");
    }
    
}
