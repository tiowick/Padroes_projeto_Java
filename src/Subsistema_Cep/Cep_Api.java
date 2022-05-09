package Subsistema_Cep;

public class Cep_Api {

    private static Cep_Api instancia = new Cep_Api();

    private Cep_Api() {
        super();
    }

    public static Cep_Api getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Salvador";
    }

    public String recuperarEstado(String cep) {
        return "BA";
    }
}
