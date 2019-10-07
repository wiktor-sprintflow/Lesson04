package person;

public class Person {
    String firstName;
    String lastName;
    int age;
    String city;

    public Person(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public void increaseAge(){
        this.age++;
    }
}
