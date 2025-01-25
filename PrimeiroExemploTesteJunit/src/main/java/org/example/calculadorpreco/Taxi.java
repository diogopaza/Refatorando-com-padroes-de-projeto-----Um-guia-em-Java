package org.example.calculadorpreco;

public class Taxi {



    public float calcularCorrida(float kmRodados, Boolean bandeiraDois) {
        CalculadorDePreco calculadorDePreco = new CalculadorDePreco();
        return calculadorDePreco.calcularCorrida(kmRodados, bandeiraDois);
    }
}
