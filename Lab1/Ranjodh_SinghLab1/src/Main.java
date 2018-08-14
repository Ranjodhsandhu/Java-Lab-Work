/**
 * This code was written as per the Lab 1 requirement
 * of the course Android development using Java - MA1S1 at
 * Cambrian at Hanson-North York Campus, Toronto, Ontario.
 * Written by Ranjodh Singh, HID: H00018073
 * Date 19-05-2018
 */

/**
 * Creating main class
 */
public class Main {

    /**
     * Main method with standard parameters
     * @param args
     */
    public static void main(String[] args) {

        // Initializing the Object of Employee class with default values of employee
        Employee emp = new Employee(5,1000.10,"Ranjodh");

        // Printing particulars of the employee
        System.out.println("Initialized Particulars of Employee\n");
        System.out.print("Employee id: "+emp.getId()+
                "\nName: "+emp.getString()+"\nSalary: "
                +emp.getSalary()+"\n");
    }
}
