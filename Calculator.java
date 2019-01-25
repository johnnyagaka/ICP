/**
 * This class models a basic calculator.
 * @author Avoka ayebilla
 * @author John Nyagaka
 *
 *
 * @version 1.0.0
 *
 */

public class Calculator {
    double numOne;
    double numTwo;

    /**
     * This is a default constructor that takes no parameters
     */
    public Calculator() {

    }

    /**
     * This is an overloaded constructor
     * @param num1
     * @param num2
     */

    public Calculator(double num1, double num2) {
        numOne = num1;
        numTwo = num2;
    }

    /**
     * This is a getter method for first number
     *
     * @param numOne
     * @return Returns the number the user gives as numOne
     */
    public double getNumOne(double numOne) {
        return numOne;
    }

    /**
     * This is a getter for second number
     *
     * @param numTwo
     * @return Returns the number the user gives as numTwo
     */
    public double getNumTwo(double numTwo) {
        return numTwo;
    }

    /**
     * This is a setter method to set the first number
     *
     * @param num1
     */
    public void setNumOne(double num1) {
        this.numOne = num1;
    }

    /**
     * This is a setter method to set the second number
     *
     * @param num2
     */
    public void setNumTwo(double num2) {
        this.numTwo = num2;
    }

    public double addNumbers(double numOne, double numTwo) {
        double sum = numOne + numTwo;
        return sum;
    }

    public double subtractNumbers(double numOne, double numTwo) {
        if (numOne >= numTwo) {
            double difference = numOne - numTwo;
            return difference;
        }
        else {
            double difference = numTwo - numOne;
            return difference;
        }

    }


    public double multiplyNumbers(double numOne, double numTwo) {
        double product = numOne * numTwo;
        return product;
    }

    public double devideNumbers(double numOne, double numTwo) {
        double quotient = numOne / numTwo;
        return quotient;
    }

    public double squareNumber(double numOne) {

        double results = numOne * numOne;
        return results;
    }

    public double rootOfNumber(double numTwo) {
        double root = Math.sqrt(numTwo);
        return root;

    }
    public static void main(String [] args){
        double num1 = 20;
        double num2 = 30;
        Calculator Calc = new Calculator();
        Calc.setNumOne(num1);
        Calc.setNumTwo(num2);

        double sum = Calc.addNumbers(num1,num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);


        double differencec = Calc.subtractNumbers(num1,num2);
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + differencec);

        double product = Calc.multiplyNumbers(num1,num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

        double quotient = Calc.devideNumbers(num1, num2);
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);

        double Squarednumber = Calc.squareNumber(num1);
        System.out.println("The square of "  + " is " + Squarednumber);

        double root = Calc.rootOfNumber(num2);
        System.out.println("The root of " + num2 + " is " + root);

    }
}
