public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        SchoolClub club = new SchoolClub(alan, "Science club");

        System.out.println(club);

        System.out.println(alan);
        System.out.println(ada);


    }
}