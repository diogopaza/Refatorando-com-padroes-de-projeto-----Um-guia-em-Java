import org.example.primeiroexemplo.service.Busca;
import org.example.primeiroexemplo.service.Criterio;
import org.example.primeiroexemplo.service.Parametros;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CriterioTest {

    @Test
    public void retornaResultadosPorPaginaQuandoEspecificado() {
        Parametros parametros = new Parametros("meu produto", 20);
        Criterio criterio = Busca.criarCriterio(parametros);
        assertEquals(criterio.getResultadoPorPagina(), 20);
    }

    @Test
    public void calculaPrefinalCom20DeBonus() {
        Parametros parametros = new Parametros("novo produto", 20, 100);
        assertEquals(Busca.calcula(parametros.getPreco(), 20), 120);
    }

    @Test
    public void calculaPrefinalCom5DeBonus() {
        Parametros parametros = new Parametros("novo produto", 20, 100);
        assertEquals(Busca.calcula(parametros.getPreco(), 5), 100);
    }
}
