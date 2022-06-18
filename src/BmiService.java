public class BmiService {

    public double calculate(int weight, double height) {

        double heightInSquare = Math.pow(height, 2);

        double bmi = weight / heightInSquare;

        return bmi;

    }
}
