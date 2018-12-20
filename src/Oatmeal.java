public class Oatmeal extends MealDecorator {
    private final double PROTEIN_QCUP = 2.0;
    private final double CARB_QCUP = 14.0;
    private final double FAT_QCUP = 1.0;
    private double amount;

    public Oatmeal(Meal newMeal, double amount) {
        super(newMeal);
        this.amount = amount;
        System.out.println("Adding Oatmeal");
    }


    public String getDescription() {
        return tempMeal.getDescription() + "Oatmeal ";
    }

    public double getCalories() {
        return tempMeal.getCalories();
    }

    public double getProtein() {
        double totalProtein = amount * PROTEIN_QCUP;
        return tempMeal.getProtein() + totalProtein;
    }

    public double getCarbs() {
        double totalCarb = amount * CARB_QCUP;
        return tempMeal.getCarbs() + totalCarb;
    }

    public double getFats() {
        double totalFat = amount * FAT_QCUP;
        return tempMeal.getFats() + totalFat;
    }
}
