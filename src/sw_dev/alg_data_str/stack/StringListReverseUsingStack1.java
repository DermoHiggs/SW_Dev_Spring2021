package sw_dev.alg_data_str.stack;

import java.util.ArrayList;
import java.util.Stack;

public class StringListReverseUsingStack1 {
    public static void main(String[] args) {

        ArrayList<String> someList = new ArrayList<String>();
        someList.add("This ");
        someList.add("is ");
        someList.add("a ");
        someList.add("sentence");
        System.out.println(someList);

        Stack<String> myStack = new Stack();
        //Use the list's remove() method to continually remove the first element of the list and
        //put it on the stack.
        while(!someList.isEmpty())
            myStack.push(someList.remove(0));

        System.out.println("The list now contains: " + someList);
        //Once you've done that, iterate again and build up
        // the list (using add(elementToAdd)) by removing
        //elements from the Stack, one at a time.
        while(!myStack.isEmpty())
        {
            someList.add(myStack.pop());
        }

        //Now, the list should be reversed. Print it out to verify
        System.out.println("The list now contains: " + someList);

    }
}
