import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        double meterMeasurement = 0.0;
        double miles;
        double feet;
        double inches;

        Scanner in = new Scanner(System.in);

        System.out.println("Please input a measurement in meters: ");
        if (in.hasNextDouble())
        {
            meterMeasurement = in.nextDouble();
            miles = meterMeasurement / 1609.34;
            System.out.println("Converting " + meterMeasurement + " to miles: " + miles + " miles.");

            feet = meterMeasurement * 3.28084;
            System.out.println("Converting " + meterMeasurement + " to feet: " + feet + " feet.");

            inches = meterMeasurement * 39.37007874;
            System.out.println("Converting " + meterMeasurement + " to feet: " + inches + " inches.");
            in.nextLine();

        }
        else {
            System.out.println("Bad input");
            System.exit(0);
        }
    }
}