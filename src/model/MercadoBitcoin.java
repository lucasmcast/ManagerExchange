/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.Utilitario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class MercadoBitcoin extends Exchange {

    private Negociacoes ticker;
    
    public MercadoBitcoin() {
        super.setNome("Mercado Bitcoin");
        super.setMetodo("/ticker");
        super.setMoedas(getMoedasMB());
        super.setURI("https://www.mercadobitcoin.net/api/");
    }

    public Negociacoes getTicker() {
        return ticker;
    }

    public void setTicker(Negociacoes ticker) {
        this.ticker = ticker;
    }

    public final List<String> getMoedasMB() {
        List<String> moedasMercadoBitcoin = new ArrayList();

        moedasMercadoBitcoin.add("BTC");
        moedasMercadoBitcoin.add("LTC");
        moedasMercadoBitcoin.add("BCH");

        return moedasMercadoBitcoin;
    }
}
