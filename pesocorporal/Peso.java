
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Peso {
 
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
            double index = weight / (height * height);
            if (index < 18.5) {
                System.out.println("Underweight: BMI < 18.5");
            } else if (index >= 18.5 && index < 25) {
                System.out.println("Normal: 18.5 <= BMI < 25");
            } else if (index >= 24.9 && index < 30) {
                System.out.println("Overweight: 25 <= BMI < 30");
            } else if (index >= 30) {
                System.out.println("Obese: BMI >= 30");
            }
        }
    }
}
