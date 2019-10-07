package car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 150, 100);
        CarController carController = new CarController();
        car1.show();
        carController.increaseSpeed(10,car1);
        carController.turbo(car1);
        car1.show();
        carController.decreaseSpeed(120,car1);
        car1.show();
    }
}
