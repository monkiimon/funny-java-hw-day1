public class IBWCalculator extends HealthAssessment {
    public IBWCalculator(String gender, double weight, double height, Integer age) {
        super(gender, weight, height, age);
    }

    @Override
    public double calculate() {
        double heightInInches = height / 2.54;
        if (gender.equals("male")) {
            return 50 + 2.3 * (heightInInches - 60);
        } else {
            return 45.5 + 2.3 * (heightInInches - 60);
        }
    }

    @Override
    public String assess() {
        return "Based on your height and gender, this is your ideal weight.";
    }

    @Override
    public void printResult() {
        System.out.printf("IBW: %.2f kg%n", calculate());
    }

    @Override
    public void printDetails() {
        System.out.printf("[DETAILS] IBW for %s with height: %.1f cm%n", gender, height);
    }

    @Override
    public void recordData() {
        System.out.printf("[RECORD] IBW %.2f stored.%n", calculate());
    }
}
