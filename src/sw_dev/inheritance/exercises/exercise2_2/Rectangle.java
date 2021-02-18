package sw_dev.inheritance.exercises.exercise2_2;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle()
    {
        //super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea()
    {
        return width*length;
    }

    public double getPerimeter()
    {
        return (2*width) + (2*length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "} " + super.toString();
    }
}
