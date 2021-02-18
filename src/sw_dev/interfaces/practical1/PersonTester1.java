package sw_dev.interfaces.practical1;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTester1 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Jim Jones", 23));
        people.add(new Person("Adam Ant", 48));
        people.add(new Person("Lana DelRay", 34));
        people.add(new Person("John Doe", 14));

        //For this part to work you need to override equals() in your Person class
        //Try it without to verify
        if (people.contains(new Person("Adam Ant", 48)))
        {
            System.out.println("Match found");
        }
        else
        {
            System.out.println("Match not found");
        }

        Collections.sort(people);
        System.out.println("Sorted List:\n" + people);

        Collections.sort(people, new PersonAgeComparator());
        System.out.println("Sorted List:\n" + people);

    }
}
