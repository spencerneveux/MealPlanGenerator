public class Beef extends MealDecorator{
    private final double PROTEIN_OZ = 7.3;
    private final double FAT_OZ = 4.3;
    private double amount;

    public Beef(Meal newMeal) {
        super(newMeal);
        System.out.println("Adding Beef");
    }

    public Beef (Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Beef");
    }

    public String getDescription() {
        return tempMeal.getDescription() + "Beef: " + amount + "oz|";
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
