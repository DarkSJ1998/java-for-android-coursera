import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class BirthdayProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int count = sc.nextInt();
        int size = 20;
        int count = 10000;
        new BirthdayProblem().process(size, count);
        sc.close();
    }

    public void process(int size, int count) {
        int groupSize = size;
        int simulationCount = count;

        if (groupSize < 2 || groupSize > 365) {
            System.out.println("Group Size must be in the range 2-365.");
            return;
        }
        if (simulationCount <= 0) {
            System.out.println("Simulation Count must be positive.");
            return;
        }
        double percent = calculate(groupSize, simulationCount);

        // report results
        System.out.println("For a group of " + groupSize + " people, the percentage");
        System.out.println("of times that two people share the same birthday is");
        System.out.println(String.format("%.2f%% of the time.", percent));

    }

    /**
     * This is the method that actually does the calculations.
     * <p>
     * We provide you this method that way we can test it with unit testing.
     */
    public double calculate(int size, int count) {
        // DONE -- add your code here

        // The variable to store the no. of times two people share same birthday
        int countOfSameBirthdays = countSameBirthdays(size, count);

        return (double) countOfSameBirthdays * 100 / count;
    }

    // DONE - add your code here

    // Method to calculate the no. of times two people share same birthday
    private int countSameBirthdays(int size, int count) {

        // The counter variable to store the no. of times two people share same birthday
        int countOfSameBirthdays = 0;

        for (int i = 0; i < count; i++) {

            // Used to store the birthdays of people
            // Set is used so that we can check if a birthday has already occurred or not
            Set<Integer> set = new HashSet<>();

            // Creating a new Random object with seed (i + 1)
            // eg. it should be 1 for the 1st run, ie, i = 0
            Random rand = new Random(i + 1);

            for (int j = 0; j < size; j++) {
                int n = rand.nextInt(365); // getting the next random int value
                if (set.contains(n)) { // if birthday is repeated
                    countOfSameBirthdays++;
                    break;
                }
                set.add(n);
            }
        }

        return countOfSameBirthdays;
    }
}
