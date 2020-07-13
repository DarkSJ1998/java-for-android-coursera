package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends CalcOperation {
    // DONE -- start your code here

    // Static constant used for the switch
    public static final int DIV = 4;

    // Instance Variable
    private int quotient;
    private int remainder;

    // Parameterized constructor
    public Divide(int argumentOne, int argumentTwo) {
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
    }

    // Method to perform the calculations
    public void calculate() {
        quotient = argumentOne / argumentTwo;
        remainder = argumentOne % argumentTwo;
    }

    // Getter/Accessor method
    public int getQuotient() {
        return quotient;
    }

    // Getter/Accessor method
    public int getRemainder() {
        return remainder;
    }

    // Overriding the toString method to print result
    @Override
    public String toString() {
        return getQuotient() + " R: " + getRemainder();
    }

}
