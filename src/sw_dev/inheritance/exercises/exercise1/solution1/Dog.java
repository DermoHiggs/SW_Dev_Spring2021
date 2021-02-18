package sw_dev.inheritance.exercises.exercise1.solution1;

// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//
// ****************************************************************
public class Dog {
    protected String name;

    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name) {
        this.name = name;
    }

    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName() {
        return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String speak() {
        return "Woof";
    }

    //Part 2 - Solution
    //Since both subclasses have a need for averageBreedWeight
    //we provide a mechanism for overriding
    public int avgBreedWeight()
    {
        return 0;
    }
}
