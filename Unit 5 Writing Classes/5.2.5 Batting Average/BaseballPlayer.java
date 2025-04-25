public class BaseballPlayer
{
    private int hits;
    private int walks;
    private int atBats;
    private String name;

    //Add constructor here
    public BaseballPlayer(String _name, int _hits, int _walks, int _atBats) {
        hits = _hits;
        walks = _walks;
        atBats = _atBats;
        name = _name;
    }

    public void printBattingAverage()
    {
        double battingAverage = hits / (double) atBats;
        System.out.println(battingAverage);
    }

    public void printOnBasePercentage() {
        double obp = (double) (hits + walks) / (atBats + walks);
        System.out.println(obp);
    }

    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }


}