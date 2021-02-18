package sw_dev.inheritance.exercises.exercise1.solution2;

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
    //This Solution removes the static property
    //I made it a constant (using final) and the convention is
    //for those types of variables to be uppercased
    private final int BREED_WEIGHT;

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
        BREED_WEIGHT = 75;
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
    @Override
    public int avgBreedWeight()
    {
        return BREED_WEIGHT;
    }
}