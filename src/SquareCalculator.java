public class SquareCalculator {
    public static void main(String[] args) {
        //this calculator will calculate the perimeter and area of a square.
       double height = 25.3;
       double width = 13.5;

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
