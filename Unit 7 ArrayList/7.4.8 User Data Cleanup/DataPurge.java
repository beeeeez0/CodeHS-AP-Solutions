import java.util.ArrayList;

public class DataPurge {

    // 1. removeDuplicates - without HashSet, using nested loops
    public static void removeDuplicates(ArrayList<String> emails) {
        for (int i = 0; i < emails.size(); i++) {
            String current = emails.get(i);
            // Check for duplicates *after* current index
            for (int j = i + 1; j < emails.size(); ) {
                if (emails.get(j).equals(current)) {
                    System.out.println("Removing duplicate email: " + emails.get(j));
                    emails.remove(j);  // remove duplicate, don't increment j
                } else {
                    j++;  // only increment if no removal
                }
            }
        }
    }

    // 2. removeAOL - same as before, no iterators
    public static void removeAOL(ArrayList<String> emails) {
        for (int i = 0; i < emails.size(); ) {
            String email = emails.get(i);
            if (email.toLowerCase().endsWith("@aol.com")) {
                System.out.println("Removing AOL email: " + email);
                emails.remove(i);
            } else {
                i++;
            }
        }
    }

    // 3. containsOnlyEmails - unchanged
    public static boolean containsOnlyEmails(ArrayList<String> emails) {
        for (String email : emails) {
            if (!(email.contains("@") && email.contains("."))) {
                return false;
            }
        }
        return true;
    }
}