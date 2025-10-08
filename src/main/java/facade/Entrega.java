package facade;

public class Entrega extends Atendimento {

    private static Entrega entrega = new Entrega();

    private Entrega() {};

    public static Entrega getInstancia() {
        return entrega;
    }

}
