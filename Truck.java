public class Truck extends Vehicle implements Serviceable {
    private double loadCapacity;

    public Truck(String brand, String model, int year, double loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Information:");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }

    @Override
    public void move() {
        System.out.println("Truck is moving on the road.");
    }

    @Override
    public void service() {
        System.out.println("Truck: Inspect cargo and brakes.");
    }
}