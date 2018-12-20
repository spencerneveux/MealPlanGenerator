public class GroundTurkey extends MealDecorator {
    private final double PROTEIN_OZ = 8.0;
    private final double FAT_OZ = 3.0;
    private double amount;

    public GroundTurkey(Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Ground Turkey");
    }

    public String getDescription() {
        return tempMeal.getDescription() + "Ground Turkey ";
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
