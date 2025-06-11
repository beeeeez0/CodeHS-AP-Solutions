import java.util.ArrayList;

public class Student
{
    private String name;
    private int grade;
    private static ArrayList<Student> classList = new ArrayList<Student>();

    //Copy over your class list implementation and
    // constructor from the previous exercise

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


    // Copy over your classSize from the previous exercise
    public static int classSize() {
        return classList.size();
    }

    // Add the additional static methods here:

    public static String getLastStudent() {
        String name = classList.get(classList.size()-1).getName();
        return name;
    }

    public static String getFirstStudent() {
        String name = classList.get(0).getName();
        return name;
    }

    public static void addStudent(int index, Student name) {
        classList.add(index, name);
        classList.remove(classList.size()-1);
    }

    public static String getStudent(int index) {
        return classList.get(index).getName();
    }


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