public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 88; // масса тела в кг
        double h = 1.85; // рост в метрах
        double bmi = service.calculate(m, h);
        System.out.printf("Индекс массы тела = " + "%.1f", bmi);
        System.out.println();
        System.out.println("Результат: ");
        if (bmi < 16) {
            System.out.println("Дефицит массы тела (истощение)");
        } else if (bmi >= 16 & bmi <= 18.5) {
            System.out.println("Недостаточная масса тела (дефицит)");
        } else if (bmi >= 18.6 & bmi <= 24.9) {
            System.out.println("Норма");
        } else if (bmi >= 25 & bmi <= 29.9) {
            System.out.println("Лишний вес (предожирение)");
        } else if (bmi >= 30 & bmi <= 34.9) {
            System.out.println("Ожирение 1й степени");
        } else if (bmi >= 35 & bmi <= 39.9) {
            System.out.println("Ожирение 2й степени");
        } else if (bmi > 40) {
            System.out.println("Ожирение 3й степени");
        }
    }

}
