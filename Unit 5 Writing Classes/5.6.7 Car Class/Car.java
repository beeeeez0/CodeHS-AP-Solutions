public class Car {

    // Start here
    private int totalMiles;
    private int lastOilChange;
    private int lastTireRotation;

    public Car(int miles, int oil, int tires) {
        totalMiles = miles;
        lastOilChange = oil;
        lastTireRotation = tires;
    }

    public void needsOilChange() {
        boolean eval = (totalMiles - lastOilChange) > 5000;
        System.out.println("Needs Oil Change: " + eval);
    }

    public void changeOil() {
        lastOilChange = totalMiles;
        System.out.println("Oil Changed.");
    }

    public void nextOilChange() {
        int nextChange = lastOilChange + 5000;
        int remaining = nextChange - totalMiles;
        System.out.println("Next Oil Change Due at: " + nextChange);
        System.out.println("That is in " + remaining + " miles.");
    }

    public void needsTireRotation() {
        boolean eval = (totalMiles - lastTireRotation) > 10000;
        System.out.println("Needs Tire Rotation: " + eval);
    }

    public void rotateTires() {
        lastTireRotation = totalMiles;
        System.out.println("Tires Rotated.");
    }

    public void nextTireRotation() {
        int nextChange = lastTireRotation + 10000;
        int remaining = nextChange - totalMiles;
        System.out.println("Next Tire Rotation Due at: " + nextChange);
        System.out.println("That is in " + remaining + " miles.");
    }

    public void drive(int miles) {
        totalMiles += miles;
        System.out.println(miles + " miles driven.");
    }
}