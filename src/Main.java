public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.bmiCalculate(80, 1.7F);
        System.out.printf("%.2f", bodyMassIndex);
    }
}
