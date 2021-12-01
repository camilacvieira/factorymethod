import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoFeriasTest {
    @Test
    void deveMarcarFerias() {
        IServico servico = ServicoFactory.obterServico("Férias");
        assertEquals("Férias marcada", servico.executar());
    }

    @Test
    void deveCancelarFerias() {
        IServico servico = ServicoFactory.obterServico("Férias");
        assertEquals("Férias cancelada", servico.cancelar());
    }
}
