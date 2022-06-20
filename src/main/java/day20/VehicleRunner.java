package day20;

public class VehicleRunner {
    public static void main(String[] args) {

        Vehicles vehicle1 = new Vehicles("Honda", "Civic",2021, 13000);
        Vehicles vehicle2 = new Vehicles("Audi", "RS",2022, 50000);
        Vehicles vehicle3 = new Vehicles("Mercedes", "RS",2022);
        Vehicles vehicle4 = new Vehicles("BMW", "M5", 15000.0);
        Vehicles vehicle5 = new Vehicles();

        System.out.println(vehicle1.model);// Civic

    }
}
