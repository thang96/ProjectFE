package CauTrucDieuKhien;


import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.printf("Ket qua x = %.2f%n", x);
            } else if (c == 0) {
                System.out.print("Phuong trinh vo so nghiem\n");
            } else {
                System.out.print("Phuong trinh vo nghiem\n");
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.print("Phuong trinh vo nghiem\n");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phuong trinh co nghiem kep x = %.2f%n", x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phuong trinh co 2 nghiem phan biet : x1 = %.2f%n, x2 = %.2f%n", x1, x2);
            }
        }
        sc.close();
    }
}
