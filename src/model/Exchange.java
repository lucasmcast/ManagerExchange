/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lucas
 */
public class Exchange {
    
    private String nome;
    private String fileFoto;
    private String URI;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    
    
}
