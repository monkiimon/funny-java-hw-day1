public abstract class Health {
    protected String gender;
    protected double weight;
    protected double height;
    protected Integer age;

    public Health(String gender, double weight, double height, Integer age) {
        this.gender = gender.toLowerCase();
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public abstract void recordData();
}
