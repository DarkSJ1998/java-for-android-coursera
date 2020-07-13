package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

import static mooc.vandy.java4android.calculator.logic.Add.ADD;
import static mooc.vandy.java4android.calculator.logic.Divide.DIV;
import static mooc.vandy.java4android.calculator.logic.Multiply.MUL;
import static mooc.vandy.java4android.calculator.logic.Subtract.SUB;

/**
 * Performs an operation selected by the user.
 */
public class Logic
        implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation) {
        // DONE -- start your code here

        // Creating the reference variable of the super class
        CalcOperation calcOperation = null;

        // Depending on the value of operation, we'll perform the relevant operation
        switch (operation) {
            case ADD:
                calcOperation = new Add(argumentOne, argumentTwo);          // Creating the object of the relevant class
                break;

            case SUB:
                calcOperation = new Subtract(argumentOne, argumentTwo);     // Creating the object of the relevant class
                break;

            case MUL:
                calcOperation = new Multiply(argumentOne, argumentTwo);     // Creating the object of the relevant class
                break;

            case DIV:
                calcOperation = new Divide(argumentOne, argumentTwo);   // Creating the object of the relevant class
                break;
        }

        // Printing the value only in case Division was selected and argumentTwo is 0
        if (argumentTwo == 0 && operation == DIV) {
            mOut.print("Value Two cannot be 0, ie, cannot divide by 0");

        } else {
            calcOperation.calculate();                                      // Do the calculations
            mOut.print("" + calcOperation);                                 // Print the result, calls the overridden toString()
        }

    }

}
