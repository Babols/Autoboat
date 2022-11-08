import java.util.ArrayList;

public class Hangar {
    public static void main(String[] args) {
        Car ferrari = new Car("une ferrari");
        System.out.println(ferrari.doStuff());
        Boat paquebot = new Boat("un paquebot");
        System.out.println(paquebot.doStuff());

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(ferrari);
        vehicles.add(paquebot);
        System.out.println("Vehicles in the list: ");

        for (Vehicle vehicle : vehicles) {
            System.out.println("- " + vehicle.getBrand());
        }
    }
}
