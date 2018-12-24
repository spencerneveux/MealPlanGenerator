public class Cashews extends MealDecorator {
    private final double PROTEIN_GRAMS = .18;
    private final double CARBS_GRAMS = 0.3;
    private final double FAT_GRAMS = .44;
    private double amount;

    public Cashews(Meal newMeal) {
        super(newMeal);
        System.out.println("Adding Cashews");
    }

    public Cashews (Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Cashews");
    }

    public String getDescription() {
        return tempMeal.getDescription() + "Cashews: " + amount + " Grams|";
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
