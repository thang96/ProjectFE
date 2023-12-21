package SoNguyenTo;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        // Nhập số nguyên N từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        // Kiểm tra xem N có phải là số nguyên tố hay không
        boolean laSoNguyenTo = kiemTraSoNguyenTo(N);

        if (laSoNguyenTo) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không là số nguyên tố.");
        }

        // Hiển thị tất cả các số nguyên tố từ 1 đến N
        System.out.println("Các số nguyên tố từ 1 đến " + N + " là:");
        hienThiSoNguyenTo(N);

        // Đóng scanner
        scanner.close();
    }

    // Phương thức kiểm tra số nguyên tố
    public static boolean kiemTraSoNguyenTo(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Phương thức hiển thị tất cả các số nguyên tố từ 1 đến N
    public static void hienThiSoNguyenTo(int N) {
        for (int i = 2; i <= N; i++) {
            if (kiemTraSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
