/*
 * d = (vi)(t)+((a*t^2)/2)
 * d = ?
 * vi = 0
 * t = 10
 * a = 9.8 [S]
 * d = (0)(10) + ((9.8*10^2)/2)
 * d = 980/2
 * d = 490m [S]
 *
 * d = (vf+vi)t/2
 * 490 = (vf + 0)10/2
 * 490 = 10vf/2
 * 490 = 5vf
 * 490/5 = 5vf/5
 * 98m/s [S] = vf
 */

public class FallingBodies
{
    public static void main(String[] args)
    {
        final double g = 9.8;
        double t = 10;
        // Start here!
        double h = .5*g*t*t;
        double v = g*t;
        System.out.println("The height of the cliff is " + h + " meters, the ball falls " + h + " meters towards the ground.");
        System.out.println("The velocity of the ball when it hits the ground is " + v + "m/s");

        /*
         * Since g is a final variable changing it causes a compilation error
         * However, if the acceleration of gravity was faster, objects would fall faster.
         * If the acceleration of gravity was slower, objects would fall slowers.
         *
         * When we decrease the time the height of the cliff is lower and the final velocity
         * is slower since there's less time for both of these to increase. If the time was higher
         * the ball would have to have fallen from higher up meaning the cliff height increases
         * and so does the speed.
         */
    }
}