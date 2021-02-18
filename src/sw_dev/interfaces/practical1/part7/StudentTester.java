package sw_dev.interfaces.practical1.part7;

public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("blah blah", 20, "Computing", 0);

        s1.doJob(new Job("Clean House", 4.0, 3.0));

        int packets = s1.howManyNoodles(2.50);
        System.out.println("Student can buy " + packets + "packets of noodles");
    }
}
