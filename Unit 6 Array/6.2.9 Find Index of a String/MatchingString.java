public class MatchingString
{

    public static int findString(String[] myArray, String myString)
    {
        for(int i = 0; i < myArray.length; i++) {
            if(myArray[i].equals(myString)) {
                return i;

            }
        }

        return -1;
    }
}