/**
 * Program written for the requirement of Assignment 1 in mobile application development course
 * at Canada at Hanson for Cambrian college of Arts & Tech
 * Written by: Ranjodh Singh
 * Date:02-07-2018
 */

// import class to get user input
import java.util.Scanner;

/**
 * Main class to start the program
 */
public class Main {

    // Linked list Object for it is declared static
    // so that can be used anywhere in the class
    static LinkedList shape = new LinkedList();

    /**
     * This method will help in selecting the shape for insertion or deletion
     * @return of type int is the type of class or shape
     */
    private static int selectShape() {
        int indicator = 0;
        while (indicator == 0) {
            System.out.println("1.Circle");
            System.out.println("2.Triangle");
            System.out.println("3.Square");
            System.out.println("4.Rectangle");
            System.out.println("0.Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if (option >= 0 && option <= 4) {
                switch (option) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    case 4:
                        return 4;
                    case 0:
                        indicator = 1;
                        break;
                }
            } else
                System.out.println("Wrong option selected");
        }
        return 0;
    }

    /**
     * This method will insert the shape into particular index given in the parameter
     * @param shapeType of type int is the type of the shape
     * @param idx of type is the index location in the list
     */
    private static void insertShapeType(int shapeType,int idx){
        Scanner sc = new Scanner(System.in);
        switch(shapeType){
            case 1:
                System.out.println("Enter Radius of Circle");
                int rad = sc.nextInt();
                Circle c = new Circle(rad);
                shape.insertAtIndex(idx,c);
                break;
            case 2:
                int side1, side2,side3;
                System.out.println("Enter first side of Triangle");
                side1 = sc.nextInt();
                System.out.println("Enter Second side of Triangle");
                side2 = sc.nextInt();
                System.out.println("Enter Third side of Triangle");
                side3 = sc.nextInt();
                Triangle t = new Triangle(side1,side2,side3);
                shape.insertAtIndex(idx,t);
                break;
            case 3:
                int side;
                System.out.println("Enter side of Square");
                side = sc.nextInt();
                Square  s = new Square(side);
                shape.insertAtIndex(idx,s);
                break;
            case 4:
                int length,breadth;
                System.out.println("Enter Length of Rectangle");
                length = sc.nextInt();
                System.out.println("Enter Breadth of Rectangle");
                breadth = sc.nextInt();
                Rectangle r = new Rectangle(length,breadth);
                shape.insertAtIndex(idx,r);
                break;
            default:
                break;
        }

    }

    //Linked list traversal
    static void ListTraversal(){
        int LSize = shape.length();
        for(int i = 1;i<=LSize;i++) {
            System.out.println(shape.print(i)+"\n");
        }
    }
    /**
     * This method will help in deleting particular shape type
     * @param shapeType of type int
     */
    static void deleteShape(int shapeType){
        Scanner sc = new Scanner(System.in);
        switch(shapeType){
            case 1:
                // Deleting circle
                System.out.println("Please enter radius");
                int radius = sc.nextInt();
                //shape.deleteData();
                break;
            case 2:
                // Deleting Triangle
                System.out.println("Please enter Side One");
                int side1 = sc.nextInt();
                System.out.println("Please enter Side Two ");
                int side2 = sc.nextInt();
                System.out.println("Please enter Side Three" );
                int side3 = sc.nextInt();
                //shape.deleteData();
                break;
            case 3:
                // Deleting Square
                System.out.println("Please enter Side of Square");
                int side = sc.nextInt();
                //shape.deleteData();
                break;
            case 4:
                //Deleting Rectangle
                System.out.println("Please enter length");
                int length = sc.nextInt();
                System.out.println("Please enter length");
                int breadth = sc.nextInt();
                //shape.deleteData();
                break;
            default:
                break;
        }
    }

    /**
     * Main Method to start the program execution
     * @param args
     */
    public static void main(String[] args) {


        int flag = 0;
        while (flag == 0){
            //System.out.println("Calling list traversal");
            //ListTraversal();
            System.out.println("Hash code for head node::"+shape.hashCode());
            shape.print();
            System.out.println("\n\nSelect option");
            System.out.println("1.Insert Element at Beginning");
            System.out.println("2.Insert Element at End");
            System.out.println("3.Insert Element at given index");
            System.out.println("4.Delete Element from Beginning");
            System.out.println("5.Delete Element from End");
            System.out.println("6.Delete Element from given index");
            System.out.println("7.Print Element at First ");
            System.out.println("8.Print Element at Last");
            System.out.println("9.Print Element at given index");
            //System.out.println("10.Delete Shape");
            System.out.println("0.Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            int shapeType;
            int index;
            if(option >= 0  && option <= 9){
                switch (option){
                    case 1:
                        // Inserting element at beginning;
                        shapeType = selectShape();
                        insertShapeType(shapeType,1);
                        break;
                    case 2:
                        // Inserting element at end
                        shapeType=selectShape();
                        insertShapeType(shapeType,(shape.length()+1));
                        break;
                    case 3:
                        // Inserting element at given index
                        System.out.println("Enter location index");
                        index = sc.nextInt();
                        shapeType=selectShape();
                        insertShapeType(shapeType,index);
                        break;
                    case 4:
                        // Delete element from beginning
                        shape.deleteAtIndex(1);
                        break;
                    case 5:
                        // Delete element from end
                        shape.deleteAtIndex(shape.length());
                        break;
                    case 6:
                        // Delete element at given index
                        System.out.println("Enter location index");
                        index = sc.nextInt();
                        shape.deleteAtIndex(index);
                        break;
                    case 7:
                        // Print element at first
                        if(shape.print(1)!=null)
                        System.out.println(shape.print(1));
                        break;
                    case 8:
                        // Print Element at last
                        if(shape.print(shape.length())!=null)
                        System.out.println(shape.print(shape.length()));
                        break;
                    case 9:
                        // Print element at given index
                        System.out.println("Enter location index");
                        index = sc.nextInt();
                        if(shape.print(index)!=null)
                        System.out.println(shape.print(index));
                        break;
                    case 10:
                        //Delete particular shape
                        shapeType = selectShape();
                        deleteShape(shapeType);
                    case 0:
                        // Exit.
                        flag = 1;
                        break;
                }
            }else System.out.println("Wrong option selected");
        }
    }
}
