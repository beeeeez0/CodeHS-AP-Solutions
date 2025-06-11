public class Chef
{
    private String name;
    private String restaurant;
    private Meal bestMeal;

    public Chef(String _name, String _restaurant, Meal _bestMeal) {
        name = _name;
        restaurant = _restaurant;
        bestMeal = _bestMeal;
    }

    public String getName() {
        return name;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getBestMealName() {
        return bestMeal.getName();
    }

    public int getBestMealServings() {
        return bestMeal.getServings();
    }

    public String getBestMealCourse() {
        return bestMeal.getCourse();
    }

    public String toString() {
        return "Chef " + name + " works at " + restaurant + " and is best known for " + bestMeal.getName() + " (" + bestMeal.getCourse() + ")";
    }

}