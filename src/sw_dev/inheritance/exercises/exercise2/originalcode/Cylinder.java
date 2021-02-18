package sw_dev.inheritance.exercises.exercise2.originalcode;

//import com.sw_dev.roughwork.exercise2.Circle;

//import com.sw_dev.inheritance.exercises.exercise2.solution.Circle;

public class Cylinder extends Circle {
   private double height;  // private variable
   
   // Constructor with default color, radius and height
   public Cylinder() {
      //super();        // call superclass no-arg constructor Circle()
      //height = 1.0;

      this(1.0);
      //System.out.println(" Default Cylinder Constructor");
   }
   // Constructor with default radius, color but given height
   public Cylinder(double height) {
      super();        // call superclass no-arg constructor Circle()
      this.height = height;
      //System.out.println(" Cylinder Constructor with height");
   }
   // Constructor with default color, but given radius, height
   public Cylinder(double radius, double height) {
      super(radius);  // call superclass constructor Circle(r)
      this.height = height;
      //System.out.println(" Cylinder Constructor with height and radius");
   }
   
   // A public method for retrieving the height
   public double getHeight() {
      return height; 
   }


   public double getVolume() {
      return getArea()*height;
   }


   @Override
   public String toString() { // in Cylinder class
      return "Cylinder: subclass of " + super.toString() // use Circle's toString()
              + " height=" + height;
   }
}
