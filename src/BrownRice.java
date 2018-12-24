public class BrownRice extends MealDecorator {
    private final double PROTEIN_GRAM = .026;
    private final double CARB_GRAM = .23;
    private final double FAT_GRAM = 0.009;
    private double amount;

    public BrownRice(Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Brown Rice");
    }


    public String getDescription() {
        return tempMeal.getDescription() + "Brown Rice: " + amount + " Grams|";
    }

    public double getCalories() {
        return tempMeal.getCalories();
    }

    public double getProtein() {
        double totalProtein = amount * PROTEIN_GRAM;
        return tempMeal.getProtein() + totalProtein;
    }

    public double getCarbs() {
        double totalCarb = amount * CARB_GRAM;
        return tempMeal.getCarbs() + totalCarb;
    }

    public double getFats() {
        double totalFat = amount * FAT_GRAM;
        return tempMeal.getFats() + totalFat;
    }
}
