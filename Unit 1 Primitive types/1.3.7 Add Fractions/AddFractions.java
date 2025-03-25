public class AddFractions
{
    public static void main(String[] args)
    {
        //Your code goes here!
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 5;
        String fraction1 = a + "/" + b;
        String fraction2 = c + "/" + d;
        System.out.println("The numerator of the first fraction is " + a);
        System.out.println("The denominator of the first fraction is " + b);
        System.out.println("The numerator of the first fraction is " + c);
        System.out.println("The denominator of the first fraction is " + d);

        int sumNum = (a*d + b*c);
        int sumDen = (b*d);
        String sum = sumNum + "/" + sumDen;
        System.out.println("The sum of " + fraction1 + " + " + fraction2 + " = " +sum);


    }
}