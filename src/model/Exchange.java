/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author lucas
 */
public class Exchange {
    
    private String nome;
    private List<String> moedas;
    private String fileFoto;
    private String URI;
    private String metodo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getMoedas() {
        return moedas;
    }

    public void setMoedas(List<String> moedas) {
        this.moedas = moedas;
    }

    
    public String getFileFoto() {
        return fileFoto;
    }

    public void setFileFoto(String fileFoto) {
        this.fileFoto = fileFoto;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String httpRequest) {
        this.URI = httpRequest;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    
}
