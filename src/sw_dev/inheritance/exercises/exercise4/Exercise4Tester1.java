package sw_dev.inheritance.exercises.exercise4;

public class Exercise4Tester1 {
    public static void main(String[] args) {
        Person p1 = new Person("Mike Smith", 24);

        Student s1 = new Student("Mary Jones", 19, "Applied Computing");

        Instructor i1 = new Instructor("John Jacobs", 55, 41500.70);

        //Print out each object's details via toString()
        System.out.println("Person details : " + p1.toString());
        System.out.println("Student details : " + s1.toString());
        System.out.println("Instructor details : " + i1.toString());

        //Print out just the student's name, for example
        System.out.println("Student's name is : " + s1.getName());

        //Print out just the instructor's salary, for example
        System.out.println("Instructor Salary is : " + i1.getSalary());

    }
}
