public class Meal
{
    private String name;
    private String course;
    private int servings;


    public Meal(String _name, String _course, int _servings) {
        name = _name;
        course = _course;
        servings = _servings;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getServings() {
        return servings;
    }

    public String toString() {
        return name + " (" + course + ")";
    }
}