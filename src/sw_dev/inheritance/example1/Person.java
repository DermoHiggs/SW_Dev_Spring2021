package sw_dev.inheritance.example1;

public class Person {
    private String firstName;
    private String surName;
    //Below is an example of Composition. This means that objects
    //can be composed of other objects (in fact, firstName and
    //lastName are also examples, but not quite as obvious, perhaps
    private SimpleDate dateOfBirth;

    public Person(String firstName, String surName, SimpleDate dateOfBirth) {
        this.firstName = firstName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public void someFunc()
    {
        System.out.println("Super Class output");
    }
}
