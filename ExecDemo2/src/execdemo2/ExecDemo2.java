/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execdemo2;

/**
 *
 * @author grgab
 */

class ExecTest {
    static void genException(){
        int nums[] = new int[4];
        
        System.out.println("Before exeception is genereted");
        
        nums[7]= 10;
        System.out.println("this won't be displayed");
    }
}
public class ExecDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ExecTest.genException();
        }catch( ArrayIndexOutOfBoundsException exc ){
            System.out.println("index out of bounds");
        }
        System.out.println("after catch statement");
    }
    
}
