

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        if (a != 0) {
            double x = -b / a;
            System.out.printf("Ket qua x = %.2f%n", x);
        } else if (b == 0) {
            System.out.print("Phuong trinh vo so nghiem\n");
        } else {
            System.out.print("Phuong trinh vo nghiem\n");
        }
        sc.close();
    }
}