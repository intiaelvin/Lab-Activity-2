public class Motorcycle extends Vehicle implements Serviceable {
    private int engineCC;

    public Motorcycle(String brand, String model, int year, int engineCC) {
        super(brand, model, year);
        this.engineCC = engineCC;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Information:");
        super.displayInfo();
        System.out.println("Engine CC: " + engineCC);
    }

    @Override
    public void move() {
        System.out.println("Motorcycle is moving on the road.");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: Inspect tires and brakes.");
    }
}