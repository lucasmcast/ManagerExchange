/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.Utilitario;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.net.ssl.HttpsURLConnection;
import model.MercadoBitcoin;
import model.Negociacoes;
//import modelo.Usuario;
/**
 *
 * @author marcelosiedler
 */
public class Teste {

    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {

 
        //Gson g = new Gson();
        //Usuario u = new Usuario();
        /*Type usuarioType = new TypeToken<Usuario>() {
        }.getType();
        
        u.setLogin("programatche");
        u.setEmail("aaa.com");
        u.setSenha("4312");
        u.setPerfil("Admin");
        String json = g.toJson(u, usuarioType);
        
        http.sendPost(url, json, "PUT");
      */
        //DecimalFormat format = new DecimalFormat();
	//format.setMaximumFractionDigits(2);
	//format.setMinimumFractionDigits(1);
	double x = 27700.00000000;
	System.out.println(x);
        
        
        
        Utilitario util = new Utilitario();
        String url = "https://www.mercadobitcoin.net/api/BTC/ticker/";
        
        String retorno = util.sendGet(url, "GET");
        if(retorno != null){
             //GsonBuilder gson = new GsonBuilder();
             Gson pegador = new Gson();
             MercadoBitcoin t =  pegador.fromJson(retorno, MercadoBitcoin.class);
             //System.out.println(retorno);
             System.out.println(t.getTicker().getHigh());
        }else{
            
            System.out.println("erro ao executar http");
        }
       
        
    }

   

   
}