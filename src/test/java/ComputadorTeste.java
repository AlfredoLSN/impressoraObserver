import com.example.Computador;
import com.example.Impressora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ComputadorTeste {
    @Test
    void deveNotificarUmComputador(){
        Impressora impressora = new Impressora("Impressora-Test");
        Computador computador = new Computador("Pc-Test");
        computador.conectar(impressora);
        impressora.ficarPronta();
        assertEquals("A impressora Impressora-Test está pronta", computador.getLastNotification());
    }
    @Test
    void deveNotificarComputadores(){
        Impressora impressora = new Impressora("Impressora-Test");
        Computador computador1 = new Computador("Pc-1");
        Computador computador2 = new Computador("Pc-2");
        computador1.conectar(impressora);
        computador2.conectar(impressora);
        impressora.ficarPronta();
        assertEquals("A impressora Impressora-Test está pronta", computador1.getLastNotification());
        assertEquals("A impressora Impressora-Test está pronta", computador2.getLastNotification());
    }
    @Test
    void naoDeveNotificarComputador(){
        Impressora impressora = new Impressora("Impressora-Test");
        Computador computador = new Computador("Pc-Test");
        impressora.ficarPronta();
        assertEquals(null, computador.getLastNotification());
    }
    @Test
    void deveNotificarComputadoreImpressoraA(){
        Impressora impressoraA = new Impressora("ImpressoraA");
        Impressora impressoraB = new Impressora("ImpressoraB");
        Computador computador1 = new Computador("Pc-1");
        Computador computador2 = new Computador("Pc-2");
        computador1.conectar(impressoraA);
        computador2.conectar(impressoraB);
        impressoraA.ficarPronta();
        assertEquals("A impressora ImpressoraA está pronta", computador1.getLastNotification());
        assertEquals(null, computador2.getLastNotification());
    }
}
