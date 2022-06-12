/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phone;

/**
 *
 * @author grgab
 */
public class Phone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numbers[][] = {
            { "tom", "555-3322" },
            { "Mary", "555-8976" },
            { "Jon", "555-1037" },
            { "Rachel", "555-1400" }
        };
        int i;
        
        if( args.length != 1 )
            System.out.println("Usage: java Phone <name>");
        else{
            for( i = 0; i < numbers.length; i++ ){
                if( numbers[i][0].equals( args[0] ) ){
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if( i == numbers.length )
                System.out.println("Name Not found");
        }
    }
    
}
