import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do

        //To get started, create a new Calculator object
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles");
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();

        calc.add(d1, d2);
        calc.subtract(d1, d2);
        calc.multiply(d1, d2);
        calc.divide(d1, d2);

    }
}