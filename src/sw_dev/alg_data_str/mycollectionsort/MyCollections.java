package sw_dev.alg_data_str.mycollectionsort;

import java.util.ArrayList;

public class MyCollections {

    /**
     * Sort based on natural ordering (as defined by class's compareTo method
     * @param listToSort
     */
    public static void sort(ArrayList<Person> listToSort)
    {
        for (int i = 0; i < listToSort.size(); i++) //number of passes
        {
            //keeps track of positions per pass
            for (int j = 0; j < (listToSort.size() - 1 - i); j++)
            {
                //if left value is great than right value
                if (listToSort.get(j).compareTo(listToSort.get(j+1)) > 0)
                {
                    //swap values
                    Person temp = listToSort.get(j);
                    listToSort.set(j,listToSort.get(j+1));
                    listToSort.set(j+1, temp);
                }
            }
        }
    }

    /**
     * Overloaded sort which relies on compare() - as defined by comparator - to do its job
     * @param listToSort
     * @param comparator
     */
    public static void sort(ArrayList<Person> listToSort, MyComparator comparator)
    {
        for (int i = 0; i < listToSort.size(); i++) //number of passes
        {
            //keeps track of positions per pass
            for (int j = 0; j < (listToSort.size() - 1 - i); j++)
            {
                //if left value is great than right value
                if(comparator.compare(listToSort.get(j), listToSort.get(j+1)) > 0)
                {
                    //swap values
                    Person temp = listToSort.get(j);
                    listToSort.set(j,listToSort.get(j+1));
                    listToSort.set(j+1, temp);
                }
            }
        }
    }

}
