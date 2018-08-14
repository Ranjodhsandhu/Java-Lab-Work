/**
 * This program is built for the fulfillment of the Lab4 of
 * Mobile application development course at Cambrian at Hanson.
 * Written by: Ranjodh Singh
 * Date: 08-06-2018
 */

// Scanner class is used to input options from the user
import java.util.Scanner;

/**
 * Main class will initialize the queue object and work with queue
 */
public class Main {

    /**
     * Main method will start the program
     * @param args
     */
    public static void main(String[] args) {

        // Initializing the queue object
        Queue q = new Queue();
        // flag variable to takes care of the exit point
        int flag = 0;

        // while loop takes care of the program display
        while(flag == 0){

            q.Print();
            System.out.println("\n\nPlease choose operation");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Front");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            int selection;
            System.out.println("Please enter your option");
            selection = sc.nextInt();
            if(selection >=1 && selection <=4)
            switch(selection) {
                case 1:
                    int integer;
                    System.out.println("\nPlease enter an integer");
                    integer = sc.nextInt();
                    q.Push(integer);
                    break;
                case 2:
                    q.Pop();
                    break;
                case 3:
                    System.out.println("\nElement at front is:\t"+q.Front());
                    break;
                case 4:
                    flag = 1;
                    break;
                default:
                    break;
            }
            else
                System.out.println("Wrong selection");
        }
    }
}
