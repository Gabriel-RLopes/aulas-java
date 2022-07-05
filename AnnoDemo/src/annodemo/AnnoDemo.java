/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package annodemo;

/**
 *
 * @author grgab
 */

@Deprecated
class Myclass{
    private String msg;
    
    Myclass( String m ){
        msg = m;
    }
    
    @Deprecated
    String getMsg(){
        return msg;
    }
}

public class AnnoDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Myclass myObj = new Myclass( "test" );
        
        System.out.println(myObj.getMsg());
    }
    
}
