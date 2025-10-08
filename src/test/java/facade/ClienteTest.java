package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarRestricaoEstoqueCompra() {
        Cliente cliente = new Cliente();
        Estoque.getInstancia().addClienteComRestricao(cliente);

        assertEquals(false, cliente.comprar());
    }

    @Test
    void deveRetornarRestricaoEntregaCompra() {
        Cliente cliente = new Cliente();
        Entrega.getInstancia().addClienteComRestricao(cliente);

        assertEquals(false, cliente.comprar());
    }

    @Test
    void deveRetornarRestricaoPagamentoCompra() {
        Cliente cliente = new Cliente();
        Pagamento.getInstancia().addClienteComRestricao(cliente);

        assertEquals(false, cliente.comprar());
    }

    @Test
    void devePermitirCompraSemRestricoes() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.comprar());
    }

}