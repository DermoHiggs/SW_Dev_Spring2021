package sw_dev.encapsulation;

public class Main {

    public static void main(String[] args) {
        SomeClass someObject = new SomeClass(2,4);

        someObject.publicVar2 = 6;

        System.out.println(someObject);


    }
}
