/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defaultmethoddemo;

/**
 *
 * @author grgab
 */
public interface MyIf {
    int getUserId();
    default int getAdminID(){
        return 1;
    }
    
}
