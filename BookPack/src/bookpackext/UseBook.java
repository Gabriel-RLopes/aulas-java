/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookpackext;
import bookpack.*;

/**
 *
 * @author grgab
 */
public class UseBook {
    public static void main( String args[] ){
        Book books[] = new Book[5];
        
        books[0] = new  Book( "Java: a beginner's guide", "schildt", 2014 );
        books[1] = new  Book( "java: the complete References", "schildt", 2014 );
        books[2] = new  Book( "the art of java", "schildt and holmes", 2003 );
        books[3] = new  Book( "red storm rising", "clancy", 1986 );
        books[4] = new  Book( "on the road", "kerouac", 1955 );
        
        for( int i = 0; i < books.length; i++ ) books[i].show();
    }
}
