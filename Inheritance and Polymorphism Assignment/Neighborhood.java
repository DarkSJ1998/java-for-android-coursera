package mooc.vandy.java4android.buildings.logic;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    // DONE - Put your code here.

    // Static method
    public static void print(Building[] buildings, String header, OutputInterface out) {
        out.println(header);
        out.println("----------");
        for (Building building : buildings) {
            out.println(building.toString());
        }

        out.println("Total neighborhood area: " + calcArea(buildings));
    }

    // Static method to sum the lot areas of all buildings and return it
    public static int calcArea(Building[] buildings) {
        int totalLotArea = 0;
        for (Building building : buildings) {
            totalLotArea += building.calcLotArea();
        }
        return totalLotArea;
    }

}
