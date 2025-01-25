package org.example.primeiroexemplo.service;

public class Criterio {
    private int numeroAtual;

    public Criterio(int numeroAtual) {
        this.numeroAtual = numeroAtual;
    }
    public int getResultadoPorPagina(){
        return numeroAtual;
    }
}
