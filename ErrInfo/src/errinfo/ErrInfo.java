/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package errinfo;

/**
 *
 * @author grgab
 */
class Err{
    String msg;
    int severity;
    
    Err( String m, int s ){
        msg = m;
        severity  = s;
    }
}

class ErrorInfo{
    String msgs[] = {
        "output Error",
        "input Error",
        "Disk Full",
        "Index out-of-bounds"
    };
    
    int howbad[] = { 3, 3, 2, 4 };
    
    Err getErrorIInfo( int i ){
        if( i >= 0 & i < msgs.length )
            return new Err( msgs[i], howbad[i] );
        else
            return new Err( "Invalid Error Code", 0 );
    }
}

public class ErrInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ErrorInfo err = new ErrorInfo();
        Err e;
        
        e = err.getErrorIInfo(2);
        System.out.println(e.msg + " severity: " + e.severity );
        
        e = err.getErrorIInfo(19);
        System.out.println(e.msg + " Severity: " + e.severity );
    }
    
}
