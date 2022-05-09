package Strategy;

public class Strategy {
    public static void main(String[] args) {
        Comportamento defensivo = new Comport_Defensivo();
        Comportamento normal = new Comport_Normal();
        Comportamento agressivo = new Comport_Agressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
