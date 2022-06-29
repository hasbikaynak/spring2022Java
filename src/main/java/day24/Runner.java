package day24;

public class Runner {
    public static void main(String[] args) {
        System.out.println(IHondaAc.price); // 890.00
        System.out.println(IHondaEngine.price); // 2890.00
        System.out.println(IHondaSecurity.price); // 90.00

        System.out.println(IHondaAc.make);
        System.out.println(IHondaEngine.isOld);
        System.out.println(IHondaSecurity.c);

        //when you create a method with body by using static keyword, you can access to it by using just the interface name.
        IHondaAc.climateCool();

        //when you create a method with body by using default keyword, you can access to it by using object.
        Civic civic = new Civic();
        civic.bacteriaKiller();
    }
}
