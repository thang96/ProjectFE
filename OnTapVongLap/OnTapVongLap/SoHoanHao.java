package OnTapVongLap;
import java.util.Scanner;

public class SoHoanHao {
    public static void main(String[] args) {
        // Nhập số nguyên N từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        // Kiểm tra xem N có phải là số hoàn hảo hay không
        boolean laSoHoanHao = kiemTraSoHoanHao(N);

        if (laSoHoanHao) {
            System.out.println(N + " là số hoàn hảo.");
        } else {
            System.out.println(N + " không là số hoàn hảo.");
        }

        // Đóng scanner
        scanner.close();
    }

    // Phương thức kiểm tra số hoàn hảo
    public static boolean kiemTraSoHoanHao(int N) {
        if (N <= 0) {
            return false;
        }

        int tongUoc = 0;

        // Lặp từ 1 đến N/2 để kiểm tra ước
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                tongUoc += i;
            }
        }

        // Kiểm tra tổng ước có bằng chính N hay không
        return tongUoc == N;
    }
}
