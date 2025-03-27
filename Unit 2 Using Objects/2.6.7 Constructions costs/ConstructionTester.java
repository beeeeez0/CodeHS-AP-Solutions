import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!

        Scanner input = new Scanner(System.in);
        System.out.println("Enter hte sales tax rate:");
        double tax = input.nextDouble();
        System.out.println("How many boards do you need?");
        int boards = input.nextInt();
        System.out.println("How much does each board cost?");
        double cost = input.nextDouble();
        ConstructionJob a = new ConstructionJob(cost, boards, tax);
        System.out.println("Total: " + a.total());
        System.out.println("Grand Total: " + a.grandTotal());
    }
}