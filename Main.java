public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("Toyota", "Vios", 2022, 4),
            new Motorcycle("Yamaha", "Mio", 2022, 125),
            new Truck("Isuzu", "N-Series", 2020, 5.0)
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println("\nVehicle Movement:");

            vehicle.moveForward();
            vehicle.moveBackward();
            vehicle.moveLeft();
            vehicle.moveRight();
        }
    }
}

