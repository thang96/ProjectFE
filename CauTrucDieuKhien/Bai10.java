package CauTrucDieuKhien;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số tiền cần rút");
        int soTienCanRut = scanner.nextInt();

        if (soTienCanRut <= 0 || soTienCanRut > 20000000 || soTienCanRut % 50000 != 0) {
            System.out.println("Số tiền không hợp lệ.");
        } else {
            int soTo500k = soTienCanRut / 500000;
            int soTo200k = (soTienCanRut % 500000) / 200000;
            int soTo100k = ((soTienCanRut % 500000) % 200000) / 100000;
            int soTo50k = (((soTienCanRut % 500000) % 200000) % 100000) / 50000;

            System.out.println("Số tờ 500,000 đồng: " + soTo500k);
            System.out.println("Số tờ 200,000 đồng: " + soTo200k);
            System.out.println("Số tờ 100,000 đồng: " + soTo100k);
            System.out.println("Số tờ 50,000 đồng: " + soTo50k);
        }
        scanner.close();
    }
}
