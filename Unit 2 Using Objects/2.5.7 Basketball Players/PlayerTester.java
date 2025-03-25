public class PlayerTester
{
    public static void main(String[] args) {

        //Start here
        BasketballPlayer a = new BasketballPlayer("Lebron James", "Lakers");
        BasketballPlayer b = new BasketballPlayer("Michael Jordan");

        a.addGame(5, 5);
        a.addGame(5, 5);
        a.addGame(5, 5);
        a.addGame(5, 5);

        b.addGame(5, 5);
        b.addGame(5, 5);
        b.addGame(5, 5);
        b.addGame(5, 5);


        System.out.println("Lebron James Stats:");
        a.printPPG();
        a.printAPG();
        System.out.println(a);
        System.out.println();

        System.out.println("Michael Jordan Stats:");
        b.printPPG();
        b.printAPG();
        System.out.println(b);
    }
}