public class Classroom
{
    Student[] students;
    int numStudentsAdded;

    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }

    public Student getMostImprovedStudent()
    {
        int range = 0;
        int index = 0;

        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                break;
            } else if(students[i].getExamRange() > range) {
                index = i;
                range = students[i].getExamRange();
            }
        }

        return students[index];
        // your code goes here!
    }

    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }

    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}