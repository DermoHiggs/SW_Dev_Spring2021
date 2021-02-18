package sw_dev.inheritance.exercises.exercise4;

public class Instructor extends Person{
    private double salary;

    public Instructor(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
