package LopString;

import java.util.Scanner;

public class DemChuoiCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap str1 :");
        String str1 = sc.nextLine();
        System.out.println("Nhap str2 :");
        String str2 = sc.nextLine();
        if (str1.length() < str2.length()) {
            System.out.println("Nhap sai dieu kien");
        } else {
            int count = demChuoi(str1, str2);
            System.out.println(str2 + " xuất hiện " + count + " lần trong chuỗi " + str1);
        }
        sc.close();
    }

    private static int demChuoi(String str1, String str2) {
        int count = 0;
        int index = str1.indexOf(str2);
        while (index != -1) {
            count++;
            index = str1.indexOf(str2, index + 1);
        }
        return count;
    }
}
