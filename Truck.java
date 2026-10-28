public class Truck extends Vehicle {
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
    public void moveForward() {
        System.out.println("A truck moves forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("A truck moves backward");
    }

    @Override
    public void moveLeft() {
        System.out.println("A truck moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A truck moves right");
    }
}
