/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execdemo;

/**
 *
 * @author grgab
 */
public class ExecDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = new int[4];
        
        try{
            System.out.println("Before exeptiom");
            nums[7] = 10;
            System.out.println("this won't be displayed");
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("index out of bounds");
        }
        System.out.println("after catch statement");
    }
    
}
