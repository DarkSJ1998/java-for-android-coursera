package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // DONE - Put your code here.

    // Instance variables
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    // Parameterized Constructor #1
    public Building(int length, int width, int lotLength, int lotWidth) {
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }

    // Getter/Accessor method
    public int getLength() {
        return mLength;
    }

    // Setter/Mutator method
    public void setLength(int length) {
        this.mLength = length;
    }

    // Getter/Accessor method
    public int getWidth() {
        return mWidth;
    }

    // Setter/Mutator method
    public void setWidth(int width) {
        this.mWidth = width;
    }

    // Getter/Accessor method
    public int getLotLength() {
        return mLotLength;
    }

    // Setter/Mutator method
    public void setLotLength(int lotLength) {
        this.mLotLength = lotLength;
    }

    // Getter/Accessor method
    public int getLotWidth() {
        return mLotWidth;
    }

    // Setter/Mutator method
    public void setLotWidth(int lotWidth) {
        this.mLotWidth = lotWidth;
    }

    // Method to return the building area
    public int calcBuildingArea() {
        return mLength * mWidth;
    }

    // Method to return the lot area of the building
    public int calcLotArea() {
        return mLotLength * mLotWidth;
    }

    // Method to override the default toString() implementation
    @Override
    public String toString() {
        return "Building.toString() called (This function actually never gets called and is always overrriden in this problem statement)";
    }

}
