import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoContratacaoTest {

    @Test
    void deveRealizarContratacao() {
        IServico servico = ServicoFactory.obterServico("Contratacao");
        assertEquals("Contratacao realizada", servico.executar());
    }

    @Test
    void deveCancelarContratacao() {
        IServico servico = ServicoFactory.obterServico("Contratacao");
        assertEquals("Contratacao cancelada", servico.cancelar());
    }

}
