/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package errmsg;

/**
 *
 * @author grgab
 */
class ErrorMsg{
    String msgs[] = {
        "output Error",
        "input Error",
        "Disk Full",
        "Index out-of-bounds"
    };
    
    String getErrorMsg( int i ){
        if( i >= 0 & i < msgs.length )
            return msgs[i];
        else
            return "invalid error code";
    }
}
public class ErrMsg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
    
}
