import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập chiều dài cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập chiều dài cạnh c: ");
        double c = scanner.nextDouble();
        String loaiTamGiac = kiemTraLoaiTamGiac(a, b, c);
        System.out.println("Loại tam giác: " + loaiTamGiac);
        scanner.close();
    }

    public static String kiemTraLoaiTamGiac(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return "Không phải là tam giác";
        } else if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a == b || b == c || a == c) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                return "Tam giác vuông cân";
            } else {
                return "Tam giác cân";
            }
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "Tam giác vuông";
        } else {
            return "Tam giác thường";
        }
    }
}
