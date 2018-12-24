import java.util.ArrayList;

public class MealPlanFactory {
    private ArrayList<Meal> meals = new ArrayList<>();
    private double protein;
    private double carbs;
    private double fats;
    private double bmrCalories;
    private double calories;

    public void createMealPlan(Client client) {
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


    public void createMeals(int numMeals) {
        //Determine macro per meal
        double proteinPerMeal = protein / numMeals;
        double carbPerMeal = carbs / numMeals;
        double fatPerMeal = fats / numMeals;

        //Create a factories
        ProteinFactory proteinFactory = new ProteinFactory();
        CarbFactory carbFactory = new CarbFactory();
        FatFactory fatFactory = new FatFactory();

        //Create the number of meals from param list
        for (int i = 0; i < numMeals; i++) {
            meals.add(new PlainMeal());
        }

        // Run through each meal and add appropriate macros
        for (int i = 0; i < meals.size(); i++) {

            // Create random number to choose food
            int randNum = (int)(Math.random()*4 + 1);

            Meal tempMeal = new PlainMeal();
            tempMeal = proteinFactory.addProtein(randNum, 6, tempMeal);
            tempMeal = carbFactory.addCarbs(randNum, 100, tempMeal);
            meals.set(i, tempMeal);
        }

        // Display Each meal
        int index = 1;
        for (Meal food : meals) {
            System.out.println("\nMeal " + index + ": " + "Protein: " + food.getProtein() + "g Carbs: "
                    + food.getCarbs() + "g Fats: " + food.getFats() + "g\n" + food.getDescription());
            index++;
        }

    }

    @Override
    public String toString() {
        return (String.format("Calories: %.2f Protein: %.2f Carbs: %.2f Fats: %.2f", calories, protein, carbs, fats));
    }
}
