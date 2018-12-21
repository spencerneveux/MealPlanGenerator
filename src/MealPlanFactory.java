public class MealPlanFactory {
    private double protein;
    private double carbs;
    private double fats;
    private double bmrCalories;
    private double calories;

    public void createMealPlan(Client client) {
        Meal meal = null;

        // Determine BMR
        if (client.getGender().equals("male")) {
            bmrCalories = 66 + (6.23 * client.getWeight()) + (12.7 * client.getHeight() * 12) - (6.76 * client.getAge());
        }else {
            bmrCalories = 65.5 + (4.35 * client.getWeight()) + (4.7 * client.getHeight() * 12) - (4.7 * client.getAge());
        }

        //Determine Calories based off Activity Level
        if (client.getActivityLevel().equals("little")) {
            calories = bmrCalories * 1.2;
        }else if (client.getActivityLevel().equals("light")) {
            calories = bmrCalories * 1.375;
        }else if (client.getActivityLevel().equals("medium")) {
            calories = bmrCalories * 1.55;
        }else if (client.getActivityLevel().equals("hard")) {
            calories = bmrCalories * 1.725;
        }else if (client.getActivityLevel().equals("intense")) {
            calories = bmrCalories * 1.9;
        }

        if (client.getMealPlanType().equals("keto")) {
            protein = calories * (.15) / 4;
            fats = calories * (.75) / 9;
            carbs = calories * (.05) / 4;
        }else if (client.getMealPlanType().equals("fat loss")) {
            calories -= 500;
            protein = calories * (.50) / 4;
            carbs = calories * (.40) / 4;
            fats = calories * (.1) / 9;
        }else if (client.getMealPlanType().equals("bulking")) {
            calories += 500;
            protein = calories * (.45) / 4;
            carbs = calories * (.50) / 4;
            fats = calories * (.05) / 9;
        }
    }

    @Override
    public String toString() {
        return (String.format("Calories: %.2f Protein: %.2f Carbs: %.2f Fats: %.2f", calories, protein, carbs, fats));
    }

}
