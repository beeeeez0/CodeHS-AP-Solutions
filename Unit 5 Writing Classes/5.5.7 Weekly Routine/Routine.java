public class Routine
{
    private double sleep;
    private double fun;
    private double school;
    private double sports;

    public Routine() {
        sleep = 0;
        fun = 0;
        school = 0;
        sports = 0;
    }

    public void setSleep(double hoursSleep) {
        sleep = hoursSleep;
    }

    public void setFun(double hoursFun) {
        fun = hoursFun;
    }

    public void setSchool(double hoursSchool) {
        school = hoursSchool;
    }

    public void setSports(double hoursSports) {
        sports = hoursSports;
    }

    public void printTotal() {
        double totalSleep = sleep*7.0;
        double totalFun = fun*7.0;
        double totalSchool = school*7.0;
        double totalSports = sports*7.0;
        double total = totalSleep+totalFun+totalSchool+totalSports;
        double leftOver = 168-total;

        System.out.println("Weekly Totals");
        System.out.println("Sleep: " + totalSleep);
        System.out.println("School: " + totalSchool);
        System.out.println("Sports: " + totalSports);
        System.out.println("Fun: " + totalFun);
        System.out.println("Grand Total: " + total);
        System.out.println("Hours left over: " + leftOver);

    }
}