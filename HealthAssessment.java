public abstract class HealthAssessment extends Health implements Calculable, Assessable, Printable {
    public HealthAssessment(String gender, double weight, double height, Integer age) {
        super(gender, weight, height, age);
    }

    public abstract double calculate();
    public abstract void printResult();
    public abstract String assess();
    public abstract void printDetails();
    public abstract void recordData();
}
