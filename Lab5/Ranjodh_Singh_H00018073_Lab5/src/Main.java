/**
 * This program was created for the requirement of the
 * lab 5 in the mobile application development course at
 * cambrian at hanson toronto.
 * Date: 19-06-2018
 * Writer: Ranjodh Singh
 */

// Scanner class used to get the user input
import java.util.Scanner;
import java.util.TooManyListenersException;

// Main class will be used to start the program
public class Main {

    /**
     * Main method is the starting point of the program
     * @param args
     */
    public static void main(String[] args) {
	    int flag = 0;
	    // This Loop will keep track of the chosen vehicle at the time
	    while(flag == 0) {
            System.out.println("1. Sedan");
            System.out.println("2. Sport Sedan");
            System.out.println("3. MotorCycle");
            System.out.println("4. Van");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();
            if(selection>=0 && selection<=4)
            switch(selection)// Switch loop to operate on the chosen vehicle
             {
                case 1:
                    SedanOperations();
                    break;
                case 2:
                    SportsSedanOperations();
                    break;
                case 3:
                    MotorcycleOperations();
                    break;
                case 4:
                    vanOperations();
                    break;
                case 0:
                    flag = 1;
                    break;
                default:
                    break;
            }else System.out.println("Wrong selection");
        }
    }

    /**
     * Helping method for showing the operation options for the selected vehicle
     */
    static void Options(){
        System.out.println("Press S to Accelerate");
        System.out.println("Press B for brakes");
        System.out.println("Press E for Emergency brakes");
        System.out.println("Press I for putting an item");
        System.out.println("Press Q for turning off vehicle");
    }

    /**
     * This method will operate on the sedan vehicle when called
     */
    static void SedanOperations(){
        int shutDown = 1;
        Sedan startSedan = new Sedan();
        while (shutDown == 1){
            System.out.println("Sedan");
            startSedan.Show();
            Options();
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            if(choice.equals("s")||choice.equals("S")) {
                startSedan.Accelerate(Speeding());
            }else if(choice.equals("e")||choice.equals("E")) {
                EBrake();
                startSedan.EmergencyBrake();
            }else if(choice.equals("b")||choice.equals("B")) {
                Brake();
                startSedan.Brake();
            }else if(choice.equals("i")||choice.equals("I")) {
                startSedan.Cargo(CItem());
            }else if(choice.equals("q")||choice.equals("Q")) {
                TOff();
                shutDown = 0;
            }else System.out.println("Wrong selection");
        }
    }
    /**
     * This method will operate on the sports sedan vehicle when called
     */
    static void SportsSedanOperations(){
        int shutDown = 1;
        SportsSedan startSportsSedan = new SportsSedan();
        while (shutDown == 1){
            System.out.println("Sports Sedan");
            startSportsSedan.Show();
            Options();
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            if(choice.equals("s")||choice.equals("S")) {
                startSportsSedan.Accelerate(Speeding());
            }else if(choice.equals("e")||choice.equals("E")) {
                EBrake();
                startSportsSedan.EmergencyBrake();
            }else if(choice.equals("b")||choice.equals("B")) {
                Brake();
                startSportsSedan.Brake();
            }else if(choice.equals("i")||choice.equals("I")) {
                startSportsSedan.Cargo(CItem());
            }else if(choice.equals("q")||choice.equals("Q")) {
                TOff();
                shutDown = 0;
            }else System.out.println("Wrong selection");
        }
    }
    /**
     * This method will operate on the motorcycle vehicle when called
     */
    static void MotorcycleOperations(){
        int shutDown = 1;
        Motorcycle startMotorcycle = new Motorcycle();
        while (shutDown == 1){
            System.out.println("Motorcycle");
            startMotorcycle.Show();
            Options();
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            if(choice.equals("s")||choice.equals("S")) {
                startMotorcycle.Accelerate(Speeding());
            }else if(choice.equals("e")||choice.equals("E")) {
                EBrake();
                startMotorcycle.EmergencyBrake();
            }else if(choice.equals("b")||choice.equals("B")) {
                Brake();
                startMotorcycle.Brake();
            }else if(choice.equals("i")||choice.equals("I")) {
                startMotorcycle.Cargo(CItem());
            }else if(choice.equals("q")||choice.equals("Q")) {
                TOff();
                shutDown = 0;
            }else System.out.println("Wrong selection");
        }
    }
    /**
     * This method will operate on the Van vehicle when called
     */
    static void vanOperations(){
        int shutDown = 1;
        Van startVan = new Van();
        while (shutDown == 1){
            System.out.println("Van");
            startVan.Show();
            Options();
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            if(choice.equals("s")||choice.equals("S")) {
                startVan.Accelerate(Speeding());
            }else if(choice.equals("e")||choice.equals("E")) {
                EBrake();
                startVan.EmergencyBrake();
            }else if(choice.equals("b")||choice.equals("B")) {
                Brake();
                startVan.Brake();
            }else if(choice.equals("i")||choice.equals("I")) {
                startVan.Cargo(CItem());
            }else if(choice.equals("q")||choice.equals("Q")) {
                TOff();
                shutDown = 0;
            }else System.out.println("Wrong selection");
        }
    }

    /**
     * Helping method to get time in seconds to press accelerator
     * @return seconds for which to press the accelerator
     */
    static int Speeding(){
        System.out.println("Enter seconds");
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
        System.out.println("Speeding");
        return second;
    }

    /**
     * Helping method to show that vehicle is applying emergency brakes
     */
    static void EBrake(){
        System.out.println("Emergency Brake");
    }

    /**
     * Helping method to show that vehicle is applying brakes
     */
    static void Brake(){
        System.out.println("Brakes");
    }

    /**
     * Helping method to get item input from user to put in trunk of vehicle
     * @return of type String will return item entered by user
     */
    static String CItem(){
        System.out.println("Please enter item");
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        return item;
    }

    /**
     * Helping method to show that vehicle is turning off
     */
    static void TOff(){
        System.out.println("Turning off");
    }

}