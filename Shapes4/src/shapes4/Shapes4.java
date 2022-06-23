/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapes4;

/**
 *
 * @author grgab
 */
class TwoDShape{
    private double width;
    private double height;
    
    TwoDShape( double w, double h ){
        width = w;
        height = h;
    }
    
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
    
    Triangle( String s, double w, double h ){
        super( w, h ); 
        style = s;
    }
    
    double area(){
        return getWidth() * getHeight() /2;
    }
    
    void showStyle(){
        System.out.println("Triangle is " + style );
    }
}

public class Shapes4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangle t1 = new Triangle( "Filled", 4.0, 4.0 );
        Triangle t2 = new Triangle( "outlined", 8.0, 12.0 );
        
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
