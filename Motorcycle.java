public class Motorcycle extends Vehicle {
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
    public void moveForward() {
        System.out.println("A motorcycle moves forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("A motorcycle moves backward");
    }

    @Override
    public void moveLeft() {
        System.out.println("A motorcycle moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A motorcycle moves right");
    }
}
