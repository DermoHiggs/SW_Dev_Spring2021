package sw_dev.inheritance.exercises.exercise1.originalcode;

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Spike");

        //Note: our classes do not have toString() methods. Don't add
        //any for these exercises
        System.out.println(dog.getName() + " says " + dog.speak());
    }
}
