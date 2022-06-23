/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifextend;

/**
 *
 * @author grgab
 */
interface A{
    void meth1();
    void meth2();
}

interface B extends A{
    void meth3();
}

class MyClass implements B{
    public void meth1(){
        System.out.println("implements meth1()");
    }
    
    public void meth2(){
        System.out.println("implements meth2()");
    }
    
    public void meth3(){
        System.out.println("implements meth3()");
    }
}
public class IFExtend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass ob = new MyClass();
        
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
    
}
