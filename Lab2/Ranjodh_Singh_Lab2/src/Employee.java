/**
 * This program is written for the fulfillment of Lab2
 * of Android development using Java-MA1S1.
 * Written by: Ranjodh singh
 * Date: 27-05-2018
 */

/**
 * Two prebuilt classes are imported.
 * One is to get current Date and time.
 * Second to input for employee id.
 */
import java.util.Date;
import java.util.Scanner;

/**
 * Employee class encapsulates employee details such as
 * First name, last name, department, employee id, salary
 * and methods to set and get these values.
 */
public class Employee {

        // This variable represents employee first name
        private String fName;

        // This variable represents employee last name
        private String lName;

        //This variable represents employee ID
        private int empID;

        //This variable represents employee department
        private String department;

        //This variable represents employee salary
        private int salary;

        //This variable represents employee hire date
        private Date hireDate;

        /**
         * This default constructor will initialize all the
         * variables to empty or safe state.
         */
        Employee(){
            fName = null;
            lName = null;
            empID = 0;
            department = null;
            salary = 0;
            hireDate = null;
        }

        /**
         * This parameterized constructor will set all the employee variables
         * to the values passed in this constructor.
         * sets *salary* according to department using setSalary() method.
         * sets *empID* by taking inputt using scanner class.
         */
        Employee(String first, String last, String department, Date hireDate){

            fName = first;
            lName = last;
            this.department = department;
            setSalary();
            this.hireDate = hireDate;

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter Employee ID");
            empID = sc.nextInt();
        }

        /**
         * This method will return employee ID.
         * return type is int.
         */
        public int getEmpID(){
            return empID;
        }

        /**
         * This method will set the first name of the employee
         * to passed parameter fName.
         * parameter fName is of type string.
         */
        public void setfName(String fName){
            this.fName = fName;
        }

        /**
         * This method will return first name of the employee
         * return type is string.
         */
        public String getfName(){
            return fName;
        }

        /**
         * This method will set last name of employee
         * to passed parameter lName
         * parameter lName is of type string.
         */
        public void setlName(String lName){
            this.lName = lName;
        }

        /**
         * This method will return last name of employee
         * return type is String.
         */
        public String getlName(){
            return lName;
        }

        /**
         * This method will set employee's department to the
         * passed parameter department.
         * Parameter type is string.
         */
        public void setDepartment(String department){
            this.department = department;
        }

        /**
         * This method will return department of the employee
         * return type is String.
         */
        public String getDepartment(){
            return department;
        }

        /**
         * This method will set employee salary according to the
         * department of the employee which was set in parameterized
         * constructor or using setDepartment(String) method.
         * Different departments have different salary as
         * pre-described in assignment.
         */
        public void setSalary(){
            switch(department){
                case "Executive": salary = 150000;
                    break;
                case "Information Technology": salary = 100000;
                    break;
                case "Sales": salary = 60000;
                    break;
                case "Marketing": salary = 70000;
                    break;
                case "Finance": salary = 80000;
                    break;
                case "Human Resources": salary = 65000;
                    break;
                case "Customer Service": salary = 35000;
                    break;
                default: salary = 0;
                    break;
            }
        }

        /**
         * This method will return employee salary.
         * return type is int.
         */
        public int getSalary(){
            return salary;
        }

        /**
         * This method will set the employee hire Date to the
         * current date and time as pre-described in assignment.
         */
        public void setHireDate(){
            hireDate = new Date(System.currentTimeMillis());
        }

        /**
         * This method will return employee hire date.
         * return type is Date.
         */
        public Date getHireDate(){
            return hireDate;
        }

}
