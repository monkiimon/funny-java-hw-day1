// --- Main.java ---
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Health Calculator CLI ===");

        // Validate gender
        String gender = "";
        while (true) {
            System.out.print("Gender (male/female): ");
            gender = sc.nextLine().trim().toLowerCase();
            if (gender.equals("male") || gender.equals("female")) break;
            System.out.println("Invalid input. Please enter 'male' or 'female'.");
        }

        // Validate weight
        double weight = 0;
        while (true) {
            System.out.print("Weight (kg): ");
            if (sc.hasNextDouble()) {
                weight = sc.nextDouble();
                if (weight > 0) break;
                else System.out.println("Weight must be greater than 0.");
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }

        // Validate height
        double height = 0;
        while (true) {
            System.out.print("Height (cm): ");
            if (sc.hasNextDouble()) {
                height = sc.nextDouble();
                if (height > 0) break;
                else System.out.println("Height must be greater than 0.");
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }

        // Validate age
        Integer age = 0;
        while (true) {
            System.out.print("Age: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                if (age > 0) break;
                else System.out.println("Age must be greater than 0.");
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                sc.next();
            }
        }

        System.out.println("--- Results ---");
        System.out.println("BMR = Basal Metabolic Rate (พลังงานที่ร่างกายใช้ขณะพัก)");
        System.out.println("BMI = Body Mass Index (ดัชนีมวลกาย ใช้ประเมินความอ้วน)");
        System.out.println("IBW = Ideal Body Weight (น้ำหนักตัวที่เหมาะสมตามส่วนสูงและเพศ)");
        System.out.println("BFP = Body Fat Percentage (เปอร์เซ็นต์ไขมันในร่างกาย)");
        System.out.println();

        List<HealthAssessment> assessments = Arrays.asList(
            new BMRCalculator(gender, weight, height, age),
            new BMICalculator(gender, weight, height, age),
            new IBWCalculator(gender, weight, height, age),
            new BFPCalculator(gender, weight, height, age)
        );

        for (HealthAssessment assessment : assessments) {
            assessment.printResult();
            System.out.println("Assessment: " + assessment.assess());
            assessment.printDetails();
            assessment.recordData();
            System.out.println();
        }

        sc.close();
    }
}
