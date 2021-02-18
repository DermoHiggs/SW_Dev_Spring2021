package sw_dev.inheritance.exercises.exercise1.solution1;

// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever. Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************
public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    //Part 1 SOLUTION
    //Making breedWeight static gets rid of the error.
    //This is not the only solution to get around the compiler error
    private static int breedWeight = 75;

    //ERROR!
    //You'll notice that this constructor is causing a compiler error
    //What do you think the problem could be?
    public Labrador(String name, String color)
    {
        //Part 1 SOLUTION
        //Need to chain the constructor to the superclass constructor
        //NOTE: If the superclass had a default constructor then this
        //would not be strictly necessary.
        super(name);

        this.color = color;
    }
    // ------------------------------------------------------------
    // Big bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak()
    {
        return "WOOF";
    }
    // ------------------------------------------------------------
    // Returns weight
    // ------------------------------------------------------------
    public int avgBreedWeight()
    {
        return breedWeight;
    }
}