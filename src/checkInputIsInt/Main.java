package checkInputIsInt;
import java.util.Scanner;

public class Main {
    static double rectangleWidth;
    static double rectangleLength;
    static double rectanglePerimeter;
    static double rectangleDiagonal;




    public static void main(String[] args) {
        System.out.println("What is the width of the rectangle?");
        Scanner width = new Scanner(System.in);
        if (width.hasNextDouble()) {
            rectangleWidth = width.nextDouble();
        }
        else {
            System.out.println("Invalid Input");
        }
        System.out.println("What is the length of the rectangle?");
        Scanner length = new Scanner(System.in);
        if (length.hasNextDouble()) {
            rectangleLength = length.nextDouble();
            if (rectangleLength == rectangleWidth) {
                System.out.println("Invalid Input");
            }
        }
        else {
            System.out.println("Invalid Input");
        }

        double rectanglePerimeter = (rectangleWidth + rectangleLength) * 2;
        double rectangleDiagonal = Math.sqrt ((rectangleWidth * rectangleWidth) + (rectangleLength * rectangleLength));
        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter + ".");
        System.out.println("The diagonal of the rectangle is " + rectangleDiagonal + ".");
    }

}