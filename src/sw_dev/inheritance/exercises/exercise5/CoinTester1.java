package sw_dev.inheritance.exercises.exercise5;

public class CoinTester1 {
    public static void main(String[] args) {
        Coin c1 = new Coin(10, "Ten Cent");
        Coin c2 = new Coin(10, "Ten Cent");
        Coin c3 = new Coin(50, "Fifty Cent");
        //c2=c1;

        System.out.println("c1: " + c1.hashCode());
        System.out.println("c2: " + c2.hashCode());

        String s1 = "abc";
        if(c1.equals(c2))
        {

            System.out.println("c1 and c2 are equal");
        }
        else
        {
            System.out.println("c1 and c2 are not equal");
        }

        if(c3.equals(c2))
        {
            System.out.println("c3 and c2 are equal");
        }
        else
        {
            System.out.println("c3 and c2 are not equal");
        }
    }
}
