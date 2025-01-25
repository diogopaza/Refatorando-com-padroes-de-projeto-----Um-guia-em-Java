package org.example.primeiroexemplo.service;

public class Busca {



    public static Criterio criarCriterio(Parametros parametros) {
        Criterio criterio = new Criterio(parametros.getQuantidade());
        return criterio;
    }

    public static int calcula(Double precoBase, int bonusPorcentagem) {
        if(bonusPorcentagem < 10) {
            return precoBase.intValue();
        } else {
            Double valorFinal = precoBase + (precoBase * (bonusPorcentagem/100));
            return valorFinal.intValue();
        }

    }
}
