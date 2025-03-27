import java.util.Scanner;

public class HowFarAway
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        double lat1 = input.nextDouble();
        System.out.print("\nEnter the longitude of the starting location: ");
        double lon1 = input.nextDouble();
        System.out.println("\nEnter the latitude of the ending location: ");
        double lat2 = input.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        double lon2 = input.nextDouble();
        GeoLocation a = new GeoLocation(lat1, lon1);
        GeoLocation b = new GeoLocation(lat2, lon2);

        System.out.println("The distance is " + a.distanceFrom(b) + " miles.");
    }
}