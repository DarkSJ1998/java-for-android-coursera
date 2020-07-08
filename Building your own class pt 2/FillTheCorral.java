package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // DONE -- Fill your code in here

    public void setCorralGates(Gate[] gate, Random selectDirection) {
        mOut.println("Initial gate setup:");
        for (int i = 0; i < gate.length; i++) {
            gate[i].setSwing(-1 + selectDirection.nextInt(3));
            mOut.println("Gate " + i + ": " + gate[i].toString());
        }
    }

    public boolean anyCorralAvailable(Gate[] corral) {
        for (int i = 0; i < corral.length; i++) {
            int dir = corral[i].getSwingDirection();
            if (dir == Gate.IN)
                return true;
        }
        return false;
    }

    public int corralSnails(Gate[] corral, Random rand) {
        int snailsPasture = 5;
        int count = 0;

        while (snailsPasture > 0) {
            int gateNo = rand.nextInt(corral.length);
            int noOfSnailsToMove = rand.nextInt(snailsPasture) + 1;

            mOut.println(noOfSnailsToMove + " are trying to move through corral " + gateNo);
            snailsPasture -= corral[gateNo].thru(noOfSnailsToMove);
            count++;

        }

        mOut.println("It took " + count + " attempts to corral all of the snails.");

        return count;
    }

}
