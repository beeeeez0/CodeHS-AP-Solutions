import java.util.*;

public class MarketingRunner {

    public static void main(String[] args){

        // Create an Arraylist of Orders and
        // populate it with the getOrders() method

        Orders manager = new Orders();
        ArrayList<GeoLocation> addresses = manager.getOrders(); // Get all the orders


        // Create an ArrayList of GeoLocations and add your 3 warehouses
        ArrayList<GeoLocation> warehouses = new ArrayList<>();
        warehouses.add(new GeoLocation("New York", 40.7144, -74.0039));
        warehouses.add(new GeoLocation("Atlanta", 33.7543, -84.3856));
        warehouses.add(new GeoLocation("Chicago", 41.8253, -87.6274));
        warehouses.add(new GeoLocation("Los Angeles", 33.9395, -118.2200));
        warehouses.add(new GeoLocation("Dallas", 32.8069, -96.8151));

        // Create variables to track total days and total miles
        double totalDays = 0;
        double totalMiles = 0;

        // Loop through each address and find the closest warehouse

        /* For each address, print which warehouse is closest,
           how far the warehouse is, and how many days to ship.
           Example:
           Closest warehouse: Atlanta
           Distance to closest: 682.9465210657681
           Days to ship: 2
        */

        // for(GeoLocation order : addresses) {
        for(int i = 0; i < addresses.size(); i++) {
            GeoLocation closestWarehouse = null; // Will assign it a value later on
            double minimumDistance = Double.MAX_VALUE; // Starting point for lower values


            for(GeoLocation warehouse : warehouses) {
                double distance = addresses.get(i).distanceFrom(warehouse);
                if(distance < minimumDistance) { // Distance should always be smaller than max value
                    minimumDistance = distance;
                    closestWarehouse = warehouse;
                }

            }

            int daysToShip = (int) ((minimumDistance / 400.0) + 0.5);
            totalDays += daysToShip; // Add to the variable after each iteration
            totalMiles += minimumDistance;

            System.out.println("Address " + (i+1));
            System.out.println("Closest warehouse: " + closestWarehouse.getName());
            System.out.println("Distance to closest: " + minimumDistance);
            System.out.println("Days to ship: " + daysToShip);
            System.out.println("*****************");

        }

        // Print the total days and total miles for all the addresses combined
        System.out.println("**** Total Days = " + totalDays); // Print final variable
        System.out.println("**** Total Miles = " + totalMiles);

    }
}