/**
 * This program is built for the fulfillment of the Lab4 of
 * Mobile application development course at Cambrian at Hanson.
 * Written by: Ranjodh Singh
 * Date: 08-06-2018
 */

// Scanner class is imported to input
import java.util.Scanner;

/**
 * Queue class will contain the array to be used as queue and different methods
 */
public class Queue{

    // This array of integers holds the data. Initial size is 10
    int[] qq;
    // This integer keeps track of the maximum size of the queue
    int max;
    // This integer keeps track of the current size of the queue or end of the queue
    int size;
    // This integer variable is the flag to watch the front of the queue
    int front;

    /**
     * This default constructor will initialize different
     * variables to be used in the queue
     */
    public Queue(){
        max = 10;
        qq = new int[max];
        size = -1 ;
        front = -1;
    }

    /**
     * This method will traverse all the elements of the queue
     */
    public void Print(){
        if(IsEmpty())
            System.out.println("\nNo elements in queue");
        else{
            System.out.println("\nQueue at present is: ");
            for(int i = front; i<= size;i++) {
                System.out.print(qq[i]+"\t");
            }
        }
    }

    /**
     * This method will double the size of the queue when it reaches the limit
     */
    public void Grow(){
        System.out.println("Do you want to double size of Queue(Y/N)");
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        if(s.equals("Y") || s.equals("y")) {
            int tmpmax = max;
            int []temp = new int[tmpmax];
            for(int i=0;i<max;i++){
                temp[i] = qq[i];
            }
            max = 2*max;
            qq = new int[max];
            for(int i=0;i<tmpmax;i++){
                qq[i] = temp[i];
            }
        }
        else if(s.equals("N")||s.equals("n"))
            System.out.println("\nQueue full");
        else
            System.out.println("\nWrong input");
    }

    /**
     * This method will push an integer element into end of the queue
     * @param a of type int is the value to be inserted into the queue
     */
    public void Push(int a){
        if(size == -1 && front == -1){
            size = front = 0;
            qq[size] = a;
        }else if(size < (max-1)) {
            size++;
            qq[size] = a;
        }else if(size == (max-1)) {
            System.out.println("No more elements");
            Grow();
        }
        else
            System.out.println("Queue full");
    }

    /**
     * As queue works on FIFO basis this method will delete one element from the front
     */
    public void Pop(){
        if(size>front) {
            qq[front] = 0;
            front++;
        }
        else if(size == front && (front != -1)) {
            qq[front] = 0;
            size = front = -1;
        }
        else
            System.out.println("Queue Empty");
    }

    /**
     * This method checks if the queue is empty or not
     * @return type is boolean means returns true if queue is empty false otherwise
     */
    public boolean IsEmpty(){
        if(size==-1 && front==-1)
            return true;
        else
            return false;
    }

    /**
     * This method returns the value at the front of the queue
     * @return type is int, means returns the value of queue
     */
    public int Front(){
        if(front != -1)
            return qq[front];
        else
            return 0;
    }
}
