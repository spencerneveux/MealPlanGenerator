public class CarbFactory {

    public Meal addCarbs(int carbType, double amount) {

        if (carbType == 1)
            return new Oatmeal(new PlainMeal(), amount);

        else if (carbType == 2)
            return new GroundTurkey(new PlainMeal(), amount);

        else return null;
    }
}