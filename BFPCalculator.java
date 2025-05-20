public class BFPCalculator extends HealthAssessment {
    public BFPCalculator(String gender, double weight, double height, Integer age) {
        super(gender, weight, height, age);
    }

    @Override
    public double calculate() {
        double bmi = weight / Math.pow(height / 100.0, 2);
        int genderValue = gender.equals("male") ? 1 : 0;
        return (1.20 * bmi) + (0.23 * age) - (10.8 * genderValue) - 5.4;
    }

    @Override
    public String assess() {
        double bfp = calculate();
        if (gender.equals("male")) {
            if (bfp < 6) return "Essential fat";
            else if (bfp < 14) return "Athletes";
            else if (bfp < 18) return "Fitness";
            else if (bfp < 25) return "Acceptable";
            else return "Obese";
        } else {
            if (bfp < 14) return "Essential fat";
            else if (bfp < 21) return "Athletes";
            else if (bfp < 25) return "Fitness";
            else if (bfp < 32) return "Acceptable";
            else return "Obese";
        }
    }

    @Override
    public void printResult() {
        System.out.printf("BFP: %.2f%% (%s)%n", calculate(), assess());
    }

    @Override
    public void printDetails() {
        System.out.printf("[DETAILS] BFP for %s, age: %d%n", gender, age);
    }

    @Override
    public void recordData() {
        System.out.printf("[RECORD] BFP %.2f%% (%s) saved.%n", calculate(), assess());
    }
}
