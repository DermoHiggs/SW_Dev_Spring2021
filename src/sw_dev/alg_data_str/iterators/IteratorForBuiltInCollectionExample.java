package sw_dev.alg_data_str.iterators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorForBuiltInCollectionExample {
    public static void main(String[] args) {

        String[] strArray = {"this", "is", "just", "some", "strings"};
        //Note - we can use other collections to initialise a new one OR
        //we can even do it like this
        List<String> someList = new LinkedList<String>(Arrays.asList(strArray));

        //Example of for each loop
        for(String currElement: someList)
        {
            System.out.print(currElement + " ");
        }
        System.out.println();

        //this is what a for each loop is translated into (internally)
        for(Iterator<String> iterator = someList.iterator(); iterator.hasNext(); )
        {
            String currElement = iterator.next();

            System.out.print(currElement + " ");
        }
        System.out.println();

        //And here is an example of normal usage of iterators to traverse a collection
        Iterator<String> iterator = someList.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

}
