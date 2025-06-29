public class Student
{
    private static final int NUM_EXAMS = 4;

    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    private int[] exams;
    private int numExamsTaken;

    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     *
     * Check out StudentTester.java for an example of how to use
     * this constructor.
     */
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }

    public int getExamRange()
    {
        int min = 100;
        int max = 0;
        for(int grade : exams) {
            if(grade < min) {
                min = grade;
            }
            if(grade > max) {
                max = grade;
            }
        }

        return max - min;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }

    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }

    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}