public class Grammar
{
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word there
        // instead of their.

        // Call the method useProperGrammar to process the string according to
        // the directions.
        System.out.println(useProperGrammar("Is this a test"));
        System.out.println(useProperGrammar("Is this there test"));
        System.out.println(useProperGrammar("Is there a bathroom over there"));
        System.out.println(useProperGrammar("there there there there there"));

    }

    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace
        // every there with the word their.
        String target = "there";
        String replacement = "their";
        String[] words = theText.split(" ");

        int count = 0;

        for(int i = 0; i < words.length; i++) {
            if(words[i].equals(target)) {
                words[i] = replacement;
                count++;
            }
        }

        String correctedText = String.join(" ", words);

        if(count > 0) {
            System.out.println("Fixed " + count + " grammatical errors:");
        }  else {
            System.out.println("Fixed 0 grammatical errors:");
        }

        return correctedText;
    }
}