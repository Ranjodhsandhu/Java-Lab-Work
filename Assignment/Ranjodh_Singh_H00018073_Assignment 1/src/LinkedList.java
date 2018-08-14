/**
 * Program written for the requirement of Assignment 1 in mobile application development course
 * at Canada at Hanson for Cambrian college of Arts & Tech
 * Written by: Ranjodh Singh
 * Date:29-06-2018
 */

/**
 * This class will define the complete Linked list operations and different related methods
 */
public class LinkedList {

    // This object of Node class is the first node in the List
    public Node head;

    // This field is the size of the List at any time
    private int size;

    /**
     * This constructor will initialize the size of the list to start that is 0
     */
    public LinkedList(){
        size = 0;
    }

    /**
     * This method will return true if there is no element in the list
     * @return of type boolean is the result of list size check
     */
    public boolean isEmpty() {
        if(head == null)
            return true;
        else
            return false;
    }

    /**
     * This method will insert the data passed to it to the list
     * @param data of type Shape
     */
    public void insertAtEnd(Shape data) {
        // newNode of type Node to be inserted
        Node newNode = new Node();
        // Setting the data to node
        newNode.setNode(data,null);
        // if no element in the list insert at start
        if(head == null) {
            head = newNode;
        }else {
            Node current = head;
            Node previous = head;
            while (current != null) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(newNode);
        }
        // increase the size of the list after insertion
        size++;
    }

    /**
     * This method will insert the Shape data into the list at start
     * @param data of type Shape
     */
    public void insertAtBeginning(Shape data) {
        // Initialize the new node
        Node newNode = new Node();
        // set data to the new node
        newNode.setNode(data,head);
        if(head == null){
          head = newNode;
        }else {
            newNode.setNext(head);
            head = newNode;
        }
        // increase the size of list after insertion
        size++;
    }

    /**
     * This method will return the last element of the list
     * @return of type Node is the node to be returned
     */
    public Node tail() {
        if(head == null) {
            return null;
        }else {
            Node current = head;
            Node previous = head;
            while (current != null) {
                previous = current;
                current = current.getNext();
            }
            return previous;
        }
    }

    /**
     * This method will return the size of the list at anytime
     * @return of type int
     */
    public int length() {
        return size;
    }

    /**
     * This method will help inserting at particular index in the list
     * @param idx of type int is the location in the list where data to be inserted
     * @param data of type Shape which need to be inserted in the list
     */
    void insertAtIndex(int idx, Shape data) {
        Node newNode = new Node();
        newNode.setNode(data,null);
        if(head == null || idx == 1) {
            insertAtBeginning(data);
        }else if(idx > (size+1)) {
            System.out.println("Not possible");
        }else if (idx == (size+1)){
            insertAtEnd(data);
        }
        else {
            Node previous = head;
            Node current;
            int counter = 1;
            while(counter < idx - 1){
                previous = previous.next;
                counter++;
            }
            current = previous.next;
            newNode.setNext(current);
            previous.setNext(newNode);
            size++;
        }
    }

    /**
     * This method will find the list item at given index and return the node
     * @param idx of type int is the location to find out in the list
     * @return of type Node is the node to be returned when found successfully
     */
    Node findAtIndex(int idx) {
        if(head == null){
            System.out.println("No elements");
            return null;
        }else if(idx>size){
            System.out.println("Not that many elements");
            return null;
        }else{
            Node current = head;
            Node node;
            int counter = 1;
            while(counter < idx){
                current = current.next;
                counter++;
            }
            node = current;
            return node;
        }
    }

    /**
     * This method will delete from the list with given index
     * @param idx of type int is the location to be deleted from the list
     */
    void deleteAtIndex(int idx) {
        if(head == null){
            System.out.println("No Element");
        }else if(idx > size){
            System.out.println("Not many elements");
        }else if(idx == 1){
            head = head.next;
            size--;
        }else if(idx == size){
            Node current = head;
            Node last = head;
            Node previousToLast = head;
            while (current != null) {
                previousToLast = last;
                last = current;
                current = current.next;
            }
            previousToLast.setNext(null);
            size--;
        }else if(idx<size){
            Node current = head;
            Node previous = head;
            int counter = 1;
            while (counter < idx){
                previous = current;
                current = current.next;
                counter++;
            }
            current = current.getNext();
            previous.setNext(current);
            size--;
        }
    }

    /**
     * This method will delete particular data from list
     * @param s of type Shape is the element to be deleted
     */
    void deleteData(Shape s) {
        Node current = head;
        int counter = 1;
        int flag = 0;
        while(current != null){
            if(current.getData().equals(s)){
                deleteAtIndex(counter);
                counter--;
                flag++;
            }
            counter++;
            current = current.next;
        }
        System.out.println("No of times Shape found: "+ flag);
    }

    /**
     * This method will print the element in the list at particular location
     * @param index of type int is the location of the data to be printed
     * @return of type String is the node value to be returned
     */
    public String print(int index) {
        if(index > size) {
            System.out.println("Not many elements");
            return null;
        }else if(index == 1){
            return head.getData().toString();
        }else if(index < size ){
            Node current = head;
            int counter = 1;
            while(counter < index){
                current = current.next;
                counter++;
            }
            return current.getData().toString();
        }else if(index == size){
            Node current = head;
            Node previous = head;
            while(current != null){
                previous = current;
                current = current.next;
            }
            return previous.getData().toString();
        }
        else return toString();
    }

    /**
     * This method will print all the elements of the LinkedList
     */
    public void print(){
        Node tmp = head;
        System.out.println("Index\t||\tElement");
        int index = 0;
        while(tmp != null) {
            index++;
            System.out.println(index+"\t\t||\t"+tmp.toString());
            tmp = tmp.next;
        }
    }

    /**
     * Overridden hashcode method will return the hashcode value of node
     * @return of type int
     */
    @Override
    public int hashCode(){
        if(head!=null)
        return head.hashCode();
        return 0;
    }

    /**
     * Overridden equals method will return true if the objects in comparison are equal
     * @param obj of type of class in consideration
     * @return of type boolean will return true if the objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }

    /**
     * Inner class called Node will encapsulate the node data and method for the linked list
     */
    class Node{

        // Data for each node
        private Shape data;
        // Have the address of next node
        private Node next;

        // Constructor will initialize the values of the node fields to empty state
        public Node(){
            this.data=null;
            this.next=null;
        }

        /**
         * Parameterized constructor will set the node values to passed parameters
         * @param data of type shape to be inserted in the node
         * @param next of type Node is the address of next node
         */
        public Node(Shape data, Node next){
            this.setNode(data, next);
        }

        /**
         * This method will initialize each node being considered
         * @param data of type shape
         * @param next of type Node (address of next node)
         */
        public void setNode(Shape data, Node next){
            this.setData(data);
            this.setNext(next);
        }

        /**
         * Will set the data inside the node
         * @param data of type Shape
         */
        public void setData(Shape data){
            this.data=data;
        }

        /**
         * Will return the data inside the node
         * @return of type Shape
         */
        public Shape getData(){
            return this.data;
        }

        /**
         * Will return the next node's address
         * @return of type Node
         */
        public Node getNext(){
            return next;
        }

        /**
         * will set the address of the next node in the node
         * @param next of type Node containing address of next node
         */
        public void setNext(Node next){
            this.next=next;
        }

        /**
         * Will return the current node
         * @return of type Node
         */
        public Node getNode(){return this;}

        /**
         * Overridden method will return the data in the node
         * @return of type String
         */
        @Override
        public String toString() {
            if (getNode() == null) {
                return String.format("Node{" + "data= Nothing to show}");
            } else {
                return String.format("Node{" + "data=" + data + "}");
            }
        }

        /**
         * Overridden method will compare the two objects in the given nodes
         * @param obj of type passed class object(generally object)
         * @return of type boolean is true if the result is positive
         */
        @Override
        public boolean equals(Object obj) {
            return this.getClass().equals(obj.getClass());
        }
    }
}