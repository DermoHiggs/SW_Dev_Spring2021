package sw_dev.inheritance.example1;

//Student (the child class or subclass) INHERITS from
//Person (the parent class or superclass) using the keyword extends
public class Student extends Person { //Student IS-A Person
    private int studentId;

    public Student(String firstName, String surName, SimpleDate dateOfBirth, int studentId) {
        super(firstName, surName, dateOfBirth);
        //super();
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "studentId=" + studentId +
                '}';
    }

    public void someFunc()
    {
        System.out.println("Sub Class output");
    }

    public void temp()
    {
        someFunc();
    }
}
