public class CoinTester
{
    public static void main(String[] args) {

        //Create your program here
        Coins bank = new Coins(4, 3, 2, 1);
        bank.bankValue();
        bank.addQuarter();
        bank.addQuarter();
        bank.addDime();
        bank.addDime();
        bank.addPenny();
        bank.bankCount();
        bank.bankValue();


    }
}