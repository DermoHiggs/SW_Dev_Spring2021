package sw_dev.inheritance.exercises.exercise1.solution1;

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

        //Part 1 SOLUTION - create and print a Yorkshire and a Labrador
        Labrador lab1 = new Labrador("Rex", "Black");
        System.out.println(lab1.getName() + " says " + lab1.speak());
        //Part2 - Solution print average breed weight. Note that since avgBreedWeight() is a static
        //method we access it as Class.method() rather than objectReference.method();
        System.out.println(lab1.getName() + " has an average breed weight of " + lab1.avgBreedWeight());

        Yorkshire york1 = new Yorkshire("Millie");
        System.out.println(york1.getName() + " says " + york1.speak());
        //Part 2 -
        // The problem is that the Yorkshire class does not have an avgBreedWeight method, and there is not one in Dog for it to inherit.
        // 2 obvious possibilities -
        // 1:
        // Just add the method to Yorkshire - slightly weird though if both the subclasses have it but not the superclass
        // 2:
        // Add it to the Dog class and have both subclasses override it - better from inheritance stand-point
        System.out.println(york1.getName() + " has an average breed weight of " + york1.avgBreedWeight());


    }
}
