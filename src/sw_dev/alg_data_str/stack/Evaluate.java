package sw_dev.alg_data_str.stack;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> operators  = new Stack<String>();
        Stack<Double> operands = new Stack<Double>();

        Scanner sc = new Scanner(System.in);

        // Read in the expression from the keyboard
        //Note: it's fine to assume that all parts of
        //the expression are seperated by spaces.
        //e.g. ( ( 12 * 5 ) / 6 )
        String expression =  sc.nextLine();

        //Split the expression into its constituent parts
        //using <space> as a delimiter
        String[] parts = expression.split(" ");

        //Now we're in a position to evaluate the
        //expression from left-to-right

        for(String currPart:parts) {
            switch (currPart) {
                case ("("):
                    break;
                case ("+"):
                case ("-"):
                case ("*"):
                case ("/"):
                    operators.push(currPart);
                    break;
                case (")"):
                    double rightOperand = operands.pop();
                    double leftOperand = operands.pop();
                    double result = 0;
                    String operator = operators.pop();
                    switch (operator) {
                        case ("+") -> result = leftOperand + rightOperand;
                        case ("-") -> result = leftOperand - rightOperand;
                        case ("*") -> result = leftOperand * rightOperand;
                        case ("/") -> result = leftOperand / rightOperand;
                    }
                    operands.push(result);
                    break;
                default:
                    operands.push(Double.parseDouble(currPart));
                    break;

            }
        }
        System.out.println(operands.pop());
    }
}