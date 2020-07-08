package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // DONE -- Fill your code in here

    public static final int HERD = 24;

    public void simulateHerd(Random rand) {
        int snailsPen = HERD;
        int snailsPasture = 0;

        mOut.print("There are currently ");
        mOut.print(snailsPen + " snails in the pen and ");
        mOut.println(snailsPasture + " snails in the pasture");

        for (int i = 0; i < 10; i++) {
            int gateNo;
            int noOfSnailsToMove;

            if (snailsPen == 0) {
                // Here we'll move some snails from Pasture into the Pen
                // via the West Gate

                noOfSnailsToMove = rand.nextInt(snailsPasture) + 1;
                snailsPen += mWestGate.thru(noOfSnailsToMove);

            } else if (snailsPasture == 0) {
                // Here we'll move some snails from Pen into the Pasture
                // via the East Gate

                noOfSnailsToMove = rand.nextInt(snailsPen) + 1;
                snailsPen += mEastGate.thru(noOfSnailsToMove);

            } else {

                gateNo = rand.nextInt(2);

                if (gateNo == 0) {   // west gate
                    noOfSnailsToMove = rand.nextInt(snailsPasture) + 1;
                    snailsPen += mWestGate.thru(noOfSnailsToMove);

                } else {            // east gate
                    noOfSnailsToMove = rand.nextInt(snailsPen) + 1;
                    snailsPen += mEastGate.thru(noOfSnailsToMove);

                }

            }

            snailsPasture = HERD - snailsPen;

            mOut.print("There are currently ");
            mOut.print(snailsPen + " snails in the pen and ");
            mOut.println(snailsPasture + " snails in the pasture");
        }
    }

}
