package org.example.calculadorpreco;

public class PrincipalCalcular {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        System.out.println(taxi.calcularCorrida(10, true));
    }
}
