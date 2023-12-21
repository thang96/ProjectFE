package CauTrucDieuKhien;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm bài kiểm tra: ");
        double diemBaiKT = scanner.nextDouble();
        System.out.print("Nhập điểm thi giữa kỳ: ");
        double diemThiGiuaKy = scanner.nextDouble();
        System.out.print("Nhập điểm thi cuối kỳ: ");
        double diemThiCuoiKy = scanner.nextDouble();
        double diemTrungBinh = tinhDiemTrungBinh(diemBaiKT, diemThiGiuaKy, diemThiCuoiKy);
        String xepHang = xepHangHocLuc(diemTrungBinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("Xếp hạng học lực: " + xepHang);
        scanner.close();
    }

    public static double tinhDiemTrungBinh(double diemBaiKT, double diemThiGiuaKy, double diemThiCuoiKy) {
        return (diemBaiKT + diemThiGiuaKy + diemThiCuoiKy) / 3;
    }

    public static String xepHangHocLuc(double diemTrungBinh) {
        if (diemTrungBinh >= 9.0) {
            return "Hạng A";
        } else if (diemTrungBinh >= 7.0) {
            return "Hạng B";
        } else if (diemTrungBinh >= 5.0) {
            return "Hạng C";
        } else {
            return "Hạng F";
        }
    }
}
