/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapes6;

/**
 *
 * @author grgab
 */

class TwoDShape{
    private double width;
    private double height;
    
    TwoDShape(){
        width = height = 0.0;
    }
    
    TwoDShape( double w, double h ){
        width = w;
        height = h;
    }
    
    TwoDShape( double x ){
        width = height = x;
    }
    
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth( double w ) { width = w; }
    void setHeight( double h ) { height = h; }
    
    void showDim(){
        System.out.println("Width and height are " + width + " and " + height );
    }
}

class Triangle extends TwoDShape{
    private String style;
    
    Triangle(){
        super();
        style = "none";
    }
    
    Triangle( String s, double w, double h ){
        super( w, h );
        style = s;
    }
    
    Triangle( double x ){
        super( x );
        style = "filled";
    }
    
    double area(){
        return getWidth() * getHeight() / 2;
    }
    
    void showStyle(){
        System.out.println("Triangle is " + style );
    }
}

class ColorTriangle extends Triangle{
    private String color;
    
    ColorTriangle( String c, String s, double w, double h){
        super( s, w, h );
        color = c;
    }
    
    String getColor() { return color; }
    void ShowColor(){
        System.out.println("Color is " + color );
    }
}

public class Shapes6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColorTriangle t1 = new ColorTriangle( "blue", "outilined", 8.0, 12.0 );
        ColorTriangle t2 = new ColorTriangle( "red", "filled", 2.0, 2.0 );
        
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.ShowColor();
        System.out.println("Area is " +  t1.area() );
        
        System.out.println();
        
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.ShowColor();
        System.out.println("Area is " + t2.area() );
    }
    
}
