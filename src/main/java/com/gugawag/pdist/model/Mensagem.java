package com.gugawag.pdist.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mensagem {

    @Id
    private long id;
    private String texto;

    public Mensagem() {
        
    }

    public Mensagem(long id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }
}
