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
                System.out.println(customMealPlanMenu());
                int secondUserInput = input.nextInt();
                Meal meal = null;

                // Determine what type of macro to choose from
                switch (secondUserInput) {
                    case 1:
                        System.out.println(proteinMenu());
                        int proteinInput = input.nextInt();
                        System.out.println("Amount(oz): ");
                        double proteinAmount = input.nextDouble();
                        ProteinFactory proteinFactory = new ProteinFactory();
                        meal = proteinFactory.addProtein(proteinInput, proteinAmount);
                        System.out.println("Meal: " + meal.getDescription() + "\nProtein: " + meal.getProtein() + "g\nCarbs: " + meal.getCarbs() + "g\nFats: " + meal.getFats() + "g");
                        break;
                    case 2:
                        System.out.println(carbMenu());
                        int carbInput = input.nextInt();
                        System.out.println("Amount(1/4 cups): ");
                        double carbAmount = input.nextDouble();
                        CarbFactory carbFactory = new CarbFactory();
                        meal = carbFactory.addCarbs(carbInput, carbAmount);
                        System.out.println("Meal: " + meal.getDescription() + "\nProtein: " + meal.getProtein() + "g\nCarbs: " + meal.getCarbs() + "g\nFats: " + meal.getFats() + "g");
                        break;
                    case 3:
                        System.out.println(fatMenu());
                        break;
                }
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
            }
        }while (userInput != 3);

        Meal meal_1 = new Oatmeal(new Chicken(new PlainMeal(), 4.0), 1);
        System.out.println("Meal 1: " + meal_1.getDescription() + "\nProtein: " + meal_1.getProtein() + "g\nCarbs: " + meal_1.getCarbs() + "g\nFats: " + meal_1.getFats() + "g");
    }


    /**
     * Main Menu to display options to user
     * @return String representing main menu
     */
    public static String mainMenu() {
        String menu = "Welcome to Meal Plan Generator!\n1) Custom Meal Plan\n2) Generate Meal Plan\n3) Exit";
        return menu;
    }

    /**
     * Menu for customizing meal plan
     * @return String of menu options
     */
    public static String customMealPlanMenu() {
        String menu = "1) Protein\n2) Carbs\n3) Fats\n4) Exit";
        return menu;
    }

    public static String proteinMenu() {
        String menu = "1) Chicken Breast\n2) Lean Ground Turkey\n3) White Fish\n4) Lean Beef\n5) Exit";
        return menu;
    }

    public static String carbMenu() {
        String menu = "1) Oatmeal\n2) White Rice\n3) Brown Rice\n4) Potato\n5) Exit";
        return menu;
    }

    public static String fatMenu() {
        String menu = "1) Peanut Butter\n2) Olive Oil\n3) Avocado\n4) Nuts\n5) Exit";
        return menu;
    }

}
