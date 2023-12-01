package Buoi3;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nam : ");
        int n = sc.nextInt();
        if (isYear(n)) {
            if( (n%4 == 0 && n%100 !=0) || n%400 == 0 ){
            System.out.printf("%d la nam nhuan", n);
        }
        else{
            System.out.println("Khong phai nam nhuan\n");
        }
        }else{
            System.out.println("Khong dung dinh dang\n");
        }
        sc.close();
    }
    private static boolean isYear(int year) {
        return 1000 <= year && year <= 9999;
    }
}
