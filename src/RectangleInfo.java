import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double exponents = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("What is the length of the rectangle in ?: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a numeric value.");
            }
        }while(!done);


        do {
            System.out.println("What is the width of the rectangle?: ");
            if(in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a numeric value.");
            }
        }while(!done);


        exponents = length * length + width * width;
        area = length * width;
        perimeter = length + length + width + width;
        diagonal = Math.sqrt(exponents);
        System.out.printf("The area is: " + area);
        System.out.println();
        System.out.printf("The perimeter is: " + perimeter);
        System.out.println();
        System.out.printf("The diagonal is: " + diagonal);
        in.close();
    }
}