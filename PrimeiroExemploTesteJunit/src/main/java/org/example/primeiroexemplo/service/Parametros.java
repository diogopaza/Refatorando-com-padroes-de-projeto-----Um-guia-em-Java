package org.example.primeiroexemplo.service;

public class Parametros {

    private String produto;
    private int quantidade;
    private double preco;

    public Parametros(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Parametros(String produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
