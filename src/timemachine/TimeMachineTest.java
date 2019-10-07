package timemachine;

public class TimeMachineTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan","Nowak",25);
        TimeMachine timeMachine = new TimeMachine();

        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.age);
        timeMachine.timeTravel(person1,10);
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.age);
        timeMachine.backInTime(person1);
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.age);
        timeMachine.timeTravel(person1,-50);
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.age);
    }
}
