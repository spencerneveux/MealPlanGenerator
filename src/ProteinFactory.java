public class ProteinFactory {

    public Meal addProtein(int proteinType, double amount, Meal meal) {

        if (proteinType == 1)
            return new Chicken(meal, amount);
        else if (proteinType == 2)
            return new GroundTurkey(meal, amount);
        else if (proteinType == 3)
            return new WhiteFish(meal, amount);
        else if (proteinType == 4)
            return new Beef(meal, amount);
        else if (proteinType == 5)
            return new WholeEgg(meal, amount);
        else return null;
    }
}
