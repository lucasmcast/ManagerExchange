/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class DB {
   
    public List<String> getMoedasMB(){
        List<String> moedasMercadoBitcoin = new ArrayList();
        
        moedasMercadoBitcoin.add("BTC");
        moedasMercadoBitcoin.add("LTC");
        moedasMercadoBitcoin.add("BCH");
        
        return moedasMercadoBitcoin;
    }
    
    public List<String> getMoedaBC(){
        List<String> moedaBitCambio = new ArrayList<>();
        
        moedaBitCambio.add("BTC");
        return moedaBitCambio;
    }
    
    private Exchange preencheMercadoBitcoin(){
        Exchange mercadoBitcoin = new Exchange();
        mercadoBitcoin.setNome("Mercado Bitcoin");
        mercadoBitcoin.setURI("https://www.mercadobitcoin.net/api/");
        mercadoBitcoin.setMoedas(getMoedasMB());
        mercadoBitcoin.setMetodo("/ticker");
        
        return mercadoBitcoin;
    }
    
    private Exchange preencherBitcambio(){
        Exchange bitcambio = new Exchange();
        bitcambio.setNome("Bit Cambio");
        bitcambio.setURI("https://api.blinktrade.com/api/v1/BRL/");
        bitcambio.setMoedas(getMoedaBC());
        bitcambio.setMetodo("/ticker");
        
        return bitcambio;
    }
    
    public ArrayList<Exchange> getAllExchange(){
        ArrayList<Exchange> exchanges = new ArrayList<>();
        Exchange mercaBitcoin = preencheMercadoBitcoin();
        Exchange bitcambio = preencherBitcambio();
        exchanges.add(mercaBitcoin);
        exchanges.add(bitcambio);
        System.out.println(exchanges.size());
        return exchanges;
    }
}
