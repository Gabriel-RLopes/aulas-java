/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriesdemo;

/**
 *
 * @author grgab
 */

class ByThrees implements Series {
    int start;
    int val;
    
    ByThrees(){
        start = 0;
        val = 0;
    }
    
    public int getNext(){
        val += 3;
        return val;
    }
    
    public void reset(){
        val = start;
    }
    
    public void setStart( int x ){
        start = x;
        val = x;
    }
}
public class SeriesDemo2 {
    public static void main(String args[]){
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;
        
        for( int i = 0; i < 5; i++ ){
            ob = twoOb;
            System.out.println("next BYTwos value is: " + ob.getNext());
            ob = threeOb;
            System.out.println("next ByThrees value is: " + ob.getNext());
        }
    }
}
