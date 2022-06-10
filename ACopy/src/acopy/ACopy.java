/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acopy;

/**
 *
 * @author grgab
 */
public class ACopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, nums1[] = new int[10], nums2[] = new int[10];
        
        for( i = 0; i < 10; i++ )
            nums1[i] = i;
        
        if( nums2.length >= nums1.length )     
            for( i = 0; i < nums1.length; i++ )
                nums2[i] = nums1[i];
        
        for( i = 0; i < nums2.length; i++)
            System.out.print( nums2[i] + " " );
        System.out.println();
    }    
}
