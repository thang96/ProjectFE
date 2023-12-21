package CauTrucDieuKhien;


import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào một số nguyên dương N: ");
            while (!sc.hasNextInt()) {
                System.out.print("Vui lòng nhập một số nguyên dương.");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        if (laNguyenDuong(n)) {
            System.out.print(n + " là số nguyên tố.");
        } else {
            System.out.print(n + " không là số nguyên tố.");
        }
        sc.close();
    }

    private static boolean laNguyenDuong(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
