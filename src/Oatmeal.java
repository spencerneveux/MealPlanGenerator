public class Oatmeal extends MealDecorator {
    private final double PROTEIN_GRAM = .024;
    private final double CARB_GRAM = .12;
    private final double FAT_GRAM = 0.014;
    private double amount;

    public Oatmeal(Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Oatmeal");
    }


    public String getDescription() {
        return tempMeal.getDescription() + "Oatmeal: " + amount + " Grams|";
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
