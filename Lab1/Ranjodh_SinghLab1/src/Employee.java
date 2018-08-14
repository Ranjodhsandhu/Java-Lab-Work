/**Code in hand was written as per the Lab 1 requirement
 * of the course Android development using Java - MA1S1 at
 * Cambrian at Hanson-North York Campus, Toronto, Ontario.
 * Written by Ranjodh Singh, HID:
 * Date 19-05-2018
 */

/**
 * Creating a public class named Employee.
 * <p>
 * This class encapsulates employee id, salary
 * and name with getters and setters methods.
 * </p>
 * <p>
 * The parameterized constructor initializes the
 * variables.
 * </p>
 */
public class Employee {

    /**
     * Declaring particulars for an employee
     */

    // This variable represents employee id
    private int id;

    // This variable represents employee salary
    private double salary;

    // This variable represents employee name
    private String name;


    /**
     * Creating a constructor with parameters.
     * This constructor initializes the employee particulars
     * @param a:resembles employee id
     * @param b:resembles employee salary
     * @param c:resembles employee name
     */
    public Employee(int a, double b, String c)
    {
        id = a;
        salary = b;
        name = c;
    }

    /**
     * Following method returns value of Employee id
     * @return : return type is integer
     */
    int getId(){
        return id; // returns 0 if not initialized
    }

    /**
     * Following method with parameter sets value of Employee id
     * @param a of type integer and resembles employee id
     */
    void setId(int a){
        id = a;
    }

    /**
     * Following method returns value of Employee salary
     * @return : return type is double
     */
    double getSalary(){
        return salary; // returns 0.0 if not initialized
    }

    /**
     * Following method with parameter sets value of Employee "salary"
     * @param b of type double and resembles employee salary
     */
    void setSalary(double b){
        salary = b;
    }

    /**
     * Following method returns value of employee "name"
     * @return : return type is String
     */
    String getString() {
        return name; // returns null if not initialized
    }

    /**
     * Following method with parameter sets value of Employee "name"
     * @param c of type String and resembles employee name
     */
    void setString(String c){
        name = c;
    }
}
