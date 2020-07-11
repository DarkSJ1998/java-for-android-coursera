package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building {

    // DONE - Put your code here.

    // Instance variables
    private String mOwner;
    private boolean mPool;

    // Parameterized Constructor #1
    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);              // calling Super Class's constructor
        mOwner = null;
        mPool = false;
    }

    // Parameterized Constructor #2
    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        this(length, width, lotLength, lotWidth);               // calling parameterized constructor #1
        this.mOwner = owner;
    }

    // Parameterized Constructor #3
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        this(length, width, lotLength, lotWidth, owner);        // calling parameterized constructor #2
        this.mPool = pool;
    }

    // Getter/Accessor method
    public String getOwner() {
        if (this.mOwner == null)
            return "n/a";
        else
            return this.mOwner;
    }

    // Setter/Mutator method
    public void setOwner(String owner) {
        this.mOwner = owner;
    }

    // Getter/Accessor method
    public boolean hasPool() {
        return this.mPool;
    }

    // Setter/Mutator method
    public void setPool(boolean pool) {
        this.mPool = pool;
    }

    // Method to override the default toString() implementation
    @Override
    public String toString() {
        String result = "Owner: " + this.getOwner();
        if (this.hasPool())
            result += "; has a pool";

        if (this.calcLotArea() > this.calcBuildingArea())
            result += "; has a big open space";

        return result;
    }

    // Method to override the default equals() implementation
    // First we check if the received object belongs to the same class or not
    // Then we proceed by checking the building area and the pool status
    @Override
    public boolean equals(Object object) {
        if (object instanceof House) {
            House house = (House) object;
            return (this.calcBuildingArea() == house.calcBuildingArea() && this.hasPool() == house.hasPool());
        }
        return false;
    }


}
