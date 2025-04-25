public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */

    public Student(String _firstName, String _lastName, int _gradeLevel, String _school) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.gradeLevel = _gradeLevel;
        this.school = _school;
    }

    public Student(String _firstName, String _lastName, int _gradeLevel) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.gradeLevel = _gradeLevel;
        if(gradeLevel >= 9 && gradeLevel <= 12) {
            this.school = "high school";
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            this.school = "middle school";
        } else {
            this.school = "elementary school";
        }
    }



    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     *
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }

    public String getFirstName(){
        return firstName;
    }
}