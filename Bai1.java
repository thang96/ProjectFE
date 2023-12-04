
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        if (a > b) {
            System.out.printf("Max number is : %d\n",a);
        } else {
            System.out.printf("Max number is : %d\n",b);
        }
        sc.close();
    }
}
