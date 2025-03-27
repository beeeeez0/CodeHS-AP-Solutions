public class WordGames
{
    private String word;

    public WordGames(String text)
    {
        word = text;
    }

    public String scramble()
    {
        // switch first half
        // and second half
        int length = word.length() / 2;
        String ns = word.substring(length);
        String s = word.substring(0, length);
        String newString = ns + s;
        return newString;

    }


    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        String fh = word.substring(0, insertIdx);
        String lh = word.substring(insertIdx);
        String newString = fh + insertText + lh;
        return newString;
    }


    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        String fh = word.substring(0, word.indexOf(insertChar));
        String lh = word.substring(word.indexOf(insertChar));
        String newString = fh + insertText + lh;
        return newString;
    }


    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }


}