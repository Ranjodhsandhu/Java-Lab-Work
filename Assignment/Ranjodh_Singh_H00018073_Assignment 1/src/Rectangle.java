/**
 * Program written for the requirement of Assignment 1 in mobile application development course
 * at Canada at Hanson for Cambrian college of Arts & Tech
 * Written by: Ranjodh Singh
 * Date:29-06-2018
 */

/**
 * Class Rectangle will calculate the perimeter of Rectangle and implements the Shape interface
 */
public class Rectangle implements Shape {

    // These fields will represent the length and breadth of the recangle
    private double length, breadth;

    /**
     * This constructor will initialize the sides of the Rectangle
     * @param lenVal of type double is the length of the rectangle
     * @param breVal of type double is the breadth of the rectangle
     */
    public Rectangle(double lenVal,double breVal) {
        length = lenVal;
        breadth = breVal;
    }

    /**
     * This overridden method will calculate the perimeter and return
     * @return of type double the result of perimeter
     */
    @Override
    public double getPerimeter(){
        double result;
        result = length * breadth;
        return result;
    }

    /**
     * Overriding the toString() method to print Rectangle perimeter
     * @return of type String is the perimeter in the format{Rectangle (length breadth: perimeter)}
     */
    @Override
    public String toString(){
        return "Rectangle("+length+","+breadth+"): " +getPerimeter();
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
