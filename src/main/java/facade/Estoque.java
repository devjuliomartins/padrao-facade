package facade;

public class Estoque extends Atendimento {

    private static Estoque estoque = new Estoque();

    private Estoque() {};

    public static Estoque getInstancia() {
        return estoque;
    }
}
