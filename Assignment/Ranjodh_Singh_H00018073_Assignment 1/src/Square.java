/**
 * Program written for the requirement of Assignment 1 in mobile application development course
 * at Canada at Hanson for Cambrian college of Arts & Tech
 * Written by: Ranjodh Singh
 * Date:29-06-2018
 */

/**
 * Class Square will calculate the perimeter of Square and implements the Shape interface
 */
public class Square implements Shape {

    // Side of the square
    private double side;

    /**
     * This constructor will initialize the value of the side of square
     * @param sideVal of type double
     */
    public Square(double sideVal) {
        side = sideVal;
    }

    /**
     * This method will calculate the perimeter and return
     * @return of type double the result of perimeter
     */
    @Override
    public double getPerimeter(){
        double result;
        result = side * side;
        return result;
    }

    /**
     * Overriding the toString() method to print square perimeter
     * @return of type String is the perimeter in the format{Square (sides: perimeter)}
     */
    @Override
    public String toString(){
        return "Square("+side+"): " +getPerimeter();
    }

    /**
     * Overridden hashcode method will return the hashcode value of data
     * @return of type int
     */
    @Override
    public int hashCode(){
        return hashCode();
    }
}
