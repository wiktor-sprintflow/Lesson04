package car;

public class CarController {
    public void turbo(Car car) {
        car.power *= 1.1;
    }

    public void increaseSpeed(double speed, Car car) {
        car.velocity += speed;
    }

    public void decreaseSpeed(double speed, Car car){
        car.velocity -= speed;
        if (car.velocity < 0) {
            car.velocity = 0;
        }
    }
}
