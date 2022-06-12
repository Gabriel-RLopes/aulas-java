/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package substr;

/**
 *
 * @author grgab
 */
public class SubStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String orgstr = "Java makes the web move.";
        String substr = orgstr.substring(5, 18);
        
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
        
        
    }
    
}
