import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself
        // what you need to do
        Calculator a = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles");
        double d1 = input.nextDouble();
        System.out.println();
        double d2 = input.nextDouble();
        System.out.println(d1 + " + " + d2 + " = " + a.add(d1, d2));
        System.out.println(d1 + " - " + d2 + " = " + a.subtract(d1, d2));
        System.out.println(d1 + " * " + d2 + " = " + a.multiply(d1, d2));
        System.out.println(d1 + " / " + d2 + " = " + a.divide(d1, d2));
    }
}