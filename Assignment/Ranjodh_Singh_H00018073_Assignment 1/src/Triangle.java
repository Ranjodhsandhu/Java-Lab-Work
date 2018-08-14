/**
 * Program written for the requirement of Assignment 1 in mobile application development course
 * at Canada at Hanson for Cambrian college of Arts & Tech
 * Written by: Ranjodh Singh
 * Date:29-06-2018
 */

/**
 * Class triangle will calculate the perimeter of triangle and implements the Shape interface
 */
public class Triangle implements Shape {

    // Fields describing the sides of the triangle
    private double side1,side2,side3;

    /**
     * This constructor will initialize the values to the side of the triangle
     * @param side1Val of type double is the first side of triangle
     * @param side2Val of type double is the second side of triangle
     * @param side3Val of type double is the third side of triangle
     */
    public Triangle(double side1Val,double side2Val,double side3Val){
        side1 = side1Val;
        side2 = side2Val;
        side3 = side3Val;
    }

    /**
     * Overridden method of interface Shape will calculate and return the perimeter of triangle
     * @return type double will return perimeter of triangle
     */
    @Override
    public double getPerimeter(){
        double result;
        result = side1 * side2 * side3;
        return result;
    }

    /**
     * Overriding the toString() method to return triangle perimeter
     * @return of type String is the perimeter in the format{Triangle (three sides: perimeter)}
     */
    @Override
    public String toString(){
        return "Triangle("+side1+","+side2+","+side3+"): " +getPerimeter();
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