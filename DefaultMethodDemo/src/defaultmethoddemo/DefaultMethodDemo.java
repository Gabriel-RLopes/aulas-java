/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defaultmethoddemo;

/**
 *
 * @author grgab
 */

class MyIfImp implements MyIf{
    public int getUserId(){
        return 100;
    }
}
public class DefaultMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyIfImp obj = new MyIfImp();
        
        System.out.println("User Id is " + obj.getUserId() );
        System.out.println("Administrator Id is " + obj.getAdminID() );
    }
    
}
