public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles

        // Generate a random acceleration for each car
        Double accA = (Math.random() * (101) + 1);
        Double accB = (Math.random() * (101) + 1);

        // Create two Racecar objects
        RaceCar mike = new RaceCar("Mike", accA);
        RaceCar julio = new RaceCar("Julio", accB);
        // Compute the finishing times for both cars
        System.out.println("First car finished in " + mike.computeTime(2414) + " seconds");
        System.out.println("First car finished in " + julio.computeTime(2414) + " seconds");


        // Print times of each car

    }
}