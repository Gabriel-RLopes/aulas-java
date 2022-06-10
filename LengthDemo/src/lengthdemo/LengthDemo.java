/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lengthdemo;

/**
 *
 * @author grgab
 */
public class LengthDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int list[] = new int[10];
        int nums[] = { 1, 2, 3 };
        int table[][] = { 
            {1, 2, 3 },
            {4, 5 },
            {6, 7, 8, 9}
        };
        
        System.out.println( "Length of list is: " + list.length );
        System.out.println( "Lenght of nums is: " + nums.length );
        System.out.println( "Lenght of table is: " + table.length );
        System.out.println( "Lenght of table[0] is: " + table[0].length );
        System.out.println( "Lenght of table[1] is: " + table[1].length );
        System.out.println( "Lenght of table[2] is: " + table[2].length );
        System.out.println();
     
        for( int i = 0; i < list.length; i++ )
            list[i] = i*i;
        
        System.out.print("Here is list: ");
        for( int i = 0; i < list.length; i++ )
            System.out.print( list[i] + " " );
        System.out.println();
        
    }
    
}
