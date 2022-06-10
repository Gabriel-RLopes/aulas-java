/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assingaref;

/**
 *
 * @author grgab
 */
public class AssingARef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        int i;
        
        for( i = 0; i < 10; i++ )
            nums1[i] = i;
        
        for( i = 0; i < 10; i++ )
            nums2[i] = i;
    
        System.out.print( "here is nums1: " );
        for( i = 0; i < 10; i++ )
            System.out.print( nums1[i] + " " );
        System.out.println();
        
        System.out.print( "here is nums2: " );
        for( i = 0; i < 10; i++ )
            System.out.print( nums2[i] + " " );
        System.out.println();
        
        nums2 = nums1;
        
        System.out.print( "here is nums2 after assigment: " );
        for( i = 0; i < 10; i++ )
            System.out.print( nums2[i] + " " );
        System.out.println();
        
        nums2[3] = 99;
        
        System.out.print( "here is nums1 after change through nums2: " );
        for( i = 0; i < 10; i++ )
            System.out.print( nums2[i]+ " " );
        System.out.println();
    }
    
    
}
