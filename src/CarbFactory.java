public class CarbFactory {

    public Meal addCarbs(int carbType, double amount, Meal meal) {
        if (carbType == 1)
            return new Oatmeal(meal, amount);
        else if (carbType == 2)
            return new WhiteRice(meal, amount);
        else if (carbType == 3)
            return new BrownRice(meal, amount);
        else if (carbType == 4)
            return new Potato(meal, amount);
        else return null;
    }
}