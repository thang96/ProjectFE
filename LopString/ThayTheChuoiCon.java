package LopString;

import java.util.Scanner;

public class ThayTheChuoiCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap str1 :");
        String str1 = sc.nextLine();
        System.out.println("Nhap str2 :");
        String str2 = sc.nextLine();
        System.out.println("Nhap str3 :");
        String str3 = sc.nextLine();
        if (!str1.contains(str2)) {
            System.out.println("Nhap sai");
        } else {
            String result = str1.replace(str2, str3);
            System.out.println(result);
        }
        sc.close();
    }
}
