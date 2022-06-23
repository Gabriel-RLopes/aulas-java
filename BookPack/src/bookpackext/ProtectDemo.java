/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookpackext;

/**
 *
 * @author grgab
 */

class ExtBook extends bookpack.Book {
    private String publisher;
    
    public ExtBook( String t, String a, int d, String p ){
        super( t, a, d );
        publisher = p;
    }
    
    public void show(){
        super.show();
        System.out.println(publisher);
        System.out.println();
    }
    
    public String getPublisher() { return publisher; }
    public void setPublisher( String p ) { publisher = p; }
    
    //instruções corretas pois uma subclasse pode ter acesso a membros protegidos da super classe
    public String getTitle() { return title; }
    public void setTitle( String t ) { title = t; }
    public String getAuthor() { return author; }
    public void setAuthor( String a ) { author = a; }
    public int getPubDate() { return pubDate; }
    public void setPubDate( int d ) { pubDate = d; }
    
}

public class ProtectDemo {
    public static void main( String args[] ){
        ExtBook books[] = new ExtBook[5];
        
        books[0] = new ExtBook( "Java: a beginner's guide", "schildt", 2014, "Mcgraw-hill Professional" );
        books[1] = new ExtBook( "java: the complete References", "schildt", 2014, "Mcgraw-hill Professional" );
        books[2] = new ExtBook( "the art of java", "schildt and holmes", 2003, "Mcgraw-hill Professional" );
        books[3] = new ExtBook( "red storm rising", "clancy", 1986, "putnam" );
        books[4] = new ExtBook( "on the road", "kerouac", 1955, "viking" );
        
        for( int i = 0; i < books.length; i++ ) books[i].show();
        
        System.out.println("showing all books by schildt");
        for (int i = 0; i < books.length; i++)
            if( books[i].getAuthor() == "schildt" )
                System.out.println(books[i].getTitle());
    }
}
