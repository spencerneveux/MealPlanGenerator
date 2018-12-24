import java.util.ArrayList;
import java.util.Scanner;

public class MealPlanGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;

        do {
            //Print out Main menu and get user choice
            System.out.println(mainMenu());
            userInput = input.nextInt();

            // Decide what Main Menu Option
            if (userInput == 1) {
                // Custom Meal option
                int secondUserInput;
                Meal meal = new PlainMeal();

                //Creat arraylist of meals
                ArrayList<Meal> meals = new ArrayList<>();

                do {
                    //Print out options for custom meal
                    System.out.println(customMealPlanMenu());
                    secondUserInput = input.nextInt();

                    // Determine what type of macro to choose from
                    switch (secondUserInput) {
                        case 1:
                            //Display Protein menu and collect user input
                            System.out.println(proteinMenu());
                            int proteinInput = input.nextInt();

                            //If user enters 5 exit protein menu
                            if (proteinInput == 6)
                                break;

                            //Collect amount of protein chosen
                            System.out.println("Amount(oz): ");
                            double proteinAmount = input.nextDouble();

                            //Generate protein factory and add choice to meal
                            ProteinFactory proteinFactory = new ProteinFactory();
                            meal = proteinFactory.addProtein(proteinInput, proteinAmount, meal);
                            System.out.println("\nMeal\n"  + "Protein: " + meal.getProtein() + "g Carbs: "
                                    + meal.getCarbs() + "g Fats: " + meal.getFats() + "g\n" + meal.getDescription() +"\n");
                            break;
                        case 2:
                            //Display Carb menu and collect user input
                            System.out.println(carbMenu());
                            int carbInput = input.nextInt();

                            //If user enters exit carb menu
                            if (carbInput == 5)
                                break;

                            //Collect amount of carbs chosen
                            System.out.println("Amount(Grams): ");
                            double carbAmount = input.nextDouble();

                            //Generate Carb factory and add choice to meal
                            CarbFactory carbFactory = new CarbFactory();
                            meal = carbFactory.addCarbs(carbInput, carbAmount, meal);
                            System.out.println("\nMeal\n"  + "Protein: " + meal.getProtein() + "g Carbs: "
                                    + meal.getCarbs() + "g Fats: " + meal.getFats() + "g\n" + meal.getDescription() + "\n");
                            break;
                        case 3:
                            //Display Fat menu and collect user input
                            System.out.println(fatMenu());
                            int fatInput = input.nextInt();

                            //If user enters exit, break
                            if (fatInput == 5)
                                break;

                            //Collect amount of fat chosen
                            System.out.println("Amount(Grams): ");
                            double fatAmount = input.nextDouble();

                            //Generate Fat Factory and add choice to meal
                            FatFactory fatFactory = new FatFactory();
                            meal = fatFactory.addFat(fatInput, fatAmount, meal);
                            System.out.println("\nMeal\n"  + "Protein: " + meal.getProtein() + "g Carbs: "
                                    + meal.getCarbs() + "g Fats: " + meal.getFats() + "g\n" + meal.getDescription() + "\n");
                            break;
                        case 4:
                            System.out.println("Adding to Meal Plan");
                            meals.add(meal);
                            meal = new PlainMeal();
                            int index = 1;
                            for (Meal food : meals) {
                                System.out.println("\nMeal " + index + ": " + "Protein: " + food.getProtein() + "g Carbs: "
                                        + food.getCarbs() + "g Fats: " + food.getFats() + "g\n" + food.getDescription());
                                index++;
                            }
                            break;
                    }
                }while (secondUserInput != 5);
            }
            else if (userInput == 2) {
                System.out.println("Let's get some user input first!");
                System.out.println("Enter client name");
                String name = input.next();
                System.out.println("Enter age");
                int age = input.nextInt();
                System.out.println("Enter weight");
                double weight = input.nextDouble();
                System.out.println("Enter height");
                double height = input.nextDouble();
                input.nextLine();
                System.out.println("Enter gender (male/female)");
                String gender = input.nextLine();
                System.out.println("Enter activity level (little/light/medium/hard/intense)");
                String activity = input.nextLine();
                System.out.println("Meal plan type (keto/fat loss/bulking)");
                String mealPlanType = input.nextLine();
                Client client = new Client(name, age, weight, height, gender, activity, mealPlanType);
                MealPlanFactory mealPlanFactory = new MealPlanFactory();
                mealPlanFactory.createMealPlan(client);
                System.out.println(mealPlanFactory);
                mealPlanFactory.createMeals(6);
            }
        }while (userInput != 3);
    }


    /**
     * Main Menu to display options to user
     * @return String representing main menu
     */
    public static String mainMenu() {
        String menu = "\nWelcome to Meal Plan Generator!\n1) Custom Meal Plan\n2) Generate Meal Plan\n3) Exit";
        return menu;
    }

    /**
     * Menu for customizing meal plan
     * @return String of menu options
     */
    public static String customMealPlanMenu() {
        String menu = "1) Protein\n2) Carbs\n3) Fats\n4) Enter Meal\n5) Exit";
        return menu;
    }

    public static String proteinMenu() {
        String menu = "1) Chicken Breast\n2) Lean Ground Turkey\n3) White Fish\n4) Lean Beef\n5) Whole Egg\n6) Exit";
        return menu;
    }

    public static String carbMenu() {
        String menu = "1) Oatmeal\n2) White Rice\n3) Brown Rice\n4) Potato\n5) Exit";
        return menu;
    }

    public static String fatMenu() {
        String menu = "1) Peanut Butter\n2) Olive Oil\n3) Avocado\n4) Cashews\n5) Exit";
        return menu;
    }

}
