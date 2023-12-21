package BaiTapVongLap;

import java.util.Scanner;

public class SoLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương N: ");
        int N = scanner.nextInt();

        if (N > 0) {
            int maxDigit = findMaxDigit(N);

            System.out.println("Chữ số lớn nhất trong N là: " + maxDigit);
        } else {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        }

        scanner.close();
    }

    private static int findMaxDigit(int number) {
        int maxDigit = 0;

        while (number > 0) {
            int digit = number % 10;  
            maxDigit = Math.max(maxDigit, digit);  
            number /= 10;  
        }

        return maxDigit;
    }
}
