package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends CalcOperation {
    // DONE -- start your code here

    // Static constant used for the switch
    public static final int ADD = 1;

    // Instance Variable
    private int sum;

    // Parameterized constructor
    public Add(int argumentOne, int argumentTwo) {
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
    }

    // Method to perform the calculations
    public void calculate() {
        sum = argumentOne + argumentTwo;
    }

    // Getter/Accessor method
    public int getSum() {
        return sum;
    }

    // Overriding the toString method to print result
    @Override
    public String toString() {
        return "" + getSum();
    }

}
