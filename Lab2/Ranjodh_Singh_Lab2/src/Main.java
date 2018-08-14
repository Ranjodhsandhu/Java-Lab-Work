/**
 * This program is written for the fulfillment of Lab2
 * of Android development using Java-MA1S1.
 * Written by: Ranjodh singh
 * Date: 27-05-2018
 */

// This class was imported to use hire date field of employee details.
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // Initializing employee object
        Employee emp;
        emp = new Employee("Ranjodh", "Singh",
                "Information Technology",
                new Date(System.currentTimeMillis()));

        // Use of employee class in changing department
        // and salary using console
        String department = "";
        int selection = 1;
        Scanner sc = new Scanner(System.in);
        // use of while to make use of option selection multiple times
        while(selection!=0) {

            // printing employee details.
            System.out.println("\nEmp ID: " + emp.getEmpID() + "\nFirst Name :" +
                    emp.getfName()+ "\nLast Name: " + emp.getlName() +
                    "\nDepartment: " + emp.getDepartment()+ "\nHire Date: " +
                    emp.getHireDate() + "\nSalary: " + emp.getSalary());

            // printing department options to select from
            System.out.println("\nChange employee department\n1. Executive\n" +
                    "2. Information Technology\n3. Sales\n4. Marketing\n" +
                    "5. Finance\n6. Human Resources\n7. Customer Service\n" +
                    "0. Exit\n\nChoose one...press enter");

            // use of scanner class to input selection from user
            selection = sc.nextInt();
            // use of if else to make correct selection
            if(selection >=0 && selection <=7) {
                //use of switch to update department and salary
                switch (selection) {
                    case 1:
                        department = "Executive";
                        break;
                    case 2:
                        department = "Information Technology";
                        break;
                    case 3:
                        department = "Sales";
                        break;
                    case 4:
                        department = "Marketing";
                        break;
                    case 5:
                        department = "Finance";
                        break;
                    case 6:
                        department = "Human Resources";
                        break;
                    case 7:
                        department = "Customer Service";
                        break;
                    default:
                        department = "No Such Department";
                        break;
                }
                emp.setDepartment(department);
                emp.setSalary();
            }else{
                System.out.println("Please select correct option");
            }
        }
        // closing the scanner input stream
        sc.close();
    }
}
