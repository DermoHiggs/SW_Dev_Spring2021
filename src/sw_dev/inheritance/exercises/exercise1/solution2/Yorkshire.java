package sw_dev.inheritance.exercises.exercise1.solution2;

// *****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// *****************************************************************
public class Yorkshire extends Dog
{
    //See Labrador class for explanation
    private final int BREED_WEIGHT;
    public Yorkshire(String name)
    {
        super(name);
        BREED_WEIGHT = 40;
    }
    // -------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // -------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }


    @Override
    public int avgBreedWeight()
    {
        return BREED_WEIGHT;
    }
}
