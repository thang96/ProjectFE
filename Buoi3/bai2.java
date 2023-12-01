package Buoi3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int max;
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Nhap c: ");
        c = sc.nextInt();
        max = a;
        if (max < b) {
            max = b;
        } else if (max < c) {
            max = c;
        }
        System.out.printf("Max number is: %d\n", max);
        sc.close();
    }
}
