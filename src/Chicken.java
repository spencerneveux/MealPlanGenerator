public class Chicken extends MealDecorator{
    private final double PROTEIN_OZ = 7.0;
    private final double FAT_OZ = 1.0;
    private double amount;

    public Chicken (Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Chicken");
    }

    public String getDescription() {
        return tempMeal.getDescription() + "Chicken ";
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
