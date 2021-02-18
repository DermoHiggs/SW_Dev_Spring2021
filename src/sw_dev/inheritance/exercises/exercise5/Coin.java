package sw_dev.inheritance.exercises.exercise5;

import java.util.Objects;

//Used to illustrate the use of the overridden equals method
public class Coin {
    private double value;
    private String name;

    public Coin(double v, String n) {
        value = v;
        name = n;
    }

    //When we override, we must maintain the same signature as Object superclass
    //The argument is of type Object BUT it CAN BE ANY SUBCLASS ALSO!!!!
    @Override
    public boolean equals(Object otherObject) {
        //Even though we assume that the argument is of type Coin, we must cast
        //the object so that we can use it
        Coin other;
        //other = (Coin) otherObject; //could do it like this
        //The code below is actually safer to cast than above - why?
        //Because in theory, the argument could be any object reference (String,
        //BankAccount, etc.)
        if (otherObject instanceof Coin) {
            other = (Coin) otherObject;
        }
        else {
            return false; // the two objects cannot be equal
        }

        if ((this.value == other.value) && //Note == for primitives
                (this.name.equals(other.name))) {
            return true;
        }
        else {
            return false;
        }
    }


//    @Override
//    public boolean equals(Object other)
//    {
//        return true;
//    }

    public boolean equals(Coin other)
    {
        return true;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Value: " + value + "]";
    }
}

