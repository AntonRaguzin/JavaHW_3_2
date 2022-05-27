public class BmiService {
    public double calculate(int m, double h) {
        double bmi = m / (h * h);
        return bmi;
    }
}
