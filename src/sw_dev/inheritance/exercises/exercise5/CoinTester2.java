package sw_dev.inheritance.exercises.exercise5;

import java.util.ArrayList;

public class CoinTester2 {
    public static void main(String[] args) {
        ArrayList<Coin> coins = new ArrayList<Coin>();


        coins.add(new Coin(10, "Ten Cent"));
        coins.add(new Coin(20, "Twenty Cent"));
        coins.add(new Coin(10, "Ten Cent"));
        coins.add(new Coin(50, "Fifty Cent"));



        /* contains() depends on our class overriding equals()*/
        if(coins.contains(new Coin(10, "Ten Cent")))
        {
            System.out.println("found a matching coin");
        }
        else
        {
            System.out.println("didn't find a matching coin");

        }

        //If you need to, play around with some of the ArrayList methods
        //I have a few done below:

        //We can remove by index or by object
        coins.remove(coins.indexOf(new Coin(20, "Twenty Cent")));

        Coin coinToRemove = new Coin(50, "Fifty Cent");
        coins.remove(coinToRemove);

        //Try some other methods if you need the revision, e.g.
        //add(index, element), set, get, etc.


        System.out.println(coins);
    }
}
