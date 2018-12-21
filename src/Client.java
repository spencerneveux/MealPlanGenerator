public class Client {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String gender;
    private String activityLevel;
    private String mealPlanType;

    public Client() {}

    public Client(String name, int age, double weight, double height, String gender, String activityLevel, String mealPlanType) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.activityLevel = activityLevel;
        this.mealPlanType = mealPlanType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getMealPlanType() {
        return mealPlanType;
    }

    public void setMealPlanType(String mealPlanType) {
        this.mealPlanType = mealPlanType;
    }

    /**
     * Method to increase client weight
     * @param amount of weight to increase by
     */
    public void increaseWeight(double amount) {
        this.weight += amount;
    }

    /**
     * Method to decrease client weight
     * @param amount of weight do decrease by
     */
    public void decreaseWeight(double amount) {
        this.weight -= amount;
    }

    @Override
    public String toString() {
        return ("Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nHeight: " + height + "\nGender: " + gender
                + "\nActivity Level: " + activityLevel);
    }
}
