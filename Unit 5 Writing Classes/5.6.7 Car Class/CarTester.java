public class CarTester {

    public static void main(String[] args) {

        // Create a car with 4000 miles and oil change and tires at 0
        Car a = new Car(4000, 0, 0);

        // Drive 500 miles
        a.drive(500);


        // Check when the next Oil change and tire rotation are due
        a.nextOilChange();
        a.nextTireRotation();

        // Change oil
        a.changeOil();


        // drive 6000 miles
        a.drive(6000);


        // Check if a tire rotation is needed
        a.needsTireRotation();


        // Rotate the tires.
        a.rotateTires();

    }
}