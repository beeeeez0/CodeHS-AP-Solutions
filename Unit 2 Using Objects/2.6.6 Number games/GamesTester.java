public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(3);

        // Double the number
        double numDoub = game.doubleNumber();
        // Print it out
        System.out.println(numDoub);

        // Square the number
        double numSquare = game.squareNumber();
        // Print it out
        System.out.println(numSquare);

        // Double the number again
        // Print it out
        System.out.println(game.doubleNumber());

        // Get the number and store the value
        // Print it out to see that getNumber does
        // not modify the number
        System.out.println(game.getNumber());

    }
}