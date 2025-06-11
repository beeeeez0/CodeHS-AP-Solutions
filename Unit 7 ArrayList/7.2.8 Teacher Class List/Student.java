import java.util.ArrayList;
public class Student
{
    private String name;
    private int grade;
    private static ArrayList<Student> classList = new ArrayList<Student>();
    //Implement classList here:

    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        classList.add(this);

    }

    public String getName()
    {
        return this.name;
    }

    // Add the classSize static method here
    public static int classSize() {
        return classList.size();
    }


    /*Don't change the code in this method!
    This method will print out all the Student names in the classList Array
    */
    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}