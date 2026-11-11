public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        System.out.println();

        Vehicle[] vehicles = {
            new Car("Toyota", "Vios", 2022, 4),
            new Motorcycle("Yamaha", "Mio", 2023, 125),
            new Truck("Isuzu", "N-Series", 2020, 5.0)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();
            System.out.println();
        }

        System.out.println();

        Serviceable[] serviceItems = {
            new Car("Toyota", "Vios", 2022, 4),
            new Motorcycle("Yamaha", "Mio", 2023, 125),
            new Truck("Isuzu", "N-Series", 2020, 5.0),
            new Printer()
        };

        for (Serviceable item : serviceItems) {
            performService(item);
        }
    }
}