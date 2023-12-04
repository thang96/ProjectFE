package HomeWork;

public class truyenThamSoBMI {
    public static void main(String[] args) {
        double canNang = 75.0; 
        double chieuCao = 1.7; 

        double bmi = calculateBMI(canNang, chieuCao);
        System.out.println("Chỉ số BMI của bạn là: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Gầy");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Bình thường");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Hơi béo");
        } else {
            System.out.println("Béo phì");
        }
    }

    public static double calculateBMI(double canNang, double chieuCao) {
        return canNang / (chieuCao * chieuCao);
    }
}
