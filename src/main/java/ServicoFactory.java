public class ServicoFactory {

    public static IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Servico" + servico);
            objeto = classe;
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServico) objeto;
    }
}
