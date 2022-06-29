package day24;
/*
 To make interfaces parent of a concrete class use implements keyword
 */
public class Civic implements IHondaAc,IHondaEngine,IHondaSecurity{
    @Override
    public void cool() {
            System.out.println("Civic uses eco AC");
    }

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }
}
