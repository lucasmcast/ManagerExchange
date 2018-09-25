/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author lucas
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;
import model.Exchange;

public class Utilitario {
    
    //o agente ou aplicação que sera usada na busca http
    private final String USER_AGENT = "Mozilla/5.0";
    // HTTP GET request
    public String sendGet(String url, String method){
        
        try{         
        
        //cria um URLobjeto da string representada
        URL obj = new URL(url);
        //Abre uma conexao com a url e atribui essa conexao ao objeto HttpURLConnection   
        //assim o protocolo HTTP pode ser manupulado
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // validação do methodo, o padrao opciona é GET
        //se metodo for diferente de nulo, vai atribuir ao metodo passado como parametro
        if(method!=null)
        {
            con.setRequestMethod(method);
        }
        //define o User-agent para a conexao, ou seja, aplicativo que ira acessar a url
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        //retorna o codigo de status da conexao
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        //criar um objeto do tipo BufferedReader e atribui o texto da conexao nele
        BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));
        //cria uma variavel para ser atribuida as linha do BufferedReader
        String inputLine;
        StringBuffer response = new StringBuffer();

        //enquando não termina o texta da pagina ele va executar a instrução while atribuindo ao objeto response
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        return response.toString();
        
        }catch(MalformedURLException xurl){
            JOptionPane.showMessageDialog(null, "Erro de protocolo" + xurl);
            return null;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro IO" + ex);
            return null;
        }     

    }
    
    public String vericaURIExchange(Exchange exchange, String moeda){
      
        String uri;
        String metodo = exchange.getMetodo();
        
        if(exchange.getNome().equals("Mercado Bitcoin")){
            uri = exchange.getURI() + moeda + metodo;
            return uri;            
        }
        
        if(exchange.getNome().equals("Bit Cambio")){
            uri = exchange.getURI() + metodo + moeda;
            return uri;
        }
        
        return null;
    }
    
}
