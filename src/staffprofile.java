import java.util.Scanner; //import utility

public class staffprofile {
    public static void main(String[] args) {
        //have user input name, age, and salary
        // create scanner object
        Scanner object = new Scanner(System.in);

        System.out.println("Enter your name then age then salary to the system!");
        //collect all the variable
        System.out.println("Enter Staff name:");
        String name = object.nextLine();
        System.out.println("Enter Staff age:");
        int age = object.nextInt();
        System.out.println("Enter Staff salary:");
        double salary = object.nextDouble();

        System.out.print("Staff name = "+name);
        System.out.print(" Staff age = "+age);
        System.out.println(" Staff salary = "+salary);

    }
}
