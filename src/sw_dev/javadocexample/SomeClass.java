package sw_dev.javadocexample;

/**
 * This class does great things which I can't begin to describe
 *
 * @author dermot.hegarty
 * @version 1.0
 */
public class SomeClass {

    /**
     * the key to everything
     */
    private int x;

    /**
     * Prints out the value passed in
     *
     * @param val the thingy that you want to print out
     */
    public void doSomething(int val)
    {
        System.out.println(val);
    }



    /**
     * Returns something
     *
     * @param mul the value to multiply x by
     * @return the meaning of life (should be '42')
     */
    public int returnSomething(int mul)
    {
        return x*mul;
    }

}
