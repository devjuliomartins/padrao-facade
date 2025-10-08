package facade;

public class Cliente {

    public boolean comprar() {
        return ClienteFacade.verificarCompra(this);
    }
}
