package car;

public class Car {
    String name;
    double power;
    double velocity;

    public Car(String name, double power, double velocity) {
        this.name = name;
        this.power = power;
        this.velocity = velocity;
    }



    public void show(){
        System.out.println("Auto " + name + " ma moc: " + power + " oraz aktualną prędkość: " + velocity);
    }
}
