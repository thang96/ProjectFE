package CauTrucDieuKhien.Bai11;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        // Nhập số nguyên N từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        // Tính tổng các số chẵn từ 1 đến N
        int tongChan = tinhTongChan(N);
        System.out.println("Tổng các số chẵn từ 1 đến " + N + " là: " + tongChan);

        // Tính tổng các số lẽ từ 1 đến N
        int tongLe = tinhTongLe(N);
        System.out.println("Tổng các số lẽ từ 1 đến " + N + " là: " + tongLe);

        // Tính tích của các số chẵn từ 1 đến N
        long tichChan = tinhTichChan(N);
        System.out.println("Tích của các số chẵn từ 1 đến " + N + " là: " + tichChan);

        // Tính tích của các số lẽ từ 1 đến N
        long tichLe = tinhTichLe(N);
        System.out.println("Tích của các số lẽ từ 1 đến " + N + " là: " + tichLe);

        // Đóng scanner
        scanner.close();
    }

    // Phương thức tính tổng các số chẵn
    public static int tinhTongChan(int N) {
        int tongChan = 0;
        for (int i = 2; i <= N; i += 2) {
            tongChan += i;
        }
        return tongChan;
    }

    // Phương thức tính tổng các số lẽ
    public static int tinhTongLe(int N) {
        int tongLe = 0;
        for (int i = 1; i <= N; i += 2) {
            tongLe += i;
        }
        return tongLe;
    }

    // Phương thức tính tích các số chẵn
    public static long tinhTichChan(int N) {
        long tichChan = 1;
        for (int i = 2; i <= N; i += 2) {
            tichChan *= i;
        }
        return tichChan;
    }

    // Phương thức tính tích các số lẽ
    public static long tinhTichLe(int N) {
        long tichLe = 1;
        for (int i = 1; i <= N; i += 2) {
            tichLe *= i;
        }
        return tichLe;
    }
}
