package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // DONE -- Fill in your code here

    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;

    private int mSwing;

    // Constructor to set the mSwing value to CLOSED by default
    public Gate() {
        this.mSwing = CLOSED;
    }

    // Method that first checks if passed parameter is valid or not
    // If it is valid, it sets the value and returns true
    // Otherwise, it return false
    public boolean setSwing(int direction) {
        this.mSwing = direction;
        if (direction == OUT || direction == IN) {
            return true;
        }
        return false;
    }

    // Method that first checks if passed parameter is valid or not
    // If it is valid, it calls setSwing() & returns true
    // Otherwise, it return false
    // However, as setSwing() itself checks the value, we can simply call it
    public boolean open(int direction) {
        return setSwing(direction);
    }

    // Method to close the Gate
    public void close() {
        this.mSwing = CLOSED;
    }

    // Getter/Accessor method to return the value of mSwing
    public int getSwingDirection() {
        return mSwing;
    }

    // Method to return the value of count depending on the value of count
    public int thru(int count) {
        return mSwing * count;
    }

    // Overriding the toString() method based on different conditions
    public String toString() {
        switch (mSwing) {
            // a gate that is closed
            case CLOSED:
                return "This gate is closed";

            // a gate that has opened to swing IN
            case IN:
                return "This gate is open and swings to enter the pen only";

            // a gate that been opened swing OUT
            case OUT:
                return "This gate is open and swings to exit the pen only";

            // a gate that has a swing value other than IN, OUT, or CLOSED
            default:
                return "This gate has an invalid swing direction";
        }
    }

}
