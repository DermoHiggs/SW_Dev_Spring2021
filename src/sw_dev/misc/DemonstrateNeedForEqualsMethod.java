package sw_dev.misc;

/**
 * I spoke about this in lecture 2
 * The basic idea is that == should not be used if you want to compare two objects for equality
 * Why not?
 * Because it is comparing the object references (addresses) for equality, which effectively means that you're
 * seeing are two references (s1 and s2 in the example) pointing at the same object.
 *
 * Normally, though, you're more concerned with the idea of checking whether two objects are equivalent.
 * To do this we should use the equals() method.
 *
 * Check out the Jpeg file Using==ToTestForEquality
 */
public class DemonstrateNeedForEqualsMethod {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        int x = 10;
        int y = 10;
        if(x == y)
        {
            System.out.println("X and Y are equal");
        }
        //This info is almost equivalent to printing the addresses of the objects (it's not quite the
        //same, but it gives us some visibility into storage, i.e. if both are the same then they are pointing
        //at the same object.
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1 + " " + s2);

        if(s1.equals(s2)) //should be s1.equals(s2)... try it and observe the difference
        {
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
