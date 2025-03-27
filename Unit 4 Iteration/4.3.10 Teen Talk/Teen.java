public class Teen
{
    private String firstName;
    private String lastName;
    private int grade;

    public Teen(String theFirstName, String theLastName, int theGrade)
    {
        firstName = theFirstName;
        lastName = theLastName;
        grade = theGrade;
    }

    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + grade + " and wants to send this text:";
    }
    public String teenTalk(String text)
    {
        return text.replace(" ", " like ");
    }

}