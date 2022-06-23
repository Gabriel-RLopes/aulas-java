/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finald;

/**
 *
 * @author grgab
 */

class ErrorMsg{
    
    final int OUTERR   = 0;
    final int INERR    = 1;
    final int DISKERR  = 2;
    final int INDEXERR = 3;
    
    String msgs[] = {
        "output error",
        "input error",
        "disk full",
        "index out-of-bounds"
    };
    
    String getErrorMsg( int i ){
        if(  i >= 0 && i < msgs.length ) return msgs[i];
        else return "invalid error code";
    }
}
public class FinalD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ErrorMsg err = new ErrorMsg();
        
        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
    
}
