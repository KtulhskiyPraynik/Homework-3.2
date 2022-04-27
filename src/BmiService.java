public class BmiService {
    public int calculate(float weightKg, float heightM) {
        int index = (int) (weightKg / (heightM * heightM));
        return index;
    }
}
