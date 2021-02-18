package sw_dev.inheritance.exercises.exercise2.solution;

public class Circle {           // save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // 1st constructor, which sets both radius and color to default
    public Circle() {
        //This is a preferred mechanism if we already have a constructor that
        //it is another form of constructor chaining - We also saw a similar
        //idea in inheritance constructors through use of super()

        this(1.0, "red");

        //System.out.println("Default Circle Constructor");
        //radius = 1.0;
        //color = "red";
    }

    // 2nd constructor with given radius, but color default
    public Circle(double r) {
        //This is a preferred mechanism if we already have a constructor that
        //it is another form of constructor chaining - We also saw a similar
        //idea in inheritance constructors through use of super()

        this(r, "red");

        //System.out.println(" Circle Constructor with radius");
    }


    //Exercise solution: Modify the class Circle to include a third constructor for constructing a
    //Circle instance with the given radius and color.
    public Circle(double r, String c)
    {
        radius = r;
        color = c;

        //System.out.println(" Circle Constructor with radius and color");
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String toString()
    {
        return "Circle: radius=" + radius + " color=" + color;
    }
}

