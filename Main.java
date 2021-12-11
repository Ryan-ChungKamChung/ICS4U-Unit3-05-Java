/*
 * This program is a stub for the vehicle class.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-12-11
 */

/** This is a stub program for the Vehicle class. */
class Main {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Creates 2 vehicle classes and uses its getters, setters and methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {
        Vehicle vehicle1 = new Vehicle("ASDF404", "Red", 4, 150);
        Vehicle vehicle2 = new Vehicle("QWER123", "Blue", 2, 200); 

        vehicle1.setLicensePlate("FGHJ968");
        vehicle1.setColour("Green");
        vehicle1.accelerate(60);

        System.out.println("\nLicense Plate: " + vehicle1.getLicensePlate()
                + "\nColour: " + vehicle1.getColour()
                + "\nNumber of Doors: " + vehicle1.getNumOfDoors()
                + "\nMax Speed: " + vehicle1.getMaxSpeed()
                + "\nCurrent Speed: " + vehicle1.getSpeed());

        vehicle2.setColour("Black");
        vehicle2.accelerate(75);
        vehicle2.brake(60);

        System.out.println("\nLicense Plate: " + vehicle2.getLicensePlate()
                + "\nColour: " + vehicle2.getColour()
                + "\nNumber of Doors: " + vehicle2.getNumOfDoors()
                + "\nMax Speed: " + vehicle2.getMaxSpeed()
                + "\nCurrent Speed: " + vehicle2.getSpeed());
    }
}
