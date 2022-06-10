/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strops;

/**
 *
 * @author grgab
 */
public class StrOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "when it comes to web programing, java is #1";
        String str2 = new String(str1);
        String str3 = "java strings are powerfull";
        int result, idx;
        char ch;
        
        System.out.println( "length of str1: " + str1.length() );
        for( int i =0; i < str1.length(); i++ )
            System.out.print( str1.charAt(i) );
        System.out.println();
        
        if( str1.equals(str2) )
            System.out.println("str1 equals str2");
        else
            System.out.println("str1 does not equal str2");
        
        if( str1.equals(str3) )
            System.out.println("str1 equals str3");
        else
            System.out.println("str1 does not equal str3");
        
        result = str1.compareTo(str3);
        if( result == 0 )
            System.out.println( "Str1 and str3 are equal" );
        else if( result < 0 )
            System.out.println( "Str1 is less than str3" );
        else
            System.out.println( "Str1 is greater than str3" );
        
        str2 = "one two three one";
        
        idx = str2.indexOf( "one" );
        System.out.println("index of first ocurrence of one: " + idx );
        idx = str2.lastIndexOf("one");
        System.out.println("index of last ocurrence of one: " + idx);
    }
    
}
