public class Car extends Vehicle implements Serviceable {
    int numberofDoors;

    public Car(String brand, String model, int year, int numberofDoors) {
        super(brand, model, year);
        this.numberofDoors = numberofDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberofDoors);
    }

    @Override
    public void move() {
        System.out.println("Car is moving on the road.");
    }

    @Override
    public void service() {
        System.out.println("Car: Check oil and brakes.");
    }
}