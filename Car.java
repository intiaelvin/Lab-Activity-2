public class Car extends Vehicle {
    int numberofDoors;

    public Car(String brand, String model, int year, int numberofDoors) {
        super(brand, model, year);
        this.numberofDoors = numberofDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("numberofDoors: " + numberofDoors);
    }

    @Override
    public void moveForward() {
        System.out.println("A car moves forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("A car moves backward");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A car moves right");
    }
}

