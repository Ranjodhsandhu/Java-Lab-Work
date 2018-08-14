/**
 * This program was written for the fulfillment of the course
 * android development using Java MA1.1.
 * Written by: Ranjodh Singh
 * Date: 05-06-2018
 *
 */

// imported date class for inputting the service date
import java.util.Date;

// Main class for starting the program containing main method
public class Main {
    /**
     * main method will initialize the server object and used
     * different methods of that class
     */
    public static void main(String[] args) {
    // initializing the server object
    Server server = new Server();

    server.addName("Tony");

    // adding services to the server list
    server.addService(new Date(System.currentTimeMillis()),5.0);
    server.addService(new Date(System.currentTimeMillis()),3.5);
    server.addService(new Date(System.currentTimeMillis()),4.5);
    server.addService(new Date(System.currentTimeMillis()),2.5);
    server.addService(new Date(System.currentTimeMillis()),3.5);
    server.addService(new Date(System.currentTimeMillis()),4.7);
    server.addService(new Date(System.currentTimeMillis()),3.1);
    server.addService(new Date(System.currentTimeMillis()),3.8);
    server.addService(new Date(System.currentTimeMillis()),4.3);
    server.addService(new Date(System.currentTimeMillis()),4.4);
    server.addService(new Date(System.currentTimeMillis()),4.5);
    server.addService(new Date(System.currentTimeMillis()),4.9);

    // display three newest and oldest services
    server.threeNewestService();
    server.threeOldestService();

    System.out.println("Removing a service...\n");
    server.removeService();

    server.threeNewestService();
    server.threeOldestService();
    }
}
