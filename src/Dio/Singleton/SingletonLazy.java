package Dio.Singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    // construtor do singleton deve ser privado;

    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstancia() {
        if(instancia == null) {
            instancia = new SingletonLazy();       }

        return instancia;
    }


}
