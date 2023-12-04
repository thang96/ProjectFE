package HomeWork;

public class voidBMI {
    public static void main(String[] args) {
        double canNang = 75.0; 
        double chieuCao = 1.70; 

        tinhChiSoBMI(canNang, chieuCao);
    }

    public static void tinhChiSoBMI(double canNang, double chieuCao) {
        double bmi = canNang / (chieuCao * chieuCao);
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
}
