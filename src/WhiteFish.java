public class WhiteFish extends MealDecorator{
    private final double PROTEIN_OZ = 7.5;
    private final double FAT_OZ = .75;
    private double amount;

    public WhiteFish(Meal newMeal) {
        super(newMeal);
        System.out.println("Adding White Fish");
    }

    public WhiteFish (Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding White Fish");
    }

    public String getDescription() {
        return tempMeal.getDescription() + "White Fish: " + amount + "oz|";
    }

    public double getCalories() {
        return tempMeal.getCalories();
    }

    public double getProtein() {
        double totalProtein = amount * PROTEIN_OZ;
        return tempMeal.getProtein() + totalProtein;
    }

    public double getCarbs() {
        return tempMeal.getCarbs();
    }

    public double getFats() {
        double totalFat = amount * FAT_OZ;
        return tempMeal.getFats() + totalFat;
    }
}
