package sw_dev.encapsulation; // this is auto-generated. Yours will be different.

/**
 * A non-useful class that will allow us to play around with access-modifiers (public and private)
 *
 * Read through the class code before attempting the exercises below.
 * Try the following:
 *      1: Instantiate an instance of the class, i.e. an object, from another class (in the
 *          same package) that contains the main() method.
 *          Use system.out.println() to verify that the object has the correct values in it.
 *      2: In main() try to modify publicVar2 via the object that you created.
 *          Can you do it?
 *          print again to verify.
 *      3: In main() try to modify privateVar1 via the object that you created.
 *          Can you do it?
 *          What do you think you might do, if you need privateVar1 to remain private but you would
 *          like to be able to modify it from outside the class, e.g. from main().
 *      4:  Call the printTotal() method from main() and verify that it works as expected.
 *          What happens if you change its access specifier to private?
 *      5: Try to change the access modifier of the class from 'public' to 'private'
 *          What happens? Can you speculate on why this is happening?
 *
 */
public class SomeClass {
    //these variables are sometimes called "instance-fields" or "member variables"
    //every instance (object) of our class will have their own versions/copies of these
    private int privateVar1;
    public int publicVar2;

    // This is what's known as an overloaded constructor
    public SomeClass(int val1, int val2)
    {
        privateVar1 = val1;
        publicVar2 = val2;
    }

    //I can talk briefly in class about the toString() method and
    //the @Override directive
    @Override
    public String toString() {
        return "SomeClass{" +
                "privateVar1=" + privateVar1 +
                ", publicVar2=" + publicVar2 +
                '}';
    }

    public void printTotal()
    {
        System.out.println("Var total is " + privateVar1 + publicVar2);
    }
    /*@Override
    public String toString()
    {
        return "blah";
    }*/
}
