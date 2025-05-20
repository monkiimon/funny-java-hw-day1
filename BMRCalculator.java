public class BMRCalculator extends HealthAssessment {
    public BMRCalculator(String gender, double weight, double height, Integer age) {
        super(gender, weight, height, age);
    }

    @Override
    public double calculate() {
        if (gender.equals("male")) {
            return 10 * weight + 6.25 * height - 5 * age + 5;
        } else {
            return 10 * weight + 6.25 * height - 5 * age - 161;
        }
    }

    @Override
    public String assess() {
        return "BMR indicates your basic daily energy expenditure.";
    }

    @Override
    public void printResult() {
        System.out.printf("BMR: %.2f kcal/day%n", calculate());
    }

    @Override
    public void printDetails() {
        System.out.printf("[DETAILS] BMR Calculation for %s, age %d%n", gender, age);
    }

    @Override
    public void recordData() {
        System.out.printf("[RECORD] BMR %.2f recorded.%n", calculate());
    }
}
