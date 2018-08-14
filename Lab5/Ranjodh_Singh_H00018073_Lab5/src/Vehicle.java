/**
 * This program was created for the requirement of the
 * lab 5 in the mobile application development course at
 * cambrian at hanson toronto.
 * Date: 19-06-2018
 * Writer: Ranjodh Singh
 */
/**
 * This interface will contain the methods need to be implemented in child classes
 **/
public interface Vehicle {

    public void Accelerate(int seconds);

    public void Brake();

    public void EmergencyBrake();

    public void Cargo(String item);
}
