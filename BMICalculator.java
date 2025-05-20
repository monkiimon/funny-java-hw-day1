public class BMICalculator extends HealthAssessment {
    public BMICalculator(String gender, double weight, double height, Integer age) {
        super(gender, weight, height, age);
    }

    @Override
    public double calculate() {
        return weight / Math.pow(height / 100.0, 2);
    }

    @Override
    public String assess() {
        double bmi = calculate();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    @Override
    public void printResult() {
        System.out.printf("BMI: %.2f (%s)%n", calculate(), assess());
    }

    @Override
    public void printDetails() {
        System.out.printf("[DETAILS] BMI for %s, weight: %.1fkg, height: %.1fcm%n", gender, weight, height);
    }

    @Override
    public void recordData() {
        System.out.printf("[RECORD] BMI %.2f (%s) saved.%n", calculate(), assess());
    }

    public double calculateBMI() {
        return calculate();
    }
}
