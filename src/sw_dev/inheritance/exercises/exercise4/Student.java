package sw_dev.inheritance.exercises.exercise4;

public class Student extends Person{
    private String degree;

    public Student(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "Student{" +
                "degree='" + degree + '\'' +
                "} " + super.toString();
    }

}
