public class Potato extends MealDecorator {
    private final double PROTEIN_GRAM = .02;
    private final double CARB_GRAM = .17;
    private final double FAT_GRAM = 0.0;
    private double amount;

    public Potato(Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Potato");
    }


    public String getDescription() {
        return tempMeal.getDescription() + "Potato: " + amount + " Grams|";
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
