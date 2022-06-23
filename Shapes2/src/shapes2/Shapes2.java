/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapes2;

/**
 *
 * @author grgab
 */

class TwoDShape{
    private double width;
    private double height;
    
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth( double w) {width = w; }
    void setHeight( double h ) { height = h; }
    
    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}

class Triangle extends TwoDShape{
    String style;
    
    double area(){
        return getWidth() * getHeight() /2;
    }
    
    void showStyle(){
        System.out.println("Triangle is " + style );
    }
}

public class Shapes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        
        t1.setHeight(4.0); 
        t1.setWidth(4.0);
        t1.style = "Filled";
        
        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "outlined";
        
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area() );
        
        System.out.println();
        
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area() );
    }
    
}
