public abstract class MealDecorator implements Meal {
    protected Meal tempMeal;

    public MealDecorator(Meal newMeal) {
        tempMeal = newMeal;
    }

    public String getDescription() {
        return tempMeal.getDescription();
    }

    public double getCalories() {
        return tempMeal.getCalories();
    }

    public double getProtein() {
        return tempMeal.getProtein();
    }

    public double getCarbs() {
        return tempMeal.getCarbs();
    }

    public double getFats() {
        return tempMeal.getFats();
    }
}
