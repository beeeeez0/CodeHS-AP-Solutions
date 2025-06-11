public class CalculatorTester
{
    public static void main(String[] args) {

        System.out.println("Starting at 5");
        Calculator myTi = new Calculator(5);

        System.out.println("Adding 10 ...");
        System.out.print("Should print 15.0: ");
        System.out.println(myTi.add(10));

        System.out.println("Subtracting 2 ...");
        System.out.print("Should print 13.0: ");
        System.out.println(myTi.subtract(2));

        System.out.println("Changing value to 20.5 ...");
        myTi.setValue(20.5);
        System.out.print("Adding. Should print 33.5: ");
        System.out.println(myTi.add());

    }
}