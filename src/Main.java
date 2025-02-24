import java.util.Scanner;
class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cTemp = 0.0;
        double fTemp = 0.0;
        String trash = "";
        int BOIL_POINT = 100;
        int FREEZE_POINT = 0;
        boolean done = false;
        do
        {
            System.out.println("Enter a temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                cTemp = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid Input. Please enter a numeric value: " + trash);
            }
        }while(!done);
        fTemp = (cTemp * 9 / 5) + 32;
        System.out.println("Equivalent temperature in Fahrenheit: " + fTemp);
        cTemp = 0;
        System.out.println("The freezing point of water is: " + FREEZE_POINT);
        cTemp = 100;
        System.out.println("The boiling point of water is: " + BOIL_POINT);
        in.close();
    }
}