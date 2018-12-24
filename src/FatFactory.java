public class FatFactory {

    public Meal addFat(int proteinType, double amount, Meal meal) {

        if (proteinType == 1)
            return new PeanutButter(meal, amount);
        else if (proteinType == 2)
            return new OliveOil(meal, amount);
        else if (proteinType == 3)
            return new Avocado(meal, amount);
        else if (proteinType == 4)
            return new Cashews(meal, amount);
        else return null;
    }
}
