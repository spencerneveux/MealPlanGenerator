public class PeanutButter extends MealDecorator {
    private final double PROTEIN_GRAMS = .25;
    private final double CARBS_GRAMS = 0.2;
    private final double FAT_GRAMS = .5;
    private double amount;

    public PeanutButter(Meal newMeal) {
        super(newMeal);
        System.out.println("Adding Peanut Butter");
    }

    public PeanutButter (Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Peanut Butter");
    }

    public String getDescription() {
        return tempMeal.getDescription() + "Peanut Butter: " + amount + " Grams|";
    }

    public double getCalories() {
        return tempMeal.getCalories();
    }

    public double getProtein() {
        double totalProtein = amount * PROTEIN_GRAMS;
        return tempMeal.getProtein() + totalProtein;
    }

    public double getCarbs() {
        double totalCarbs = amount * CARBS_GRAMS;
        return tempMeal.getCarbs() + totalCarbs;
    }

    public double getFats() {
        double totalFat = amount * FAT_GRAMS;
        return tempMeal.getFats() + totalFat;
    }

}
