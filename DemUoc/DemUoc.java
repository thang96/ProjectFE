package DemUoc;

import java.util.Scanner;

public class DemUoc {
    public static void main(String[] args) {
        // Nhập số nguyên N từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        // Kiểm tra N có phải là số nguyên dương hay không
        if (N <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            // Đếm số lượng ước và tính tổng các ước
            int demUoc = 0;
            int tongUoc = 0;

            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    demUoc++;
                    tongUoc += i;
                }
            }

            // In kết quả
            System.out.println("Số lượng ước của " + N + " là: " + demUoc);
            System.out.println("Tổng các ước của " + N + " là: " + tongUoc);
        }

        // Đóng scanner
        scanner.close();
    }
}
