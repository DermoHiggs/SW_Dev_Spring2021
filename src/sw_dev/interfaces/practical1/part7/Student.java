package sw_dev.interfaces.practical1.part7;

import sw_dev.interfaces.practical1.Person;

public class Student extends Person implements PartTimeAble{

    private String course;
    private double spendingMoney;

    public Student(String name, int age, String course, double spendingMoney)
    {
        super(name, age);
        this.course = course;
        this.spendingMoney = spendingMoney;
    }

    @Override
    public void doJob(Job j) {
        spendingMoney += j.getPrice();
    }

    public int howManyNoodles(double pricePerPacket)
    {
        return (int) (spendingMoney/pricePerPacket);
    }
}
