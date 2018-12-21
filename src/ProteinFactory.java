public class ProteinFactory {

    public Meal addProtein(int proteinType, double amount) {

        if (proteinType == 1)
            return new Chicken(new PlainMeal(), amount);

        else if (proteinType == 2)
            return new GroundTurkey(new PlainMeal(), amount);

        else return null;
    }
}
