import com.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ImpressoraTeste {
    Impressora impressora;

    @BeforeEach
    public void setUp(){
        impressora = new Impressora();
    }

    //Impressora Iniciada

    @Test
    public void naoDeveDesligarImpressoraInicializando(){
        impressora.setEstado(ImpressoraEstadoIniciada.getInstance());
        assertFalse(impressora.desligar());
    }
    @Test
    public void naoDeveImprimirImpressoraInicializando(){
        impressora.setEstado(ImpressoraEstadoIniciada.getInstance());
        assertFalse(impressora.imprimir());
    }
    @Test
    public void naoDevePausarImpressoraInicializando(){
        impressora.setEstado(ImpressoraEstadoIniciada.getInstance());
        assertFalse(impressora.pausar());
    }
    @Test
    public void deveGerarErroImpressoraInicializando(){
        impressora.setEstado(ImpressoraEstadoIniciada.getInstance());
        assertTrue(impressora.gerarErro());
    }
    @Test
    public void deveFicarProntaImpressoraInicializando(){
        impressora.setEstado(ImpressoraEstadoIniciada.getInstance());
        assertTrue(impressora.ficarPronta());
    }

    //Impressora Pronta
    @Test
    public void naoDeveIniciarImpressoraPronta(){
        impressora.setEstado(ImpressoraEstadoPronta.getInstance());
        assertFalse(impressora.iniciar());
    }
    @Test
    public void naoDevePausarImpressoraPronta(){
        impressora.setEstado(ImpressoraEstadoPronta.getInstance());
        assertFalse(impressora.pausar());
    }
    @Test
    public void deveImprimirImpressoraPronta(){
        impressora.setEstado(ImpressoraEstadoPronta.getInstance());
        assertTrue(impressora.imprimir());
    }
    @Test
    public void deveGerarErroImpressoraPronta(){
        impressora.setEstado(ImpressoraEstadoPronta.getInstance());
        assertTrue(impressora.gerarErro());
    }
    @Test
    public void deveDesligarImpressoraPronta(){
        impressora.setEstado(ImpressoraEstadoPronta.getInstance());
        assertTrue(impressora.desligar());
    }

    //Impressora Imprimindo
    @Test
    public void nãoDeveIniciarImpressoraImprimindo(){
        impressora.setEstado(ImpressoraEstadoImprimindo.getInstance());
        assertFalse(impressora.iniciar());
    }
    @Test
    public void nãoDeveDesligarImpressoraImprimindo(){
        impressora.setEstado(ImpressoraEstadoImprimindo.getInstance());
        assertFalse(impressora.desligar());
    }
    @Test
    public void devePausarImpressoraImprimindo(){
        impressora.setEstado(ImpressoraEstadoImprimindo.getInstance());
        assertTrue(impressora.pausar());
    }
    @Test
    public void deveGerarErroImpressoraImprimindo(){
        impressora.setEstado(ImpressoraEstadoImprimindo.getInstance());
        assertTrue(impressora.gerarErro());
    }
    @Test
    public void deveFicarProntaImpressoraImprimindo(){
        impressora.setEstado(ImpressoraEstadoImprimindo.getInstance());
        assertTrue(impressora.ficarPronta());
    }

    //Impressora com Erro
    @Test
    public void nãoDeveImprimirImpressoraComErro(){
        impressora.setEstado(ImpressoraEstadoComErro.getInstance());
        assertFalse(impressora.imprimir());
    }
    @Test
    public void nãoDevePausarImpressoraComErro(){
        impressora.setEstado(ImpressoraEstadoComErro.getInstance());
        assertFalse(impressora.pausar());
    }
    @Test
    public void deveIniciarImpressoraComErro(){
        impressora.setEstado(ImpressoraEstadoComErro.getInstance());
        assertTrue(impressora.iniciar());
    }
    @Test
    public void deveFicarProntaImpressoraComErro(){
        impressora.setEstado(ImpressoraEstadoComErro.getInstance());
        assertTrue(impressora.ficarPronta());
    }
    @Test
    public void deveDesligarImpressoraComErro(){
        impressora.setEstado(ImpressoraEstadoComErro.getInstance());
        assertTrue(impressora.desligar());
    }

    //Impressora Pausada
    @Test
    public void nãoDeveIniciarImpressoraPausada(){
        impressora.setEstado(ImpressoraEstadoPausada.getInstance());
        assertFalse(impressora.iniciar());
    }
    @Test
    public void nãoDeveDesligarImpressoraPausada(){
        impressora.setEstado(ImpressoraEstadoPausada.getInstance());
        assertFalse(impressora.desligar());
    }
    @Test
    public void deveImprimirImpressoraPausada(){
        impressora.setEstado(ImpressoraEstadoPausada.getInstance());
        assertTrue(impressora.imprimir());
    }
    @Test
    public void deveGerarErroImpressoraPausada(){
        impressora.setEstado(ImpressoraEstadoPausada.getInstance());
        assertTrue(impressora.gerarErro());
    }
    @Test
    public void deveFicarProntaImpressoraPausada(){
        impressora.setEstado(ImpressoraEstadoPausada.getInstance());
        assertTrue(impressora.ficarPronta() );
    }
    //Impresora Desligada
    @Test
    public void deveIniciarImpressoraDesligada(){
        impressora.setEstado(ImpressoraEstadoDesligada.getInstance());
        assertTrue(impressora.iniciar());
    }
    @Test
    public void nãoDeveFicarProntaImpressoraDesligada(){
        impressora.setEstado(ImpressoraEstadoDesligada.getInstance());
        assertFalse(impressora.ficarPronta());
    }
    @Test
    public void nãoDeveImprimirImpressoraDesligada(){
        impressora.setEstado(ImpressoraEstadoDesligada.getInstance());
        assertFalse(impressora.imprimir());
    }
    @Test
    public void nãoDeveGerarErroImpressoraDesligada(){
        impressora.setEstado(ImpressoraEstadoDesligada.getInstance());
        assertFalse(impressora.gerarErro());
    }
    @Test
    public void nãoDevePausarImpressoraDesligada(){
        impressora.setEstado(ImpressoraEstadoDesligada.getInstance());
        assertFalse(impressora.pausar());
    }
}
