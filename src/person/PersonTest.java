package person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 25, "Wrocław");

        System.out.println(person1.firstName + " " + person1.age);
        person1.increaseAge();

        System.out.println(person1.firstName + " " + person1.age);
    }
}
