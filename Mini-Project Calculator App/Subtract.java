package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends CalcOperation {
    // DONE -- start your code here

    // Static constant used for the switch
    public static final int SUB = 2;

    // Instance Variable
    private int diff;

    // Parameterized constructor
    public Subtract(int argumentOne, int argumentTwo) {
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
    }

    // Method to perform the calculations
    public void calculate() {
        diff = argumentOne - argumentTwo;
    }

    // Getter/Accessor method
    public int getDiff() {
        return diff;
    }

    // Overriding the toString method to print result
    @Override
    public String toString() {
        return "" + getDiff();
    }

}
