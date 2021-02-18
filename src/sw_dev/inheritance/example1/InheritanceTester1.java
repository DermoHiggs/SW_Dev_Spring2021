package sw_dev.inheritance.example1;

public class InheritanceTester1 {
    public static void main(String[] args)
    {
        Person p1 = new Person("Dermot", "Hegarty", new SimpleDate(22,2,1990));
        System.out.println(p1);

        //In this example I create an explicit object reference to a SimpleDate object - compare with p1's creation
        SimpleDate jimDob = new SimpleDate(14,2, 1999);
        Student s1 = new Student("Jim", "Jones", jimDob, 9452);
        System.out.println(s1);

        s1.someFunc();
    }
}
