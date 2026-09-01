import java.util.Scanner;

public class AreaCalculator {
    
/** 
 * @param args radius of the circle
 * 
*/
  public static void areaOfCircle(String[] args) {
    System.out.print("Enter the radius of the circle: ");
    Scanner scanner = new Scanner(System.in);
    double radius = scanner.nextDouble();
    double area = Math.PI * radius * radius;

    System.out.println("Area of circle: " + area);
    System.out.println("\n");
  }

  /** 
 * @param args base and height of the triangle
 */

  public static void areaOfTriangle(String[] args) {
    System.out.print("Enter the base of the triangle: ");
    Scanner scanner = new Scanner(System.in);
    double base = scanner.nextDouble();
    System.out.print("Enter the height of the triangle: ");
    double height = scanner.nextDouble();
    double area = 0.5 * base * height;

    System.out.println("Area of triangle: " + area);
    System.out.println("\n");
  }
    /**
     *  @param args side of the square
     */
  public static void areaOfSquare(String[] args) {
    System.out.print("Enter the side of the square: ");
    Scanner scanner = new Scanner(System.in);
    double side = scanner.nextDouble();
    double area = side * side;
    System.out.println("Area of square: " + area);
    System.out.println("\n");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Choose a shape to calculate area:");
      System.out.println("1. Circle");
      System.out.println("2. Triangle");
      System.out.println("3. Square");
      System.out.println("4. Quit Program");
      System.out.print("Enter your choice: ");
      System.out.println("\n");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          areaOfCircle(args);
          break;
        case 2:
          areaOfTriangle(args);
          break;
        case 3:
          areaOfSquare(args);
          break;
        case 4:
          System.out.println("Exiting program.");
          scanner.close();
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}
