/**
 * This program was written for the fulfillment of the course
 * android development using Java MA1.1.
 * Written by: Ranjodh Singh
 * Date: 05-06-2018
 *
 */

// imported Date class to input service date for server
import java.util.Date;
// imported Scanner class to get server id
import java.util.Scanner;

/**
 * This class will encapsulate server details like id, name, services and
 * associated methods.
 */

public class Server {

    //Stores the name of the Server
    public String name;

    //Stores the id of the Server
    private int id;

    //Stores the dates of the services
    protected Date[] services;

    //Stores the rating of the services (The review is out of 5)
    protected Double[] review;

    /**
     * flags for the services and reviews arrays
     * top is the current index of any array
     * max is the highest value an array can store
     */
    int top;
    int max;

    /**
     * This constructor will initialize the server details.
     */
    public Server() {
        name = "";
        id = 0;
        services = new Date[10];
        review = new Double[10];
        top = 0;
        max = 10;
        inputId();
    }

    /**
     * Get server id from the user using scanner
     */
    public void inputId() {

        System.out.println("Enter server ID: ");
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
    }

    /**
     * Adds the server's name passed in the parameters
     * @param name  of type String
     */
    public void addName(String name) {
        this.name = name;
    }

    /**
     * Adds an instance of a date of service and rating as reviews
     * @param date in the date format passed in the parameter
     * @param rating in the double format and from 0 to 5
     */
    public void addService(Date date, Double rating) {

        if (top < max) {
            this.services[top] = date;
            this.review[top] = rating;
            top++;
        } else {
            System.out.println("No more services can be added");
        }
    }

    /**
     * Removes the most recent service
     * It will remove the service date and rating from the record
     */
    public void removeService() {

        if (top > 0) {
            top--;
        } else {
            System.out.println("No service to be deleted");
        }
    }

    /**
     * This method will print the oldest services to the screen
     * as service date and its review
     */
    public void threeOldestService() {

        System.out.println("\n\n-----------------------------Oldest services------------------------------\n");
        if(top>0){

            if (top > 2) {
                System.out.println("S No.\t"+"Service Date\t\t\t\t\t" +"Reviews" );
                System.out.println("--------------------------------------------------------------------------");
                for (int i = 0; i <= 2; i++) {
                    System.out.println((i+1)+"\t\t"+this.services[i] + "\t"+this.review[i]);
                }
                System.out.println("--------------------------------------------------------------------------");
            }
            else {
                System.out.println("S No.\t"+"Service Date\t\t\t\t\t" +"Reviews" );
                System.out.println("--------------------------------------------------------------------------");

                for(int i = 0;i<top;i++) {
                    System.out.println((i+1) +"\t\t"+ this.services[i]
                                        +"\t" + this.review[i]);
                }
                System.out.println("--------------------------------------------------------------------------");
            }
        }
        else{
            System.out.println("No Services to Display");
        }
    }

    /**
     * This method prints the three most recent services as
     * service date and review
     */
    public void threeNewestService() {
        int sno = 1;
        System.out.println("\n\n-----------------------------Newest services------------------------------\n");
        if (top > 0) {
            if (top > 2) {

                System.out.println("S No.\t" + "Service Date\t\t\t\t\t" + "Reviews");
                System.out.println("--------------------------------------------------------------------------");
                for (int i = (top - 1); i >= (top - 3); i--) {
                    System.out.println((sno++) + "\t\t" + this.services[i] + "\t" + this.review[i]);
                }
                System.out.println("--------------------------------------------------------------------------");
            } else {
                System.out.println("S No.\t" + "Service Date\t\t\t\t\t" + "Reviews");
                System.out.println("--------------------------------------------------------------------------");

                for (int i = top - 1; i >= 0; i--) {
                    System.out.println((sno++) + "\t\t" + this.services[i] + "\t" + this.review[i]);
                }
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("\n--------------------------------------------------------------------------");
            }
        }else{
            System.out.println("No Record To Display");
        }
    }
}
