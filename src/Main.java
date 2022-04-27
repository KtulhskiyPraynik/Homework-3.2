public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weightKg = 60;
        float heightM = (float) 1.7;
        int index = service.calculate(weightKg, heightM);
        System.out.println("Индекс массы тела: " + index + " кг/м^2");
    }
}
