/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stickers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

/**
 *
 * @author grgab
 */
public class Stickers {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        // fazendo a conexao http
        String url = "https://raw.githubusercontent.com/alura-cursos/imersai-java/api/TopMovies.json";
        URI endereco = URI.create( url );
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
    
        //extrair só os dados que interessam
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        
       //exibir e manipular dados
       
       for( Map<String, String> filme : listaDeFilmes ){
           System.out.println(filme.get("title"));
           System.out.println(filme.get("image"));
           System.out.println(filme.get("imDbRating"));
           System.out.println();
       }
        
    }
    
    
    
}
