package SoNghichDao;

import java.util.Scanner;

public class SoNgichDao {
    public static void main(String[] args) {
        // Nhập số nguyên N từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        // Hiển thị số nghịch đảo của N
        int soNghichDao = tinhSoNghichDao(N);
        System.out.println("Số nghịch đảo của " + N + " là: " + soNghichDao);

        // Đóng scanner
        scanner.close();
    }

    // Phương thức tính số nghịch đảo
    public static int tinhSoNghichDao(int N) {
        int soNghichDao = 0;

        while (N != 0) {
            int digit = N % 10;
            soNghichDao = soNghichDao * 10 + digit;
            N /= 10;
        }

        return soNghichDao;
    }
}
