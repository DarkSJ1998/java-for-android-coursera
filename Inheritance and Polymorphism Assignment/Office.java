package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
        extends Building {

    // DONE - Put your code here.

    // Instance variables
    private static int sTotalOffices = 0;   // Static variable
    private String mBusinessName;
    private int mParkingSpaces;

    // Parameterized Constructor #1
    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);                  // calling Super Class's constructor
        this.mBusinessName = null;
        this.mParkingSpaces = 0;
        sTotalOffices++;
    }

    // Parameterized Constructor #2
    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        this(length, width, lotLength, lotWidth);                   // calling parameterized constructor #1
        this.mBusinessName = businessName;
    }

    // Parameterized Constructor #3
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);     // calling parameterized constructor #2
        this.mParkingSpaces = parkingSpaces;
    }

    // Getter/Accessor method
    public String getBusinessName() {
        if (this.mBusinessName == null)
            return "unoccupied";
        else
            return this.mBusinessName;
    }

    // Setter/Mutator method
    public void setBusinessName(String businessName) {
        this.mBusinessName = businessName;
    }

    // Getter/Accessor method
    public int getParkingSpaces() {
        return this.mParkingSpaces;
    }

    // Setter/Mutator method
    public void setParkingSpaces(int parkingSpaces) {
        this.mParkingSpaces = parkingSpaces;
    }

    // Method to override the default toString() implementation
    @Override
    public String toString() {
        String result = "Business: " + this.getBusinessName();

        if (this.mBusinessName != null)
            result += "; has " + this.getParkingSpaces() + " parking spaces";

        result += " (total offices: " + sTotalOffices + ")";

        return result;
    }

    // Method to override the default equals() implementation
    // First we check if the received object belongs to the same class or not
    // Then we proceed by checking the building area and the number of parking spaces
    @Override
    public boolean equals(Object object) {
        if (object instanceof Office) {
            Office office = (Office) object;
            return (this.calcBuildingArea() == office.calcBuildingArea() && this.getParkingSpaces() == office.getParkingSpaces());
        }
        return false;
    }
}
