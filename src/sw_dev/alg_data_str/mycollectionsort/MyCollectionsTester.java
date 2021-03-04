package sw_dev.alg_data_str.mycollectionsort;

import java.util.ArrayList;

public class MyCollectionsTester {
    public static void main(String[] args) {
        ArrayList<Person> myList = new ArrayList<Person>();

        myList.add(new Person(20, "Hegarty", "Dermot"));
        myList.add(new Person(23,"Minchin", "Tim"));
        myList.add(new Person(19, "DiCamillo", "Kate"));
        myList.add(new Person(28, "Hardinge", "Frances"));

        printList("Original List:", myList);

        //This method uses compareTo() to do its job
        MyCollections.sort(myList);

        printList("\nSorted List based on natural ordering (age):", myList);

        //Let's sort based on first name
        MyComparator helperObject  = new PersonFirstNameComparator();
        MyCollections.sort(myList, helperObject);

        printList("\nSorted List based on Comparator (first name):", myList);

    }

    public static void printList(String message, ArrayList<Person> listToPrint)
    {
        System.out.println(message);
        for (Person currPerson: listToPrint)
        {
            System.out.println(currPerson.toString());
        }
    }
}
