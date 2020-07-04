import java.util.Scanner;

class DiamondGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        printDiamond(size);

        sc.close();
    }

    private static void printDiamond(int size) {

        int height, width;
        height = 2 * size;
        width = 2 * size + 1;
        int count = 0; // For storing the no. of dashes to print

        for (int i = 0; i <= height; i++) {

            if (i == 0 || i == height) {
                // Executes for the first and last rows

                for (int j = 0; j <= width; j++) {

                    // For printing the corners
                    if (j == 0 || j == width) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                }

            } else {
                // Proceed with printing middle rows

                char start, end; // used to store the ASCII characters

                if (i < height / 2) {
                    start = '/';
                    end = '\\';
                } else if (i == height / 2) {
                    start = '<';
                    end = '>';
                } else {
                    start = '\\';
                    end = '/';
                }

                // Calculating the no. of spaces that are to be printed at sides
                int noOfSpaces = width / 2 - i;
                if (noOfSpaces < 0)
                    noOfSpaces *= -1;

                // For printing starting pipe
                System.out.print("|");

                // For printing starting spaces
                for (int k = 0; k < noOfSpaces; k++) {
                    System.out.print(" ");
                }

                // Printing the diamond's left edge
                System.out.print(start);

                // Printing the pattern in between
                for (int k = 0; k < count; k++)
                    System.out.print(i % 2 == 0 ? "-" : "=");

                // Printing the diamond's right edge
                System.out.print(end);

                // For printing ending spaces
                for (int k = 0; k < noOfSpaces; k++) {
                    System.out.print(" ");
                }

                // For printing ending pipe
                System.out.print("|");

                // Incrementing the no. of dashes to print
                if (i < height / 2)
                    count += 2;
                else
                    count -= 2;
            }

            System.out.println();

        }

    }
}