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
 * @author Lucas
 */
public class Bitcambio extends Exchange{
   
    public Bitcambio(){
        super.setNome("Bit Cambio");
        super.setURI("https://api.blinktrade.com/api/v1/BRL");
        super.setMoedas(getMoedaBC());
        super.setMetodo("/ticker?crypto_currency=");
    }
    public final List<String> getMoedaBC(){
        List<String> moedaBitCambio = new ArrayList<>();
        
        moedaBitCambio.add("BTC");
        return moedaBitCambio;
    }
    
}
