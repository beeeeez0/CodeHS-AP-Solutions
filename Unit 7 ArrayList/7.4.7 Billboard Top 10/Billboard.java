import java.util.ArrayList;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();

    public void add(Musician artist) {

        if(artist.isEligible()) {
            if(top10.size() < 10) {
                top10.add(artist);
            } else {
                replace(artist);
            }
        } else {
            System.out.println("Sorry, " + artist.getName() + " does not qualify for Top 10");
        }

    }

    public void replace(Musician artist) {
        int lowestIndex = 0;
        for (int i = 0; i < top10.size(); i++) {
            if (top10.get(i).getAlbumsSold() < top10.get(lowestIndex).getAlbumsSold()) {
                lowestIndex = i;
            }
        }


        if (artist.getAlbumsSold() > top10.get(lowestIndex).getAlbumsSold()) {
            System.out.println("The musician " + top10.get(lowestIndex).getName() + " has been replaced by " + artist.getName() + ".");
            top10.set(lowestIndex, artist);
        } else {
            System.out.println("Sorry, " + artist.getName() + " has less albums sold than the other musicians.");
        }
    }




    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}