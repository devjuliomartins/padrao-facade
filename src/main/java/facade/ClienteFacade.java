package facade;

public class ClienteFacade {

    public static boolean verificarCompra(Cliente cliente) {
        if (Entrega.getInstancia().verificarClienteComRestricao(cliente)) {
            return false;
        }
        if (Estoque.getInstancia().verificarClienteComRestricao(cliente)) {
            return false;
        }
        if (Pagamento.getInstancia().verificarClienteComRestricao(cliente)) {
            return false;
        }
        return true;
    }
}
