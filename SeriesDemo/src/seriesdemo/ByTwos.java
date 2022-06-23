/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriesdemo;

/**
 *
 * @author grgab
 */
public class ByTwos implements Series {
    int start, val;
    
    ByTwos(){
        start = 0;
        val = 0;
    }
    
    public int getNext(){
        val += 2;
        return val;
    }
    
    public void reset(){
        val = start;
    }
    
    public void setStart( int x ){
        start = x;
        val = x;
    }
    
    public static void main(String args[]){
        
    }
    
}
