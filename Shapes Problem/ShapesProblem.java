import java.util.Scanner;

public class ShapesProblem {
  private static double mRadius = 0;
  private static double mLength = 0;
  private static double mWidth = 0;
  private static double mHeight = 0;

  public static void main(String[] args) {
    ShapesProblem shapesProblem = new ShapesProblem();
    Scanner sc = new Scanner(System.in);

    System.out.println("Please proceed by entering the following values:");

    System.out.print("Length\t: ");
    mLength = sc.nextDouble();
    System.out.print("Width\t: ");
    mWidth = sc.nextDouble();
    System.out.print("Height\t: ");
    mHeight = sc.nextDouble();
    System.out.print("Radius\t: ");
    mRadius = sc.nextDouble();

    System.out.println(
      "\nValid Shape Types are 'Box', 'Rectangle', 'Sphere', 'Circle', 'Triangle'"
    );
    System.out.print("Shape Type\t: ");
    String shapeForCalculations = sc.next();

    shapesProblem.process(shapeForCalculations);

    sc.close();
  }

  public void process(String shapeForCalculations) {
    // Determine which calculation to process right now. Again,
    // do not worry about the specifics of how this works for now.
    switch (shapeForCalculations) {
      case "Box":
        System.out.print(
          "A " +
          mLength +
          " by " +
          mWidth +
          " by " +
          mHeight +
          " box has a volume of: "
        );
        System.out.println(
          "" + String.format("%.2f", boxVolume(mLength, mWidth, mHeight))
        );
        System.out.println("");

        System.out.print(
          "A " +
          mLength +
          " by " +
          mWidth +
          " by " +
          mHeight +
          " box has a surface area of: "
        );
        System.out.println(
          "" + String.format("%.2f", boxSurfaceArea(mLength, mWidth, mHeight))
        );
        System.out.println("");
      // If you are paying attention, you will notice that
      // there is no 'break;' here like there is in other
      // places, meaning that if 'Box' was selected, it will
      // run the two sets of print statements above and the
      // two statements below until the 'break;' statement.
      case "Rectangle":
        System.out.print(
          "A " + mLength + " by " + mWidth + " rectangle has a perimeter of: "
        );
        System.out.println(
          "" + String.format("%.2f", rectanglePerimeter(mLength, mWidth))
        );
        System.out.println("");

        System.out.print(
          "A " + mLength + " by " + mWidth + " rectangle has area of: "
        );
        System.out.println(
          "" + String.format("%.2f", rectangleArea(mLength, mWidth))
        );
        System.out.println("");
        break;
      case "Sphere":
        System.out.print(
          "A sphere with radius " + mRadius + " has a volume of: "
        );
        System.out.println("" + String.format("%.2f", sphereVolume(mRadius)));
        System.out.println("");

        System.out.print(
          "A sphere with radius " + mRadius + " has surface area of: "
        );
        System.out.println(
          "" + String.format("%.2f", sphereSurfaceArea(mRadius))
        );
        System.out.println("");
      // Same here as with 'Box' above. If 'Sphere' is picked, it will run the
      // two sets of print statements above and the two below until the 'break;'
      case "Circle":
        System.out.print(
          "A circle with radius " + mRadius + " has a perimeter of: "
        );
        System.out.println(
          "" + String.format("%.2f", circleCircumference(mRadius))
        );
        System.out.println("");

        System.out.print("A circle with radius " + mRadius + " has area of: ");
        System.out.println("" + String.format("%.2f", circleArea(mRadius)));
        System.out.println("");
        break;
      case "Triangle":
        System.out.print(
          "A right triangle with base " +
          mLength +
          " and height " +
          mWidth +
          " has a perimeter of: "
        );
        System.out.println(
          "" + String.format("%.2f", rightTrianglePerimeter(mLength, mWidth))
        );
        System.out.println("");

        System.out.print(
          "A right triangle with base " +
          mLength +
          " and height " +
          mWidth +
          " has area of: "
        );
        System.out.println(
          "" + String.format("%.2f", rightTriangleArea(mLength, mWidth))
        );
        System.out.println("");
        break;
      default:
        System.out.println("Invalid shape type entered.");
        break;
    }
  }

  // DONE -- add your code here

  // method to return the Area of Rectangle, length * width
  public static double rectangleArea(double length, double width) {
    return (length * width);
  }

  // method to return the Perimeter of Rectangle, 2 * (length + width)
  public static double rectanglePerimeter(double length, double width) {
    return 2 * (length + width);
  }

  // method to return the Area of Circle, pi * radius^2
  public static double circleArea(double radius) {
    return (Math.PI * radius * radius);
  }

  // method to return the Circumference of Circle, 2 * pi * radius
  public static double circleCircumference(double radius) {
    return (2 * Math.PI * radius);
  }

  // method to return the Area of Triangle, (base * height) / 2
  public static double rightTriangleArea(double base, double height) {
    return (base * height) / 2;
  }

  // method to return the Perimeter of Triangle, (base + height + hypotenuse)
  public static double rightTrianglePerimeter(double base, double height) {
    // First we'll calculate the length of hypotenuse
    // using Pythagoras Theorem, height^2 = base^2 + height^2
    double hypotenuse = Math.sqrt(base * base + height * height);
    return (base + height + hypotenuse);
  }

  // method to return the Volume of Box, (length * width * depth)
  public static double boxVolume(double length, double width, double depth) {
    return (length * width * depth);
  }

  // method to return the Surface Area of Box, 2 * (l*w + w*d + d*l)
  public static double boxSurfaceArea(
    double length,
    double width,
    double depth
  ) {
    return 2 * (length * width + width * depth + depth * length);
  }

  // method to return the Volume of Sphere, (4 / 3) * pi *(r^3)
  public static double sphereVolume(double radius) {
    return 4 * (Math.PI * Math.pow(radius, 3)) / 3;
  }

  // method to return the Surface Area of Sphere, 4 * pi * (r^2)
  public static double sphereSurfaceArea(double radius) {
    return 4 * (Math.PI * radius * radius);
  }
}
