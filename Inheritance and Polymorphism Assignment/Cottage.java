package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
        extends House {

    // DONE - Put your code here.

    // Instance variable
    private boolean mSecondFloor;

    // Parameterized Constructor #1
    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth);           // calling Super Class's constructor
        this.mSecondFloor = false;
    }

    // Parameterized Constructor #2
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner);    // calling Super Class's constructor
        this.mSecondFloor = secondFloor;
    }

    // Getter/Accessor method
    public boolean hasSecondFloor() {
        return this.mSecondFloor;
    }

    // Method to override the default toString() implementation
    @Override
    public String toString() {
        String result = super.toString();
        if (this.hasSecondFloor())
            result += "; is a two story cottage";
        else
            result += "; is a cottage";

        return result;
    }

}

