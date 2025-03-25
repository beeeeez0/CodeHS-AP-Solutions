public class IntegerOverflow
{
    public static void main(String[] args)
    {
        // Start here!
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE-1);
        System.out.println(Integer.MAX_VALUE+1);

        /*
         * It didn't really surprise me, I expected that it would either print zero
         * or just the opposite.
         *
         * I think that since Java has a 32bit size limit, adding 1 or subtracting 1
         * causes an overflow and exceeds the limit, so it chooses to restart as the only other possible value.
         */
    }
}