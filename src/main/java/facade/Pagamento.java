package facade;

public class Pagamento extends Atendimento {

    private static Pagamento finaceiro = new Pagamento();

    private Pagamento() {};

    public static Pagamento getInstancia() {
        return finaceiro;
    }
}
