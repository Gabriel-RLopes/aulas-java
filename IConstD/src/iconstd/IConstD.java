/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iconstd;

/**
 *
 * @author grgab
 */

interface IConst{
    int MIN = 0;
    int MAX = 10;
    String ERRORMSG = "BONDARY ERROR";
}

public class IConstD implements IConst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = new int[ MAX ];
        
        for( int i = MIN; i < 11; i++ ){
            if( i >= MAX ) System.out.println( ERRORMSG );
            else{
                nums[ i ] = i;
                System.out.println( nums[ i ] + " " );
            }
        }
    }
    
}
