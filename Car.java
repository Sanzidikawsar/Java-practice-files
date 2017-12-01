public class Car extends Machine {
    public void move() {
        System.out.println("Car is moving..");
    }

    @Override
    public void start() {
        System.out.println("Car is started!");
    }
}