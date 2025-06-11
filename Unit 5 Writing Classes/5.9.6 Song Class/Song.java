public class Song
{
    private String artist;
    private String title;
    private int seconds;

    public Song(String artist, String title, int seconds){
        this.artist = artist;
        this.title = title;
        this.seconds = seconds;
    }

    /**
     * Returns value of artist
     * @return artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets new value of artist
     * @param artist Updated artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Returns value of title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets new value of title
     * @param title Updated title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns value of seconds
     * @return seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Sets new value of seconds
     * @param seconds Updated seconds
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /**
     * Gets the time in minutes and seconds
     * @return time of song in MM:SS format
     */
    public String getTime() {
        int minutes = seconds/60;
        int leftover = (seconds % 60);
        return minutes + ":" + leftover;

    }

    /**
     * Create string representation of Song for printing
     * @return String of the song
     */
    @Override
    public String toString() {
        return "artist= " + artist + "\ntitle= " + title + "\nTime= " + getTime();
    }
}