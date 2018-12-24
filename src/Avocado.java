public class Avocado extends MealDecorator {
    private final double PROTEIN_GRAMS = .02;
    private final double CARBS_GRAMS = 0.09;
    private final double FAT_GRAMS = .15;
    private double amount;

    public Avocado(Meal newMeal) {
        super(newMeal);
        System.out.println("Adding Avocado");
    }

    public Avocado (Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Avocado");
    }

    public String getDescription() {
        return tempMeal.getDescription() + "Avocado: " + amount + " Grams|";
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
