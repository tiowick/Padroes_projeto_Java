package Strategy;

public class Robo {

    private Comportamento strategy;       // estratégia de comportamento do Robô

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }
    public void mover () {
        strategy.mover(); // atribuindo o comportamento do Robô
    }
}

