package org.example.calculadorpreco;

public class CalculadorDePreco {
    private static final float VALOR_POR_KM = 0.48f;
    public static final float BANDEIRA_UM = 1.2f;
    public static final float BANDEIRA_DOIS = 1.8f;

    public float calcularCorrida(float kmRodados, boolean bandeiraDois) {
        if (bandeiraDois) {
            return CalculadorDePreco.BANDEIRA_DOIS * (kmRodados * VALOR_POR_KM);
        } else {
            return CalculadorDePreco.BANDEIRA_UM * (kmRodados * VALOR_POR_KM);
        }
    }
}
