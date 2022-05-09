package Strategy;

public class Comport_Defensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente");
    }
}
