package BaiTapVongLap;
import java.util.Scanner;

public class SoGiamDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();
        String strN = Integer.toString(N);
        boolean isDecreasing = true;

        for (int i = 1; i < strN.length(); i++) {
            // Lấy chữ số hiện tại và chữ số trước đó
            int currentDigit = Character.getNumericValue(strN.charAt(i));
            int previousDigit = Character.getNumericValue(strN.charAt(i - 1));

            // Kiểm tra nếu chữ số hiện tại không nhỏ hơn chữ số trước đó
            if (currentDigit >= previousDigit) {
                isDecreasing = false;
                break;
            }
        }

        if (isDecreasing) {
            System.out.println("Các chữ số của " + N + " giảm dần từ trái sang phải.");
        } else {
            System.out.println("Các chữ số của " + N + " không giảm dần từ trái sang phải.");
        }

        scanner.close();
    }
}
