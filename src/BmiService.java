public class BmiService {
    public double bmiCalculate (int bodyMass, float height){
        double bodyMassIndex = bodyMass/Math.pow(height,2);
        return bodyMassIndex;
    }

}
