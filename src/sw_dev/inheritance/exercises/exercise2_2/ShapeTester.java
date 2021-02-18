package sw_dev.inheritance.exercises.exercise2_2;

public class ShapeTester {
    public static void main(String[] args) {

        //Note: I've done very little testing here. I'd expect more, in reality.
        Square sq1 = new Square(5, "White", false);

        System.out.println(sq1);
        System.out.println("Area of square is " + sq1.getArea());
        System.out.println("Perimeter of square is " + sq1.getPerimeter());
    }
}
