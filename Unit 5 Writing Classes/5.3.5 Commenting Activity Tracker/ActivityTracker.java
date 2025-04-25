public class ActivityTracker
{
    public static void main(String[] args)
    {
        // Creating new ActivityLog object
        ActivityLog mylog = new ActivityLog();

        mylog.addMiles(5); // Adding 5 miles
        mylog.addHours(1); // Adding 1 hour

        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());

        double hoursToday = mylog.getHours();

        mylog.addHours(1.5); // Adding 1.5 hours
        mylog.addHours(3); // Adding 3 hours

        double increase = mylog.getHours() - hoursToday; // Finding difference

        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}