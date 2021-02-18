package sw_dev.inheritance.exercises.exercise4;

import java.util.ArrayList;

public class Exercise4Tester2 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Jim Jones",25));
        people.add(new Student("Tina Smith", 20, "Arts"));
        people.add(new Instructor("Tim Sturges", 43, 35230));

        for(Person currPerson:people)
        {
            System.out.println(currPerson.toString());
        }
    }
}

