/**
 * This program was created for the requirement of the
 * lab 5 in the mobile application development course at
 * cambrian at hanson toronto.
 * Date: 19-06-2018
 * Writer: Ranjodh Singh
 */

/**
 * This class will implement the sports sedan vehicle and its various
 * operations using the abstract methods from vehicle interface
 */
public class SportsSedan implements Vehicle{
    // Fields of the class will contain the values for this vehicle
    int topSpeed; // Top speed of the vehicle
    String [] trunk; // Items to be put into the vehicle
    int cargoItemNo; // Pointer to be used with the trunk
    double currentSpeed; // Current Speed of the vehicle
    int speedUp; // Helping field for acceleration
    int brake; // This variable will tell how much to slow down the vehicle
    int emergencyBrake; // How much to apply for the emergency brakes
    int maxCargoItems; // Maximum items to be stored in the vehicle
    /**
     * This default constructor will initialize all the fields of the vehicle
     **/
    public SportsSedan(){
        topSpeed = 300;
        maxCargoItems = 8;
        trunk = new String[maxCargoItems];
        currentSpeed = 0.0;
        cargoItemNo = -1;
        speedUp = 21;
        brake = 18;
        emergencyBrake = 28;
    }
    /**
     * This method will accelerate the vehicle according to the speed
     * of the vehicle
     * @param seconds of type int will tell how long to press the accelerator
     */
    @Override
    public void Accelerate(int seconds){
        for(int i = 0; i<seconds;i++){
            if(currentSpeed<=topSpeed-speedUp)
                currentSpeed = currentSpeed + speedUp;
            else if(currentSpeed>topSpeed-speedUp && currentSpeed<topSpeed){
                currentSpeed = topSpeed;
                System.out.println("TopSpeed");
            }
            else
                System.out.println("TopSpeed");
        }
    }
    /**
     * This method will apply brakes and slow down vehicle according
     * to vehicle's capacity
     */
    @Override
    public void Brake(){
        if(currentSpeed>=brake)
            currentSpeed = currentSpeed - brake;
        else {
            currentSpeed = 0.0;
            System.out.println("Stopped");
        }
    }
    /**
     * This method will apply emergency brakes and slow down vehicle according
     * to vehicle's capacity
     */
    @Override
    public void EmergencyBrake(){
        if(currentSpeed>=emergencyBrake)
            currentSpeed = currentSpeed - emergencyBrake;
        else{
            currentSpeed = 0.0;
            System.out.println("Stopped");
        }
    }
    /**
     * This method will store the items for a vehicle and
     * its capacity to store number of items in the trunk
     * @param item of type string will be the item to be
     *             put in the vehicle trunk
     */
    @Override
    public void Cargo(String item){
        if(cargoItemNo == -1){
            cargoItemNo = 0;
            trunk[cargoItemNo] = item;
        }
        else if(cargoItemNo<(maxCargoItems-1)) {
            cargoItemNo++;
            trunk[cargoItemNo] = item;
        }
        else
            System.out.println("Trunk is Full");
    }
    /**
     * This helping method will print the current speed and the
     * trunk items for the vehicle
     */
    public void Show(){
        System.out.println("Speed: "+currentSpeed);
        if(cargoItemNo != -1)
            for(int i = 0; i<= cargoItemNo;i++)
                System.out.println("Item No: "+(i+1)+" "+trunk[i]);
    }
}
