public class WholeEgg extends MealDecorator{
    private final double PROTEIN_GRAM = .13;
    private final double CARB_GRAM = 0.01;
    private final double FAT_GRAM = .11;
    private double amount;

    public WholeEgg(Meal newMeal) {
        super(newMeal);
        System.out.println("Adding Whole Egg");
    }

    public WholeEgg(Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Whole Egg");
    }

    public String getDescription() {
        return tempMeal.getDescription() + "Whole Egg " + amount + " Grams|";
    }

    public double getCalories() {
        return tempMeal.getCalories();
    }

    public double getProtein() {
        double totalProtein = amount * PROTEIN_GRAM;
        return tempMeal.getProtein() + totalProtein;
    }

    public double getCarbs() {
        double totalCarbs = amount * CARB_GRAM;
        return tempMeal.getCarbs() + totalCarbs;
    }

    public double getFats() {
        double totalFat = amount * FAT_GRAM;
        return tempMeal.getFats() + totalFat;
    }
}
