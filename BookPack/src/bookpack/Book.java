/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bookpack;
/**
 *
 * @author grgab
 */
public class Book{     
    protected String title, author;
    protected int pubDate;
    
    public Book( String t, String a, int d ){
        title = t;
        author = a;
        pubDate = d;
    }
    
    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
