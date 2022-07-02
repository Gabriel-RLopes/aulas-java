/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filehelp;

/**
 *
 * @author grgab
 */

import java.io.*;

class Help{
    String helpfile;
    
    Help( String fname ){
        helpfile = fname; 
    }
    
    boolean helpOn( String what ){
        int ch;
        String topic, info;
        
        try( BufferedReader helpRdr = new BufferedReader( new FileReader( helpfile ) ) ){
            do {
                ch = helpRdr.read();
                
                if( ch == '#' ){
                    topic = helpRdr.readLine();
                    if( what.compareTo(topic) == 0 ){
                        do{
                            info = helpRdr.readLine();
                            if( info != null ) System.out.println(info);
                        }while( ( info != null ) && ( info.compareTo("") != 0 ) );
                        return true;
                    }
                }
            }while( ch != -1 );
        }catch( IOException exc ){
            System.out.println("Error acessing help file");
            return false;
        }
        return false;
    }
    
    String getSelection(){
        String topic = "";
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        
        System.out.println("Enter Topic: ");
        try{
            topic = br.readLine();
        }catch( IOException exc ){
            System.out.println("ERROR reading console.");
        }
        return topic;
    }
}
public class FileHelp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Help hlpobj = new Help( "helpfile.txt" );
        String topic;
        System.out.println("try the help system. Enter 'stop' to end");
        do{
            topic = hlpobj.getSelection();
            if( !hlpobj.helpOn(topic) )
                System.out.println("Topic not found\n");
        }while( topic.compareTo("stop") != 0 );
    }
    
}
