/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multicatch;

/**
 *
 * @author grgab
 */
public class MultiCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a= 88, b = 0, result;
        char chrs[] = { 'A', 'B', 'C' };
        
        for( int i = 0; i < 2; i++ ){
            try {
                if( i== 0 )
                    result = a /b;
                else
                    chrs[5] = 'X';
            }catch( ArithmeticException | ArrayIndexOutOfBoundsException e ){
                System.out.println("exception cauth: " + e);
            }
        }
        
        System.out.println("After multi catch");
    }
    
}
