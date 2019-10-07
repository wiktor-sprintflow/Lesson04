package timemachine;

public class TimeMachine {
    void backInTime(Person person) {
        timeTravel(person, -1);
    }

    void timeTravel(Person person, int years) {
        person.age = person.age + years;
        if (person.age < 0) {
            person.age = 0;
        }
    }
}
