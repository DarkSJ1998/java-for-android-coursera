package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends CalcOperation {
    // DONE -- start your code here

    // Static constant used for the switch
    public static final int MUL = 3;

    // Instance Variable
    private int prod;

    // Parameterized constructor
    public Multiply(int argumentOne, int argumentTwo) {
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
    }

    // Method to perform the calculations
    public void calculate() {
        prod = argumentOne * argumentTwo;
    }

    // Getter/Accessor method
    public int getProd() {
        return prod;
    }

    // Overriding the toString method to print result
    @Override
    public String toString() {
        return "" + getProd();
    }

}
