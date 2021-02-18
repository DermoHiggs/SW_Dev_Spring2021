package sw_dev.inheritance.exercises.exercise4;

import java.util.ArrayList;

public class Exercise4Tester3 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Jim Jones",25));
        people.add(new Student("Tina Smith", 20, "Arts"));
        people.add(new Student("Paul Simon", 43, "Computing"));

        String s1 = "abs";
        String s2  = "def";

        s1.compareTo(s2);
    }
}
