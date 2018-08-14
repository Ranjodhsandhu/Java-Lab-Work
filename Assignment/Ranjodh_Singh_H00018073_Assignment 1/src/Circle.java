/**
 * Program written for the requirement of Assignment 1 in mobile application development course
 * at Canada at Hanson for Cambrian college of Arts & Tech
 * Written by: Ranjodh Singh
 * Date:29-06-2018
 */
import java.text.DecimalFormat;
/**
 * Class Circle will calculate the perimeter of Circle and implements the Shape interface
 */
public class Circle implements Shape {

    // Field will represent the radius of the circle
    private double radius;

    /**
     * This constructor will initialize the radius variable of the circle
     * @param value
     */
    public Circle(double value){
        radius = value;
    }

    /**
     * This overridden method will calculate the perimeter and return
     * @return of type double the result of perimeter
     */
    @Override
    public double getPerimeter(){
        double result;
        result = 2 * 3.14 * radius;
        return result;
    }
    /**
     * Overriding the toString() method to print Circle perimeter
     * @return of type String is the perimeter in the format{Circle (radius: perimeter)}
     */
    @Override
    public String toString(){
        DecimalFormat numberFormat = new DecimalFormat("#.######");
        return "Circle("+radius+"): " +numberFormat.format(getPerimeter());
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
