package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Atendimento {

    private List<Cliente> clientesComRestricao = new ArrayList<Cliente>();

    public void addClienteComRestricao(Cliente cliente) {
        this.clientesComRestricao.add(cliente);
    }

    public boolean verificarClienteComRestricao(Cliente cliente) {
        return this.clientesComRestricao.contains(cliente);
    }

}

