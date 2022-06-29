package day24;

public class Accord implements IHondaSecurity,IHondaEngine,IHondaAc{
    @Override
    public void cool() {
        System.out.println("Accord uses digital AC");
    }

    @Override
    public void run() {
        System.out.println("Accord runs well");
    }
}
