/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qsdemo;

/**
 *
 * @author grgab
 */

class QuickSort{
    static void qsort( char items[] ){
        //System.out.println(items.length);
        qs(  items, 0, items.length - 1 );
    }
    private static void qs( char items[], int left, int right ){
        int i, j;
        char x, y;
        
        i = left; j = right;
        x = items[ (left+right)/2 ];
        
        do {
            while( (items[i] < x ) && ( i < right ) ) i++;
            while( (x < items[j] ) && ( j > left  ) ) j--;
            
            if( i <= j ){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        }while( i <=  j );
        
        if( left < j ) qs( items, left, j);
        if( i < right ) qs( items, i, right );
        
    }
}
public class QSDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char a[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
        int i;
        
        System.out.print("Original Array: ");
        for( i = 0; i < a.length; i++ )
            System.out.print( a[i] );
        
        System.out.println();
        
        QuickSort.qsort(a);
        
        System.out.print("Sorted array: ");
        for( i=0; i < a.length; i++ )
            System.out.print( a[i] );
    }
    
}
