public class OliveOil extends MealDecorator{
    private final double PROTEIN_GRAMS = 0.0;
    private final double CARBS_GRAMS = 0.0;
    private final double FAT_GRAMS = 1.0;
    private double amount;

    public OliveOil(Meal newMeal) {
        super(newMeal);
        System.out.println("Adding Olive Oil");
    }

    public OliveOil (Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Olive Oil");
    }

    public String getDescription() {
        return tempMeal.getDescription() + "Olive Oil: " + amount + " Grams|";
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
