package Strategy;

public class Comport_Agressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
