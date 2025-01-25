package org.example.extrairmetodo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Usuario {
    private String nome;
    private Boolean estaAtivo;
    private LocalDate ultimoLogin;

    public Usuario(String nome, Boolean estaAtivo, LocalDate ultimoLogin) {
        this.nome = nome;
        this.estaAtivo = estaAtivo;
        this.ultimoLogin = ultimoLogin;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(Boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public LocalDate getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDate ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }
}
