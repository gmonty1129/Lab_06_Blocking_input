import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0.0;
        double mpg = 0.0;
        double pricePerGallon = 0.0;
        double totalCost100 = 0.0;
        double totalDistance = 0.0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("How many gallons are in the tank?: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                if (gallons > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid input. Must be greater than 0.");
                    done = false;
                }
            } else {
                System.out.println("You said: " + trash + "Please enter a numeric value.");
                done = false;
            }
            in.nextLine();
        }while (!done);
        do {
            System.out.println("How many miles do you get per gallon?: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                if (mpg > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid input. Must be greater than 0.");
                    done = false;
                }
            } else {
                System.out.println("You said: " + trash + "Please enter a numeric value.");
                done = false;
            }
            in.nextLine();
        }while (!done);
        do {
            System.out.println("What is your price per gallon?: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                if (pricePerGallon > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid input. Must be greater than 0.");
                    done = false;
                }
            } else {
                System.out.println("You said: " + trash + "Please enter a numeric value.");
                done = false;
            }
            in.nextLine();
        }while (!done);
        totalCost100 = (100 / mpg) * pricePerGallon;
        totalDistance = gallons * mpg;
        System.out.printf("The cost to drive 100 miles is: " + totalCost100);
        System.out.println();
        System.out.printf("The car can go: " + totalDistance);
        in.close();
    }
}