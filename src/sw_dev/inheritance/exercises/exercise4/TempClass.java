package sw_dev.inheritance.exercises.exercise4;

import java.util.ArrayList;

//Basic illustration of iterating with for-each and tradtional for loops
public class TempClass {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("bac");
        myList.add("def");
        myList.add("ghi");

        for(String elem : myList)
        {
            System.out.println(elem);
        }

        for(int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }
    }
}
