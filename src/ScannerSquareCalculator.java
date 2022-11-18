import java.util.Scanner; //import the scanner

public class ScannerSquareCalculator {
    public static void main(String[] args) {
        //this calculator will calculate the perimeter and area of a square.
        //we first create the scanner object
        Scanner myObj = new Scanner(System.in);
        //then collect the user inputs
        System.out.println("Enter the width ");
        double width = myObj.nextDouble(); //reading user input, width

        System.out.println("Enter the height ");
        double height = myObj.nextDouble(); //reading user input, height

        // now create the calculations for perimeter and area
        double perimeter = (height * 2 + width * 2 );
        double area = width * height;

        //print everything out
        System.out.print("The height is " + height);
        System.out.println(" The width is " + width);
        System.out.println("The perimeter of the shape is " + perimeter);
        System.out.println("The area of the shape is " + area);
    }
}
